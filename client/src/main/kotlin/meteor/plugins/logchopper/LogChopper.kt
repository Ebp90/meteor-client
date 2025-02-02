package meteor.plugins.logchopper

import eventbus.events.GameTick
import meteor.api.items.Items
import meteor.plugins.Plugin
import meteor.plugins.PluginDescriptor
import net.runelite.api.*
import net.runelite.api.coords.WorldArea
import net.runelite.api.coords.WorldPoint
import net.runelite.api.queries.GameObjectQuery


@PluginDescriptor(name = "Log Chopper", description = "Chops down trees", enabledByDefault = false)
class LogChopper : Plugin() {
    val config = configuration<LogChopperConfig>()
    val objects = meteor.api.objects.Objects
    var currentTree = 0
    val trees = listOf(NullObjectID.NULL_30482, NullObjectID.NULL_30480, NullObjectID.NULL_30481)
    var area: WorldArea = WorldArea( WorldPoint(3695, 3801,0), WorldPoint(3748, 3839,0))
    override fun onGameTick(it: GameTick) {

        if (client.localPlayer?.isIdle == true) {
            when (config.type()) {
                LogChopperConfig.LogType.Teak -> processBoth()
                LogChopperConfig.LogType.Mahogany -> processBoth()
                else -> processNormal()
            }
        }
    }

    private fun processBoth() {
        if (client.localPlayer?.worldLocation!!.isInArea(area)) {
            processPatches()
        } else processNormal()
    }

    private fun processPatches() {
        if (isFull()) {
            if (config.trees() == LogChopperConfig.MethodType.Drop) {
                dropLogs()
            } else {
                if (client.localPlayer?.worldLocation!!.y > 3823) obstacleOut()
                else if (bankOpen()) {
                    depositLogs()
                } else useNullBank()
            }
        } else {
            if (client.localPlayer?.worldLocation!!.y < 3823) {
                return obstacleIn()
            }
            if (!chopMahogany(trees[currentTree])) currentTree = (currentTree + 1) % trees.size
        }
    }

    private fun processNormal() {
        when (config.trees()) {
            LogChopperConfig.MethodType.Bank -> {
                if (!client.localPlayer?.isAnimating!! && !client.localPlayer?.isMoving!! && !isFull()) {
                    chopTree()
                } else if (isFull()) {
                    useBank()
                }
                if (bankOpen()) {
                    depositLogs()
                }
            }
            LogChopperConfig.MethodType.Drop -> {
                if (!client.localPlayer?.isAnimating!! && !client.localPlayer?.isMoving!!) {
                    chopTree()
                }
                dropLogs()
            }
        }
    }

    private fun isFull(): Boolean {
        return Items.isFull()
    }

    private fun bankOpen(): Boolean {
        return client.getItemContainer(InventoryID.BANK) != null
    }

    private fun depositLogs() {
        val logs = Items.getFirst(config.type().logID)
        if (logs != null) {
            Items.deposit(logs, 28)
        }
    }

    private fun dropLogs() {
        val logs = Items.getAll(config.type().logID)
        logs?.forEach { it.drop() }
    }

    private fun chopTree() {
        val tree = objects.getFirst(config.type().treeID)
        tree?.interact("Chop down")
    }

    private fun useBank() {
        objects.getFirst("Bank chest")?.interact("Use")
        objects.getFirst("Bank booth")?.interact("Bank")
    }

    private fun obstacleIn() {
        val ob1 = objects.getFirst(ObjectID.HOLE_31481)
        ob1?.interact("Climb through")
    }

    private fun obstacleOut() {
        val ob1 = objects.getFirst(ObjectID.HOLE_31482)
        ob1?.interact("Climb through")
    }

    private fun getGameObject(id: Int): GameObject? {
        return GameObjectQuery().idEquals(id).result(client).nearestTo(client.localPlayer)
    }

    private fun chopMahogany(id: Int): Boolean {
        val comp = client.getObjectDefinition(id)
        val imposter = comp.impostor ?: return false
        if (imposter.actions.contains("Chop down")) {
            val obj = getGameObject(id) ?: return false
            client.invokeMenuAction(
                "Chop down", "Mahogany tree", id, 3, obj.sceneMinLocation.x, obj.sceneMinLocation.y
            )
            return true
        }
        return false
    }

    private fun useNullBank() {
        val obj = getGameObject(31427) ?: return
        client.invokeMenuAction(
            "Use", null, 31427, MenuAction.GAME_OBJECT_FIRST_OPTION.id, obj.sceneMinLocation.x, obj.sceneMinLocation.y
        )
    }
}