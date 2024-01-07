class ListNode{
    int data;
    ListNode next;
    ListNode(int x)
    {
        this.data=x;
        next=null;
    }
}
public class LeetCode_206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;//store refrence of previous node
        ListNode next=null;//store refrence of next node(after curr node)
        ListNode curr=head;//refrence to head(address of first node);
        while(curr!=null)//traverse from curr node(==head) to node(which is equal to null)
        {
            next=curr.next;// refrence/pointer to next node of curr node
            curr.next=prev;// map refrence of current.next node to prev node(initially null)
            prev=curr; // update previous pointer
            curr=next; //update current pointer
        }
        return prev;
    }
    public static void main(String[] args) {
        // Creating a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Printing the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Reversing the linked list using the reverseList method
        LeetCode_206 solution = new LeetCode_206();
        ListNode reversedHead = solution.reverseList(head);

        // Printing the reversed linked list
        System.out.println("\nReversed Linked List:");
        printLinkedList(reversedHead);
    }
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
