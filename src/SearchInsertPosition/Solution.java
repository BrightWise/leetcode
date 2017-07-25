package SearchInsertPosition;

import java.util.Scanner;

/**
 * Created by brightwise on 17/7/24.
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;

        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            }
            else if (nums[middle] > target) {
                right = middle - 1;
            }
            else {
                return middle;
            }
        }
        return nums[left] > target ? left : left + 1;
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

        int num = scanner.nextInt();
        System.out.println(solution.searchInsert(nums, num));
    }
}
