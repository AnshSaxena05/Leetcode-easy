public class LeetCode_125 {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
    public static void main(String[] args) {
        LeetCode_125 palindromeChecker = new LeetCode_125();

        String testString1 = "racecar";
        boolean isPalindrome1 = palindromeChecker.isPalindrome(testString1);
        System.out.println(testString1 + " is palindrome? " + isPalindrome1);

        String testString2 = "A man, a plan, a canal: Panama";
        boolean isPalindrome2 = palindromeChecker.isPalindrome(testString2);
        System.out.println(testString2 + " is palindrome? " + isPalindrome2);

        String testString3 = "hello";
        boolean isPalindrome3 = palindromeChecker.isPalindrome(testString3);
        System.out.println(testString3 + " is palindrome? " + isPalindrome3);
    }
}
