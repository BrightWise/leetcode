package TwoSum;

import java.util.Scanner;

/**
 * Created by brightwise on 16/8/28.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = i+1 ; j < nums.length ; j++) {
                if(nums[i] + nums[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
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

        int target = scanner.nextInt();
        int result[] = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
