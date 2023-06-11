import java.util.Scanner;
public class merge_12 
{
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;  // Index of last element in nums1
        int j = n - 1;  // Index of last element in nums2
        int k = m + n - 1;  // Index of last element in the merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are any remaining elements in nums2, they should be copied to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    return nums1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenth of first array ");
        int m = sc.nextInt();
        System.out.println("Enter lenth of second array ");
        int n= sc.nextInt();
        int arr1[]=new int[m+n];
        int arr2[]=new int[n];
        System.out.println("Enter elements of first array ");
        for (int i=0;i<m;i++)
        {
             arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of second array ");
        for (int i=0;i<n;i++)
        {
             arr2[i]=sc.nextInt();
        }
        //Smerge_12 obj= new merge_12();
        
        int result[] = merge(arr1, m, arr2, n);
        sc.close();
        System.out.println("The output is "+ result );
        
        
    }   
}
