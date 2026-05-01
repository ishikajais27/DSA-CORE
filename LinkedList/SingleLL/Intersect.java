package LinkedList.SingleLL;

public class Intersect {
    public static LL.Node getIntersectionNode(LL.Node headA, LL.Node headB) {
        
        LL.Node node1 = headA;
        LL.Node node2 = headB; 

        while(node1 != node2){
            if(node1 == null) node1 = headB;
            else node1 = node1.next;

            if(node2 == null) node2 = headA;
            else node2 = node2.next;
        }

        return node1;   
    }
}