package ReverseInteger;

import java.util.Scanner;

/**
 * Created by brightwise on 17/7/20.
 */
public class Solution {
    public int reverse(int x) {
        long sum = 0;
        int tmp;
        while(x != 0) {
            tmp = x % 10;
            sum = sum * 10 + tmp;
            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
                return 0;
            x /= 10;
        }
        return (int)sum;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution.reverse(num));
    }
}