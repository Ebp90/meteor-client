import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("py")
public class class425 {
   @ObfuscatedName("b")
   static final int[] field3802 = new int[2048];
   @ObfuscatedName("j")
   static final int[] field3803 = new int[2048];

   static {
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field3802[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
         field3803[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
      }

   }
}
