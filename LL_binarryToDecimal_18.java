import java.util.*;

public class LL_binarryToDecimal_18 
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
    public int getDecimalValue(ListNode head) 
     {
        int size = -1;
        int sum = 0;
        for(ListNode temp = head; temp != null; temp = temp.next){
            size++;
        }
        ListNode node = head;
        while(node != null){
            sum += node.val * (Math.pow(2,size--));
            node = node.next;
        }
        System.gc();
        return sum;
    } 
    public static void main(String[] args)
    {
        LL_binarryToDecimal_18 obj = new LL_binarryToDecimal_18();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();// create a new linked list
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the binarry elements :");
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

        int result = obj.getDecimalValue(head);

        System.out.print("The converted decimal number is "+ result);
    }
}
