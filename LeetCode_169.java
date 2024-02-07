public class LeetCode_169 {
    public int majorityElement(int[] nums) {
        int count = 1, res = 0, n = nums.length;
        // find the majority element
        for (int i = 1; i < n; i++) {
            if (nums[res] == nums[i])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        return nums[res];
        // //validate the majority element
        // count=0;
        // for(int i=0;i<n;i++)
        // if(nums[res]==nums[i])
        // count++;
        // if(count<=n/2)
        // return -1;
        // return nums[res];
    }
    public static void main(String[] args) {
        LeetCode_169 solution = new LeetCode_169();

        // Example usage:
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = solution.majorityElement(nums);

        System.out.println("The majority element is: " + majorityElement);
    }
}
