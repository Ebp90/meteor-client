import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class153 {
   @ObfuscatedName("h")
   long field1375;
   @ObfuscatedName("e")
   long field1373 = -1L;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmv;"
   )
   IterableNodeDeque field1374 = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lqy;)V"
   )
   public class153(Buffer var1) {
      this.method818(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1859728941"
   )
   void method818(Buffer var1) {
      this.field1375 = var1.readLong();
      this.field1373 = var1.readLong();

      for(int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
         Object var3;
         if (var2 == 1) {
            var3 = new class148(this);
         } else if (var2 == 4) {
            var3 = new class159(this);
         } else if (var2 == 3) {
            var3 = new class144(this);
         } else if (var2 == 2) {
            var3 = new class142(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class149(this);
         }

         ((class152)var3).vmethod3238(var1);
         this.field1374.addFirst((Node)var3);
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lfn;I)V",
      garbageValue = "1429912683"
   )
   public void method816(ClanChannel var1) {
      if (var1.key == this.field1375 && this.field1373 == var1.field1388) {
         for(class152 var2 = (class152)this.field1374.last(); var2 != null; var2 = (class152)this.field1374.previous()) {
            var2.vmethod3239(var1);
         }

         ++var1.field1388;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)Ljava/lang/String;",
      garbageValue = "-1511389929"
   )
   public static String readString(Buffer var0) {
      String var1;
      try {
         int var2 = var0.readUShortSmart();
         if (var2 > 32767) {
            var2 = 32767;
         }

         byte[] var3 = new byte[var2];
         var0.offset += class308.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
         String var4 = ClientPacket.decodeStringCp1252(var3, 0, var2);
         var1 = var4;
      } catch (Exception var6) {
         var1 = "Cabbage";
      }

      return var1;
   }
}
