import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("CollisionMap")
public class CollisionMap {
   @ObfuscatedName("p")
   public static int canvasWidth;
   @ObfuscatedName("at")
   int xInset = 0;
   @ObfuscatedName("ay")
   int yInset = 0;
   @ObfuscatedName("an")
   int xSize;
   @ObfuscatedName("ab")
   int ySize;
   @ObfuscatedName("al")
   public int[][] flags;

   public CollisionMap(int var1, int var2) {
      this.xSize = var1;
      this.ySize = var2;
      this.flags = new int[this.xSize][this.ySize];
      this.clear();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "744825171"
   )
   public void clear() {
      for(int var1 = 0; var1 < this.xSize; ++var1) {
         for(int var2 = 0; var2 < this.ySize; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
               this.flags[var1][var2] = 16777216;
            } else {
               this.flags[var1][var2] = 16777215;
            }
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "1746124243"
   )
   public void method1091(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      if (var3 == 0) {
         if (var4 == 0) {
            this.setFlag(var1, var2, 128);
            this.setFlag(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.setFlag(var1, var2, 2);
            this.setFlag(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.setFlag(var1, var2, 8);
            this.setFlag(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.setFlag(var1, var2, 32);
            this.setFlag(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.setFlag(var1, var2, 1);
            this.setFlag(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.setFlag(var1, var2, 4);
            this.setFlag(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.setFlag(var1, var2, 16);
            this.setFlag(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.setFlag(var1, var2, 64);
            this.setFlag(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.setFlag(var1, var2, 130);
            this.setFlag(var1 - 1, var2, 8);
            this.setFlag(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.setFlag(var1, var2, 10);
            this.setFlag(var1, var2 + 1, 32);
            this.setFlag(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.setFlag(var1, var2, 40);
            this.setFlag(var1 + 1, var2, 128);
            this.setFlag(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.setFlag(var1, var2, 160);
            this.setFlag(var1, var2 - 1, 2);
            this.setFlag(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.setFlag(var1, var2, 65536);
               this.setFlag(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.setFlag(var1, var2, 1024);
               this.setFlag(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.setFlag(var1, var2, 4096);
               this.setFlag(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.setFlag(var1, var2, 16384);
               this.setFlag(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.setFlag(var1, var2, 512);
               this.setFlag(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.setFlag(var1, var2, 2048);
               this.setFlag(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.setFlag(var1, var2, 8192);
               this.setFlag(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.setFlag(var1, var2, 32768);
               this.setFlag(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.setFlag(var1, var2, 66560);
               this.setFlag(var1 - 1, var2, 4096);
               this.setFlag(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.setFlag(var1, var2, 5120);
               this.setFlag(var1, var2 + 1, 16384);
               this.setFlag(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.setFlag(var1, var2, 20480);
               this.setFlag(var1 + 1, var2, 65536);
               this.setFlag(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.setFlag(var1, var2, 81920);
               this.setFlag(var1, var2 - 1, 1024);
               this.setFlag(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "606945134"
   )
   public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += 131072;
      }

      var1 -= this.xInset;
      var2 -= this.yInset;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if (var7 >= 0 && var7 < this.xSize) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if (var8 >= 0 && var8 < this.ySize) {
                  this.setFlag(var7, var8, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "83"
   )
   public void setBlockedByFloor(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      this.flags[var1][var2] |= 2097152;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "352173417"
   )
   public void setBlockedByFloorDec(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      this.flags[var1][var2] |= 262144;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "5"
   )
   void setFlag(int var1, int var2, int var3) {
      this.flags[var1][var2] |= var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIIIZB)V",
      garbageValue = "10"
   )
   public void method1094(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      if (var3 == 0) {
         if (var4 == 0) {
            this.setFlagOff(var1, var2, 128);
            this.setFlagOff(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.setFlagOff(var1, var2, 2);
            this.setFlagOff(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.setFlagOff(var1, var2, 8);
            this.setFlagOff(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.setFlagOff(var1, var2, 32);
            this.setFlagOff(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.setFlagOff(var1, var2, 1);
            this.setFlagOff(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.setFlagOff(var1, var2, 4);
            this.setFlagOff(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.setFlagOff(var1, var2, 16);
            this.setFlagOff(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.setFlagOff(var1, var2, 64);
            this.setFlagOff(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.setFlagOff(var1, var2, 130);
            this.setFlagOff(var1 - 1, var2, 8);
            this.setFlagOff(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.setFlagOff(var1, var2, 10);
            this.setFlagOff(var1, var2 + 1, 32);
            this.setFlagOff(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.setFlagOff(var1, var2, 40);
            this.setFlagOff(var1 + 1, var2, 128);
            this.setFlagOff(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.setFlagOff(var1, var2, 160);
            this.setFlagOff(var1, var2 - 1, 2);
            this.setFlagOff(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.setFlagOff(var1, var2, 65536);
               this.setFlagOff(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.setFlagOff(var1, var2, 1024);
               this.setFlagOff(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.setFlagOff(var1, var2, 4096);
               this.setFlagOff(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.setFlagOff(var1, var2, 16384);
               this.setFlagOff(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.setFlagOff(var1, var2, 512);
               this.setFlagOff(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.setFlagOff(var1, var2, 2048);
               this.setFlagOff(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.setFlagOff(var1, var2, 8192);
               this.setFlagOff(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.setFlagOff(var1, var2, 32768);
               this.setFlagOff(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.setFlagOff(var1, var2, 66560);
               this.setFlagOff(var1 - 1, var2, 4096);
               this.setFlagOff(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.setFlagOff(var1, var2, 5120);
               this.setFlagOff(var1, var2 + 1, 16384);
               this.setFlagOff(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.setFlagOff(var1, var2, 20480);
               this.setFlagOff(var1 + 1, var2, 65536);
               this.setFlagOff(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.setFlagOff(var1, var2, 81920);
               this.setFlagOff(var1, var2 - 1, 1024);
               this.setFlagOff(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IIIIIZB)V",
      garbageValue = "-21"
   )
   public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.xInset;
      var2 -= this.yInset;
      int var8;
      if (var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < this.xSize) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.ySize) {
                  this.setFlagOff(var8, var9, var7);
               }
            }
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-294771175"
   )
   void setFlagOff(int var1, int var2, int var3) {
      this.flags[var1][var2] &= ~var3;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "649174852"
   )
   public void method1099(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      this.flags[var1][var2] &= -262145;
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-76"
   )
   static final void method1100() {
      Client.field536 = 0;
      int var0 = (class155.localPlayer.x >> 7) + class154.baseX;
      int var1 = (class155.localPlayer.y >> 7) + class365.baseY;
      if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
         Client.field536 = 1;
      }

      if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
         Client.field536 = 1;
      }

      if (Client.field536 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
         Client.field536 = 0;
      }

   }

   @ObfuscatedName("nx")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "339045513"
   )
   static void method1096() {
      if (Client.oculusOrbState == 1) {
         Client.oculusOrbOnLocalPlayer = true;
      }

   }
}
