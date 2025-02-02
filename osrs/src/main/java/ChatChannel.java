import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("ChatChannel")
public class ChatChannel {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "[Lbv;"
   )
   Message[] messages = new Message[100];
   @ObfuscatedName("v")
   int count;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;",
      garbageValue = "1717245391"
   )
   Message addMessage(int var1, String var2, String var3, String var4) {
      Message var5 = this.messages[99];

      for(int var6 = this.count; var6 > 0; --var6) {
         if (var6 != 100) {
            this.messages[var6] = this.messages[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new Message(var1, var2, var4, var3);
      } else {
         var5.remove();
         var5.removeDual();
         var5.set(var1, var2, var4, var3);
      }

      this.messages[0] = var5;
      if (this.count < 100) {
         ++this.count;
      }

      return var5;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Lbv;",
      garbageValue = "-370186174"
   )
   Message getMessage(int var1) {
      return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1046620565"
   )
   int size() {
      return this.count;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)Ley;",
      garbageValue = "-58"
   )
   static class131 method458(int var0) {
      class131[] var1 = new class131[]{class131.field1272, class131.field1264, class131.field1265, class131.field1266, class131.field1267, class131.field1268, class131.field1271, class131.field1270, class131.field1273};
      class131 var2 = (class131)World.findEnumerated(var1, var0);
      if (var2 == null) {
         var2 = class131.field1273;
      }

      return var2;
   }
}
