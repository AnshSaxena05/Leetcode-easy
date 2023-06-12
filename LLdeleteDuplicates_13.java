import java.util.*;
public class LLdeleteDuplicates_13 
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
    public ListNode deleteDuplicates(ListNode head) 
    {
       ListNode temp= head; // create new pointer temp to traverse in ListNode (LL)
       while(temp != null && temp.next != null)
       {//check if the temp value is null or not. 
            if(temp.val !=  temp.next.val)// check if the curent node is equal to next node or not
                temp = temp.next;//updating the temp variable to point to the next node in the list
            else 
                temp.next = temp.next.next;// when the values are common skip the next node 
       }
    return head;
    } 
    public static void main(String[] args)
    {
        LLdeleteDuplicates_13 obj = new LLdeleteDuplicates_13();
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

        head = obj.deleteDuplicates(head);

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
    }
    
}
