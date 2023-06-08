import java.util.Scanner;

public class Solution_9 {
    public int searchInsert_9(int[] arr,int length, int target) {
        int start = 0;
        int end = length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == arr[mid]) {
                return (mid);
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

        }
        return start;
    }

    public static  void main(String[] args) {
            
            Scanner sc  = new Scanner(System.in);
            System.out.println("Target value");
            int target = sc.nextInt();
            System.out.println("Enter length of array");
            int len = sc.nextInt();
            int arr[] = new int[len];
            for (int k = 0; k < len; k++) {
                System.out.println("Enter the " + k + " value of index");
                arr[k] = sc.nextInt();
            }
            int result = new Solution_9().searchInsert_9(arr,len, target);
            System.out.println("Resultant index: " + result);
            
            sc.close();
        
    }
}