class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        this.val = x;
        next = null;
    }
}

public class LeetCode_21 {
    public ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode1 temp = new ListNode1(0);
        ListNode1 start = temp;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null)
            temp.next = list1;
        else
            temp.next = list2;
        return start.next;
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode1 list1 = new ListNode1(1);
        list1.next = new ListNode1(3);
        list1.next.next = new ListNode1(5);

        ListNode1 list2 = new ListNode1(2);
        list2.next = new ListNode1(4);
        list2.next.next = new ListNode1(6);

        LeetCode_21 solution = new LeetCode_21();
        ListNode1 mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
