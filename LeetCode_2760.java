public class LeetCode_2760
{
    public static int findEven(int nums[], int ths, int i) {
        while(i < nums.length) {
            if(nums[i] <= ths && nums[i] % 2 == 0) break;
            i++;
        }
        return i;
    }
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int l = findEven(nums, threshold, 0);
        if(l == nums.length) return 0;
        int r = l + 1;
        int maxLen = 1;
        int i = 1;
        while(r < nums.length) {
            if(nums[r] <= threshold && nums[r] % 2 == i++) i %= 2;
            else {
                maxLen = Math.max(maxLen, r - l);
                l = findEven(nums, threshold, r);
                r = l;
                i = 1;
            }
            r++;
        }
        maxLen = Math.max(maxLen, r - l);
        return maxLen;
    }
    public static void main(String[] args) {
        // Example usage
        int[] nums = {3, 2, 5, 4};
        int threshold = 5;

        LeetCode_2760 solution = new LeetCode_2760();
        int result = solution.longestAlternatingSubarray(nums, threshold);

        System.out.println("Longest Alternating Subarray Length: " + result);
    }
}