import java.util.*;

public class hasCycle_LL_15 
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
    public boolean hasCycle(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = slow;
        while (fast != null && fast.next != null)// run a loop to check if value of fast != 0
        {
            fast = fast.next.next;// run a faster node 
            slow = slow.next;// run a slower node 
            if(fast == slow)// check if fast and slow node intersect at any node/point
            {// if yes then return true ... it means its cyclic linked list
                return true;
            }
        }
    //esle return false , if they dont intersect.
    return false;    
                
    }  
    public static void main(String[] args)
    {
        hasCycle_LL_15  obj = new hasCycle_LL_15 ();
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

        boolean val = obj.hasCycle(head);
        /*
        // Convert ListNode back to LinkedList for printing
        linkedList.clear();
        ListNode temp = head;
        while (temp != null) {
        linkedList.addFirst(temp.val);
        temp = temp.next;
        }

        for(int i=0; i < linkedList.size(); i++)
        {
            System.out.print(linkedList.get(i)+ " -> ");
        }
        System.out.println("null");
        */
        if(val == true)
        System.out.println("The given linked list is cyclic" );
        else
        System.out.println("The given linked list is not cyclic" );
    } 
}
