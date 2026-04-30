package LinkedList.SingleLL;

import java.util.HashSet;
import java.util.Set;

public class Cycle {
    
    public static boolean hasCycle(LL.Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        LL.Node slow = head;
        LL.Node fast = head;

        Set<LL.Node> traversed = new HashSet<>();
        traversed.add(head);

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (traversed.contains(fast)) {
                return true;
            } else {
                traversed.add(slow);
            }
        }

        return false;
    }
}
