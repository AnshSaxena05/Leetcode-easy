import java.util.Arrays;

public class LeetCode_1051
{
    public static int heightChecker(int[] heights) {
        int[] arr = Arrays.copyOf(heights, heights.length);
        if(arr.length==0)
        return 0;
        Arrays.sort(arr);
        int res=0;
        for(int i=0;i< arr.length; i++)
            if(heights[i]!=arr[i])
                res++;
    return res;
    }
    public static void main(String[] args) {
        // Test case 1
        int[] heights1 = {1, 1, 4, 2, 1, 3};
        System.out.println("Test case 1: " + heightChecker(heights1));

        // Test case 2
        int[] heights2 = {5, 1, 2, 3, 4};
        System.out.println("Test case 2: " + heightChecker(heights2));

        // Test case 3
        int[] heights3 = {1, 2, 3, 4, 5};
        System.out.println("Test case 3: " + heightChecker(heights3));
    }
}