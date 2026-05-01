package LinkedList.SingleLL;

import java.util.HashMap;

public class HashFind {
    public static LL.Node findNode(int index, LL.Node head){
        HashMap<Integer, LL.Node> map = new HashMap<>();

        LL.Node temp = head;
        int count = 0;

        while (temp != null) {
            map.put(count, temp);
            temp = temp.next;
            count++;
        }

        return map.getOrDefault(index, null);
    }
}