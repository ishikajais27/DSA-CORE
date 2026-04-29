package LinkedList;

public class LL {
    Node head;
    Node tail;
    int size;

    public LL(){
        this.size = 0;
    }

    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }

    // just calling external logic
    public void insertRec(int val, int index) {
        InsertRecursion obj = new InsertRecursion();
        head = obj.insertRec(val, index, head, this);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}