import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("RawSound")
public class RawSound extends AbstractSound {
   @ObfuscatedName("h")
   public int sampleRate;
   @ObfuscatedName("e")
   public byte[] samples;
   @ObfuscatedName("v")
   public int start;
   @ObfuscatedName("x")
   int end;
   @ObfuscatedName("m")
   public boolean field173;

   RawSound(int var1, byte[] var2, int var3, int var4) {
      this.sampleRate = var1;
      this.samples = var2;
      this.start = var3;
      this.end = var4;
   }

   RawSound(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.sampleRate = var1;
      this.samples = var2;
      this.start = var3;
      this.end = var4;
      this.field173 = var5;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lby;)Laf;"
   )
   public RawSound resample(Decimator var1) {
      this.samples = var1.resample(this.samples);
      this.sampleRate = var1.scaleRate(this.sampleRate);
      if (this.start == this.end) {
         this.start = this.end = var1.scalePosition(this.start);
      } else {
         this.start = var1.scalePosition(this.start);
         this.end = var1.scalePosition(this.end);
         if (this.start == this.end) {
            --this.start;
         }
      }

      return this;
   }
}
