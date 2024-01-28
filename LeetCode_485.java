public class LeetCode_485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int curr=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            curr=0;
            else
            {
                curr++;
                res=Math.max(curr,res);
            }
        }
    return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
    
        System.out.println("Maximum Consecutive Ones: " + maxConsecutiveOnes);
    }
}
