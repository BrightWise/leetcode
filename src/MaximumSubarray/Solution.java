package MaximumSubarray;

import java.util.Scanner;

/**
 * Created by brightwise on 17/7/30.
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length ==0)
            return 0;

        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < nums.length ; i++) {
            cur = cur + nums[i];
            max = Math.max(max, cur);
            cur = cur < 0 ? 0 : cur;
        }
        return max;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String numInfo = scanner.nextLine().trim();
        String[] numList = numInfo.substring(1, numInfo.length() - 1).split(",");

        int[] nums = new int[numList.length];
        for(int i = 0 ; i < numList.length ; i++) {
            nums[i] = Integer.parseInt(numList[i].trim());
        }
        System.out.println(solution.maxSubArray(nums));
    }
}
