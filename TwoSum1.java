public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int add;
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                add = nums[i] + nums[j];
                if (add == target && i != j) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }

            }
        }

        return arr;
    }

}
