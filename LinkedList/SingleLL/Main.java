package LinkedList.SingleLL;

public class Main {
    public static void main(String[] args) {

        // -------- Existing Code --------
        LL list = new LL();

        list.head = InsertRecursion.insertRec(10, 0, list.head);
        list.head = InsertRecursion.insertRec(20, 1, list.head);
        list.head = InsertRecursion.insertRec(15, 2, list.head);
        list.head = InsertRecursion.insertRec(15, 3, list.head);
        list.head = InsertRecursion.insertRec(157, 4, list.head);
        list.head = InsertRecursion.insertRec(8, 5, list.head);
        list.head = InsertRecursion.insertRec(10, 6, list.head);

        System.out.println("Original List:");
        InsertRecursion.display(list.head);

        list.head = RemoveDuplicate.removeDuplicate(list.head);

        System.out.println("After Removing Duplicates:");
        InsertRecursion.display(list.head);


        // -------- Merge Test Code --------

        LL list1 = new LL();
        LL list2 = new LL();

        // list1: 1 -> 3 -> 5
        list1.head = InsertRecursion.insertRec(1, 0, list1.head);
        list1.head = InsertRecursion.insertRec(3, 1, list1.head);
        list1.head = InsertRecursion.insertRec(5, 2, list1.head);

        // list2: 2 -> 4 -> 6
        list2.head = InsertRecursion.insertRec(2, 0, list2.head);
        list2.head = InsertRecursion.insertRec(4, 1, list2.head);
        list2.head = InsertRecursion.insertRec(6, 2, list2.head);

        System.out.println("\nList 1:");
        InsertRecursion.display(list1.head);

        System.out.println("List 2:");
        InsertRecursion.display(list2.head);

        LL.Node mergedHead = Merge.mergeTwoLists(list1.head, list2.head);

        System.out.println("Merged List:");
        InsertRecursion.display(mergedHead);
    }
}