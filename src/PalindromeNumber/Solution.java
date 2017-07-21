package PalindromeNumber;

import java.util.Scanner;

/**
 * Created by brightwise on 17/7/21.
 */
public class Solution {

    public boolean isPalindrome(int x) {

        if( x == Integer.MIN_VALUE)
            return false;

        x = Math.abs(x);

        int help = 1;
        while (x / help >= 10)
            help *= 10;

        while (x != 0) {
            if ( x / help != x % 10)
                return false;
            x = (x % help) / 10;
            help /= 100;
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if( x == Integer.MIN_VALUE)
            return false;
        x = Math.abs(x);
        String str = String.valueOf(x);
        char[] list = str.toCharArray();
        for(int i = 0,j=list.length-1;i <=j;i++,j--) {
            if (list[i] != list[j])
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution.isPalindrome2(num));
    }
}
