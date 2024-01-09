class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        this.val = x;
        next = null;
    }
}

public class LeetCode_143 {
    public void reorderList(ListNode2 head) {
        if (head == null) return;
        if (head.next == null) return;
        // Finding middle element
        ListNode2 slow = head;
        ListNode2 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode2 newNode = reverseList(slow.next);
        slow.next = null;
        // Merging both lists
        // First half - head
        ListNode2 curr = head;
        // Second half - newNode
        ListNode2 dummy = newNode;
        while (head != null && dummy != null) {
            ListNode2 temp = curr.next;
            curr.next = dummy;
            ListNode2 temp2 = dummy.next;
            dummy.next = temp;
            curr = temp;
            dummy = temp2;
        }
    }

    public ListNode2 reverseList(ListNode2 node) {
        ListNode2 curr = node;
        ListNode2 prev = null;
        ListNode2 next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        head.next.next.next = new ListNode2(4);
        head.next.next.next.next = new ListNode2(5);

        // Create an instance of LeetCode_21
        LeetCode_143 solution = new LeetCode_143();

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Call the reorderList method
        solution.reorderList(head);

        // Print the reordered linked list
        System.out.println("Reordered Linked List:");
        printLinkedList(head);
    }

    // Helper method to print a linked list
    private static void printLinkedList(ListNode2 head) {
        ListNode2 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
