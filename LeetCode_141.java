public class LeetCode_141 {
    public static class ListNode6 {
        int val;
        ListNode6 next;

        public ListNode6(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode6 head) {
        if (head == null || head.next == null) return false;
        ListNode6 slow = head;
        ListNode6 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void displayList(ListNode6 head) {
        if (head == null) {
            System.out.println("null");
            return;
        }

        System.out.print(head.val + " -> ");
        displayList(head.next);
    }

    public static void main(String[] args) {
        ListNode6 node1 = new ListNode6(1);
        ListNode6 node2 = new ListNode6(2);
        ListNode6 node3 = new ListNode6(3);
        ListNode6 node4 = new ListNode6(4);

        // Creating a cycle for demonstration
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // creates a cycle

        boolean hasCycle = hasCycle(node1);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
