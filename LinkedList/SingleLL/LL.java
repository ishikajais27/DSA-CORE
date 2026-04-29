package LinkedList.SingleLL;

public class LL {   
    public Node head;
    public Node tail;
    public int size;

    public LL(){
        this.size = 0;
    }

    public static class Node{
        public int val;
        public Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}