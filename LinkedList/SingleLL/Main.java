package LinkedList.SingleLL;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();

        list.head = InsertRecursion.insertRec(10, 0, list.head);
        list.head = InsertRecursion.insertRec(20, 1, list.head);
        list.head = InsertRecursion.insertRec(15, 2, list.head);
        list.head = InsertRecursion.insertRec(15, 3, list.head);
        list.head = InsertRecursion.insertRec(157,4, list.head);
        list.head = InsertRecursion.insertRec(8, 5, list.head);
        list.head = InsertRecursion.insertRec(10, 6, list.head);

        InsertRecursion.display(list.head);
        list.head = RemoveDuplicate.removeDuplicate(list.head);
        InsertRecursion.display(list.head);

    }
}