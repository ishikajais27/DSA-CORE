package LinkedList.SingleLL;

public class RemoveDuplicate {

    public static LL.Node removeDuplicate(LL.Node head){

        if(head == null){
            return null;
        }

        LL.Node node = head;

        while(node != null && node.next != null){

            if(node.val == node.next.val){
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }
}