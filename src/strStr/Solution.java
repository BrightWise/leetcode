package strStr;

import java.util.Scanner;

/**
 * Created by brightwise on 17/7/23.
 */
public class Solution {
    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String haystack = scanner.next();
        String needle = scanner.next();

        System.out.println(solution.strStr(haystack, needle));
    }
}
