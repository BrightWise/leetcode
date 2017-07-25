package LongestCommonPrefix;

import java.util.Scanner;

/**
 * Created by brightwise on 17/7/25.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        int i,j;
        for ( i = 0 ; i < strs[0].length() ; i++) {
            for ( j = 0 ; j < strs.length - 1; j++) {
                if ( i >= strs[j+1].length() || strs[j].charAt(i) != strs[j+1].charAt(i))
                    break;
            }
            if (j != strs.length - 1)
                break;
        }
        return strs[0].substring(0, i);
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String numInfo = scanner.nextLine().trim();
        String[] strList = numInfo.substring(1, numInfo.length() - 1).split(",");
        //System.out.println(strList.length);
        System.out.println(solution.longestCommonPrefix(strList));
    }
}
