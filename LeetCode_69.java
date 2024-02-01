public class LeetCode_69 {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int start = 1;
        int end = x;
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                return mid;
            else
                start = mid + 1;
        }

        return Math.round(end);
    }
    public static void main(String[] args) {
        int x = 16; // Replace this with the desired input value
        int result = mySqrt(x);
        System.out.println("Square root of " + x + " is: " + result);
    }
    
}
