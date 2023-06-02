import java.util.HashMap;
import java.util.Map;

public class RomanToInteger4 {
    public int romanToInt(String s) {
        /* Map<Character, Integer> romanMap = new HashMap<>(); */
        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(s.charAt(i));
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            prevValue = curValue;
        }
        return result;

    }

}
/*
 * ### Alternative code ###
 * class Solution {
 * public int romanToInt(String s) {
 * 
 * 
 * int answer = 0, number = 0, prev = 0;
 * 
 * for (int j = s.length() - 1; j >= 0; j--) {
 * switch (s.charAt(j)) {
 * case 'M' -> number = 1000;
 * case 'D' -> number = 500;
 * case 'C' -> number = 100;
 * case 'L' -> number = 50;
 * case 'X' -> number = 10;
 * case 'V' -> number = 5;
 * case 'I' -> number = 1;
 * }
 * if (number < prev) {
 * answer -= number;
 * }
 * else {
 * answer += number;
 * }
 * prev = number;
 * }
 * return answer;
 * 
 * }
 * }
 */
