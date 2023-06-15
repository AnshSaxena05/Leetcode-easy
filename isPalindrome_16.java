import java.util.*;

public class isPalindrome_16 
{
    public class ListNode
    {
        public int val;
        public ListNode next;

        public ListNode(int val)
        {
            this.val= val;
            this.next= null;
        }
    }
    public boolean isPalindrome(ListNode head) 
    {
        ListNode slow =head , fast = head , prev, temp;
        while ( fast != null && fast.next != null)// to get the middle point of ListNode 
        {
            slow =slow.next;
            fast = fast.next.next;
        }   
        prev = slow; // we have got the middle point in the ListNode
        slow = slow.next;
        prev.next = null;
        while(slow != null)// now we have to reverse the node from middle(prev) to end node.
        {
            temp = slow.next;// creating 3 pointers , prev(middle value), slow , temp(slow.next)
            slow.next =prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null)// check each value from fast.next and slow.next , until they are equal..       once they reach null value , the loop terminates and return true.
        {
            if (slow.val != fast.val)
            {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }    
    public static void main(String[] args)
    {
        isPalindrome_16 obj = new isPalindrome_16 ();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();// create a new linked list
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) // input values for linked list
        {
            int element = scanner.nextInt();
            linkedList.add(element);
        }
        scanner.close();
        
         // Convert LinkedList to ListNode
        ListNode head = null;
        for (int i = linkedList.size() - 1; i >= 0; i--) 
        {
        ListNode newNode = obj.new ListNode(linkedList.get(i));
        newNode.next = head;
        head = newNode;
        }

        boolean val = obj.isPalindrome(head);

        if(val == true)
        System.out.println("The given linked list is palindrome" );
        else
        System.out.println("The given linked list is not palindrome" );
    } 
}
