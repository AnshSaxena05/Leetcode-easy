public class LeetCode_66 {
    public int[] plusOne(int[] digits)
    {
        for(int i=digits.length -1; i>=0; i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
        digits[i]=0;
        }
        digits =new int[digits.length +1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args) {
        LeetCode_66 solution = new LeetCode_66();

        int[] inputArray = {9, 9};

        System.out.println("Initial Array: ");
        printArray(inputArray);

        int[] resultArray = solution.plusOne(inputArray);

        System.out.println("\nFinal Array: ");
        printArray(resultArray);
    }
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
