import java.io.IOException;
import java.util.concurrent.Callable;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class20 implements Callable {
   @ObfuscatedName("sr")
   @ObfuscatedSignature(
      descriptor = "Lep;"
   )
   static ClanSettings guestClanSettings;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lac;"
   )
   public static class51 pcmPlayerProvider;
   @ObfuscatedName("am")
   static java.awt.Font fontHelvetica13;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lj;"
   )
   final class10 field60;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Ln;"
   )
   @ObfuscatedName("this$0")
   final class14 this$0;

   @ObfuscatedSignature(
      descriptor = "(Ln;Lj;)V"
   )
   class20(class14 var1, class10 var2) {
      this.this$0 = var1;
      this.field60 = var2;
   }

   @ObfuscatedName("call")
   public Object call() throws Exception {
      try {
         while(this.field60.method37()) {
            class12.method44(10L);
         }
      } catch (IOException var2) {
         return new class21("Error servicing REST query: " + var2.getMessage());
      }

      return this.field60.method38();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-779759676"
   )
   static int method71(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZB)I",
      garbageValue = "114"
   )
   static int method73(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == 4200) {
         var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = NPCComposition.ItemDefinition_get(var3).name;
         return 1;
      } else {
         int var4;
         ItemComposition var5;
         if (var0 == 4201) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var5 = NPCComposition.ItemDefinition_get(var3);
            if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            class87.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            var5 = NPCComposition.ItemDefinition_get(var3);
            if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).price;
            return 1;
         } else if (var0 == 4204) {
            var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
            return 1;
         } else {
            ItemComposition var6;
            if (var0 == 4205) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var6 = NPCComposition.ItemDefinition_get(var3);
               if (var6.noteTemplate == -1 && var6.note >= 0) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.note;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == 4206) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var6 = NPCComposition.ItemDefinition_get(var3);
               if (var6.noteTemplate >= 0 && var6.note >= 0) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.note;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == 4207) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var6 = NPCComposition.ItemDefinition_get(var3);
               if (var6.placeholderTemplate == -1 && var6.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == 4209) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var6 = NPCComposition.ItemDefinition_get(var3);
               if (var6.placeholderTemplate >= 0 && var6.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == 4210) {
               String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var4 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               class298.findItemDefinitions(var7, var4 == 1);
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ScriptEvent.foundItemIdCount;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  UserComparator6.foundItemIndex = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var4 = NPCComposition.ItemDefinition_get(var3).getShiftClickIndex();
                  if (var4 == -1) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4;
                  } else {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).maleModel;
                  return 1;
               } else if (var0 == 4215) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).maleModel1;
                  return 1;
               } else if (var0 == 4216) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).maleModel2;
                  return 1;
               } else if (var0 == 4217) {
                  var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var6 = NPCComposition.ItemDefinition_get(var3);
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.field1736;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class19.foundItemIds != null && UserComparator6.foundItemIndex < ScriptEvent.foundItemIdCount) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class19.foundItemIds[++UserComparator6.foundItemIndex - 1] & '\uffff';
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      descriptor = "(Lga;IIIS)V",
      garbageValue = "-29230"
   )
   static void method72(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && StructComposition.clientPreferences.getAreaSoundEffectsVolume() != 0) {
         if (var0.animMayaFrameSounds != null && var0.animMayaFrameSounds.containsKey(var1)) {
            int var4 = (Integer)var0.animMayaFrameSounds.get(var1);
            if (var4 != 0) {
               int var7 = var4 >> 8;
               int var8 = var4 >> 4 & 7;
               int var9 = var4 & 15;
               Client.soundEffectIds[Client.soundEffectCount] = var7;
               Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
               Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
               Client.soundEffects[Client.soundEffectCount] = null;
               int var10 = (var2 - 64) / 128;
               int var11 = (var3 - 64) / 128;
               Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16);
               ++Client.soundEffectCount;
            }

         }
      }
   }
}
