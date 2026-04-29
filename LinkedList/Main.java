package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertRec(10, 0);
        list.insertRec(20, 1);

        list.display();
    }
}