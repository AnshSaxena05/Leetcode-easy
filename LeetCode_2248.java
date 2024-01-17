import java.util.List;
import java.util.ArrayList;

public class LeetCode_2248 {
    public List<Integer> intersection(int[][] nums) {
        int[] freq = new int[1001];
        int len = nums.length;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                freq[nums[i][j]]++;
            }
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 1001; i++) {
            if (freq[i] == len) list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        LeetCode_2248 solution = new LeetCode_2248();
        int[][] inputArray = {
            {1, 2, 3},
            {2, 3, 4},
            {2, 5, 6}
        
        };
        List<Integer> result = solution.intersection(inputArray);

        System.out.println("Intersection: " + result);
    }
}
