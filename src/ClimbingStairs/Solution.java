package ClimbingStairs;

import java.util.Scanner;

/**
 * Created by brightwise on 17/8/2.
 */
public class Solution {
    public int climbStairs2(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return climbStairs2(n - 1) + climbStairs2(n - 2);
    }

    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int a[] = new int[n];
        a[0] = 1;
        a[1] = 2;
        for ( int i = 2; i < n ; i++) {
            a[i] = a[i-1]+a[i-2];
        }
        return a[n-1];
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(solution.climbStairs(num));
    }
}
