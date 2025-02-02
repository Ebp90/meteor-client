import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
   @ObfuscatedName("h")
   final int element;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   final WorldMapLabel label;
   @ObfuscatedName("v")
   final int subWidth;
   @ObfuscatedName("x")
   final int subHeight;

   @ObfuscatedSignature(
      descriptor = "(Lky;Lky;ILii;)V"
   )
   WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
      super(var1, var2);
      this.element = var3;
      this.label = var4;
      WorldMapElement var5 = JagexCache.WorldMapElement_get(this.getElement());
      SpritePixels var6 = var5.getSpriteBool(false);
      if (var6 != null) {
         this.subWidth = var6.subWidth;
         this.subHeight = var6.subHeight;
      } else {
         this.subWidth = 0;
         this.subHeight = 0;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2098413555"
   )
   public int getElement() {
      return this.element;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Lii;",
      garbageValue = "849546905"
   )
   WorldMapLabel getLabel() {
      return this.label;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-520723785"
   )
   int getSubWidth() {
      return this.subWidth;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1290081241"
   )
   int getSubHeight() {
      return this.subHeight;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Lls;",
      garbageValue = "-210588352"
   )
   static class319[] method1416() {
      return new class319[]{class319.field3063, class319.field3060};
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1930263759"
   )
   static final int method1411(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }
}
