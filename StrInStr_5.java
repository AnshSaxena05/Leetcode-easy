import java.util.Scanner;

public class StrInStr_5 {
    public int strStr(String haystack, String needle) {
        int a;
        if (haystack.contains(needle)) {
            a = haystack.indexOf(needle);
            return (a);
        }
        return (-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter haystack(input string):");
        String haystack = sc.nextLine();
        System.out.println("Enter needle(target string):");
        String needle = sc.nextLine();

        StrInStr_5 obj = new StrInStr_5();
        int result = obj.strStr(haystack, needle);
        System.out.println("The output is at index " + result);
        sc.close();

    }
}
