package LinkedList.SingleLL;

public class InsertRecursion {

    public static LL.Node insertRec(int val, int index, LL.Node node) {

        if (index == 0) {
            return new LL.Node(val, node);
        }

        if (node == null) {
            System.out.println("Index out of bounds");
            return null;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public static void display(LL.Node head) {
        LL.Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }   
}