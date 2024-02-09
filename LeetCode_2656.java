public class LeetCode_2656 {
    public int maximizeSum(int[] nums, int k) {
        int m = nums[0];
        for (int i = 1; i < nums.length; i++)
            m = Math.max(m, nums[i]);
        int sc = m * k;
        for (int i = 1; i < k; i++)
            sc += i;
        return sc;
    }

    public static void main(String[] args) {
        LeetCode_2656 solution = new LeetCode_2656();
        int[] nums = { 3, 7, 2, 8 };
        int k = 3;

        int result = solution.maximizeSum(nums, k);

        System.out.println("Result: " + result);
    }
}
