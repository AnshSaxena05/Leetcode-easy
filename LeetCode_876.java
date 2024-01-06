class ListNode
{
    int data;
    ListNode next;
    ListNode(int x)
    {
        this.data= x;
        next=null;
    }
}

public class LeetCode_876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast= fast.next.next;
        }
        System.gc();
        return slow;
    }
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create an instance of LeetCode_876 class
        LeetCode_876 solution = new LeetCode_876();

        // Call the middleNode function and print the result
        ListNode middleNode = solution.middleNode(head);
        System.out.println("Middle Node: " + middleNode.data);
    }
}

