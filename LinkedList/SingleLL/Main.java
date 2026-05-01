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

// -------- Cycle Test Code --------

LL cycleList = new LL();

// create list: 1 -> 2 -> 3 -> 4
cycleList.head = InsertRecursion.insertRec(1, 0, cycleList.head);
cycleList.head = InsertRecursion.insertRec(2, 1, cycleList.head);
cycleList.head = InsertRecursion.insertRec(3, 2, cycleList.head);
cycleList.head = InsertRecursion.insertRec(4, 3, cycleList.head);

// create cycle: last node -> node with value 2
LL.Node temp = cycleList.head;
LL.Node connectNode = cycleList.head.next;

while (temp.next != null) {
    temp = temp.next;
}
temp.next = connectNode;

// call directly (no object)
boolean result = Cycle.hasCycle(cycleList.head);

System.out.println("\nCycle Present: " + result);


//------Intersction-----
LL.Node node = Intersect.getIntersectionNode(list1.head, list2.head);

System.out.println("Intersection Present at - " + 
    (node != null ? node.val : "No Intersection"));

//--------Middle------------
LL.Node mid = Middle.middleNode(list1.head);

System.out.println("Middle node of the given list- ");
LL.Node mid2 = mid;
while(mid2!=null){
    System.out.println(mid2);
    mid2 = mid2.next;
}
    }
}