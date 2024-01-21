import java.util.Arrays;

public class LeetCode_1299 {
    public static int[] replaceElements(int[] arr) {
        int max=-1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            } else
                arr[i] = max;
        }
        return arr;
    }
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {17, 18, 5, 4, 6, 1};
        int[] result1 = replaceElements(arr1);
        System.out.println(Arrays.toString(result1));
        // Expected output: [18, 6, 6, 6, 1, -1]

        // Test case 2
        int[] arr2 = {400};
        int[] result2 = replaceElements(arr2);
        System.out.println(Arrays.toString(result2));
        // Expected output: [-1]

        // Test case 3
        int[] arr3 = {56903, 18666, 60499, 57517, 26961};
        int[] result3 = replaceElements(arr3);
        System.out.println(Arrays.toString(result3));
        // Expected output: [60499, 60499, 57517, 26961, -1]
    }
}
