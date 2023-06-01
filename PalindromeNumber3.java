public class PalindromeNumber3 
{
    public boolean isPalindrome(int x) {
        int a = x;
        int newa = 0;
        int digit;
        while (a > 0) {
            digit = a % 10;

            newa = newa * 10 + digit;
            a = a / 10;
        }
        if (newa == x) {
            return true;
        }
        return false;
    }
}
