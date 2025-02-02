import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   static AbstractArchive SpotAnimationDefinition_archive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   static AbstractArchive SpotAnimationDefinition_modelArchive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   static EvictingDualNodeHashTable SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("m")
   int id;
   @ObfuscatedName("q")
   int archive;
   @ObfuscatedName("f")
   public int sequence = -1;
   @ObfuscatedName("r")
   short[] recolorFrom;
   @ObfuscatedName("u")
   short[] recolorTo;
   @ObfuscatedName("b")
   short[] retextureFrom;
   @ObfuscatedName("j")
   short[] retextureTo;
   @ObfuscatedName("g")
   int widthScale = 128;
   @ObfuscatedName("i")
   int heightScale = 128;
   @ObfuscatedName("o")
   int orientation = 0;
   @ObfuscatedName("n")
   int ambient = 0;
   @ObfuscatedName("k")
   int contrast = 0;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "48"
   )
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IB)V",
      garbageValue = "76"
   )
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.archive = var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.sequence = var1.readUnsignedShort();
      } else if (var2 == 4) {
         this.widthScale = var1.readUnsignedShort();
      } else if (var2 == 5) {
         this.heightScale = var1.readUnsignedShort();
      } else if (var2 == 6) {
         this.orientation = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.ambient = var1.readUnsignedByte();
      } else if (var2 == 8) {
         this.contrast = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.recolorFrom = new short[var3];
            this.recolorTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.recolorFrom[var4] = (short)var1.readUnsignedShort();
               this.recolorTo[var4] = (short)var1.readUnsignedShort();
            }
         } else if (var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.retextureFrom = new short[var3];
            this.retextureTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.retextureFrom[var4] = (short)var1.readUnsignedShort();
               this.retextureTo[var4] = (short)var1.readUnsignedShort();
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)Lhh;",
      garbageValue = "975498886"
   )
   public final Model getModel(int var1) {
      Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
      if (var2 == null) {
         ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
         if (var3 == null) {
            return null;
         }

         int var4;
         if (this.recolorFrom != null) {
            for(var4 = 0; var4 < this.recolorFrom.length; ++var4) {
               var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
            }
         }

         if (this.retextureFrom != null) {
            for(var4 = 0; var4 < this.retextureFrom.length; ++var4) {
               var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
            }
         }

         var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
         SpotAnimationDefinition_cachedModels.put(var2, (long)this.id);
      }

      Model var5;
      if (this.sequence != -1 && var1 != -1) {
         var5 = AABB.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
      } else {
         var5 = var2.toSharedSpotAnimationModel(true);
      }

      if (this.widthScale != 128 || this.heightScale != 128) {
         var5.scale(this.widthScale, this.heightScale, this.widthScale);
      }

      if (this.orientation != 0) {
         if (this.orientation == 90) {
            var5.rotateY90Ccw();
         }

         if (this.orientation == 180) {
            var5.rotateY90Ccw();
            var5.rotateY90Ccw();
         }

         if (this.orientation == 270) {
            var5.rotateY90Ccw();
            var5.rotateY90Ccw();
            var5.rotateY90Ccw();
         }
      }

      return var5;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Lop;",
      garbageValue = "-1315664177"
   )
   public static class409 method976() {
      class409[] var0 = class409.field3754;
      synchronized(class409.field3754) {
         if (class409.field3757 == 0) {
            return new class409();
         } else {
            class409.field3754[--class409.field3757].method2126();
            return class409.field3754[class409.field3757];
         }
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-891167706"
   )
   static void method974() {
      StructComposition.field1639 = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = class201.method1086((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F));
         StructComposition.field1639[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(int var5 = var1 / 6; var0 < StructComposition.field1639.length; var1 -= var5) {
         var3 = var0 * 2;

         for(int var4 = class201.method1086((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < StructComposition.field1639.length; ++var0) {
            StructComposition.field1639[var0] = var4;
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)[Ljn;",
      garbageValue = "113"
   )
   public static ZoneOperation[] getZoneOperations() {
      return new ZoneOperation[]{ZoneOperation.field2553, ZoneOperation.field2542, ZoneOperation.field2543, ZoneOperation.field2554, ZoneOperation.field2545, ZoneOperation.field2549, ZoneOperation.field2551, ZoneOperation.field2547, ZoneOperation.field2548, ZoneOperation.field2541, ZoneOperation.field2550, ZoneOperation.field2544, ZoneOperation.field2552, ZoneOperation.field2546};
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-1666232175"
   )
   static final int getTileHeight(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 + (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] >> 7;
         int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
         return var8 * (128 - var7) + var7 * var9 >> 7;
      } else {
         return 0;
      }
   }
}
