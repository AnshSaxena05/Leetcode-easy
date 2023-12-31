import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_1
{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> h=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if(h.containsKey(complement))
            {
                return new int[] {h.get(complement),i};
            }
            h.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        LeetCode_1 solution = new LeetCode_1();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Test Case 1: " + Arrays.toString(solution.twoSum(nums1, target1)));  // Output: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Test Case 2: " + Arrays.toString(solution.twoSum(nums2, target2)));  // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Test Case 3: " + Arrays.toString(solution.twoSum(nums3, target3)));  // Output: [0, 1]
    }
}
