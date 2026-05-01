package LinkedList.SingleLL;

public class Middle {
    public static LL.Node middleNode(LL.Node head) {
            LL.Node node = head;
            int count = 0;
            while(node!=null){
               count++;
               node = node.next;
            }
          for(int i=0;i<count/2;i++){
            head = head.next;
          }
          return head;
    }
    
}
