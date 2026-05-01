package LinkedList.SingleLL;

public class BinToDec {
    public static int getDecimalValue(LL.Node head) {
       //1-2-4-5-6 ->> 6-5-4-2-1
       LL.Node prev = null;
       LL.Node node = head;
       int base =1;
       int dec = 0;
       while(node!= null){
        LL.Node next = node.next;
        node.next = prev;
        prev = node;
        node = next;
       }
       while(prev!= null){
         dec += prev.val * base;
         prev = prev.next;
         base = base*2;
       }
       return dec;
        
    }
}
