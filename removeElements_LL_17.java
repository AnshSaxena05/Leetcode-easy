import java.util.*;

class removeElements_LL_17 
{
    public class ListNode
    {
        public int val;
        public ListNode next;
        
        public ListNode (int val)
        {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode removeElements(ListNode head, int val)
    {
        ListNode temp = new ListNode(0);// create a starting ListNode with value 0

        temp.next = head;// assign next value of temp node to head
        ListNode current = temp;
        while(current.next != null)// run the while loop until it current.next reaches null
        {
            if(current.next.val == val)// if the value matches then skip that node and move to next node.
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next; 
            }
        }
        System.gc();
        return temp.next;// return the value of temp.next this is because temp node was created by us for our convience to overcome the line 21 problem. It was not given in question.
    }
    public static void main(String[] args)
    {
        removeElements_LL_17 obj = new removeElements_LL_17();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();// create a new linked list
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements 4:");
        for (int i = 0; i < n; i++) // input values for linked list
        {
            int element = scanner.nextInt();
            linkedList.add(element);
        }
        System.out.print("Enter the element to be deleted : ");
        int num = scanner.nextInt();
        
        scanner.close();
        
         // Convert LinkedList to ListNode
        ListNode head = null;
        for (int i = linkedList.size() - 1; i >= 0; i--) 
        {
        ListNode newNode = obj.new ListNode(linkedList.get(i));
        newNode.next = head;
        head = newNode;
        }

        head = obj.removeElements(head, num);

        // Convert ListNode back to LinkedList for printing
        linkedList.clear();
        ListNode temp = head;
        while (temp != null) {
        linkedList.addFirst(temp.val);
        temp = temp.next;
        }

        for(int i = linkedList.size() -1 ; i >= 0 ; i--)
        {
            System.out.print(linkedList.get(i)+ " -> ");
        }
        System.out.println("null");
    }
}