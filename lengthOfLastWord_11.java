import java.util.Scanner;

public class lengthOfLastWord_11 {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        int len = str.length();
        for (int i = (len - 1); i >= 0; i--) {
            char ch = str.charAt(i);

            if (Character.isWhitespace(ch)) {
                break;
            } else
                count = count + 1;
            continue;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int result = new lengthOfLastWord_11().lengthOfLastWord(str);
        System.out.println("The length of last word is " + result);
        sc.close();
    }
}
