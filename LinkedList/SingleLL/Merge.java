package LinkedList.SingleLL;

public class Merge {

    public static LL.Node mergeTwoLists(LL.Node list1, LL.Node list2) {
        LL.Node node1 = list1;
        LL.Node node2 = list2;

        LL.Node node = new LL.Node(-1); 
        LL.Node head = node;

        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                node.next = node1;
                node1 = node1.next;
            } else {
                node.next = node2;
                node2 = node2.next;
            }
            node = node.next;
        }

        if (node1 != null) {
            node.next = node1;
        } else {
            node.next = node2;
        }

        return head.next;
    }
}