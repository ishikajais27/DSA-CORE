package LinkedList.SingleLL;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();

        list.head = InsertRecursion.insertRec(10, 0, list.head);
        list.head = InsertRecursion.insertRec(20, 1, list.head);
        list.head = InsertRecursion.insertRec(15, 1, list.head);

        InsertRecursion.display(list.head);
    }
}