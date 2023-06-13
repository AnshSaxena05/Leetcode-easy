import java.util.*;

public class reverseList_14 
{
    public class ListNode
    {
        public int val;
        public ListNode next;

        public ListNode(int val) 
        {
            this.val = val;
            this.next = null;
        }
    }
    
    public ListNode reverseList(ListNode head) 
    {
        if( head == null || head.next == null )
        {
            return head;
        }
        ListNode prevNode = head;
        ListNode currNode = head.next;
        while (currNode != null)
        {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            //update 
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    return prevNode; 
    }   
    public static void main(String args[])
    {
        
            reverseList_14 obj = new reverseList_14();// object creation of class 
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

            // printing the initial linked list
            System.out.println("Printing initial list");
            for(int i=linkedList.size()-1; i >=0 ; i--)
            {
                System.out.print(linkedList.get(i)+ " -> ");
            }
            System.out.println("null");
            
             // Convert LinkedList to ListNode
            ListNode head = null;
            for (int i = linkedList.size() - 1; i >= 0; i--) 
            {
            ListNode newNode = obj.new ListNode(linkedList.get(i));
            newNode.next = head;
            head = newNode;
            }
    
            head = obj.reverseList(head);
    
            // Convert ListNode back to LinkedList for printing
            linkedList.clear();
            ListNode temp = head;
            while (temp != null) {
            linkedList.addFirst(temp.val);
            temp = temp.next;
            }
            
            System.out.println("Printing reverse list");
            for(int i=0; i < linkedList.size(); i++)
            {
                System.out.print(linkedList.get(i)+ " -> ");
            }
            System.out.println("null");
        
    } 

}
