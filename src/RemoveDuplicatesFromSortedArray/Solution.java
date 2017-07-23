package RemoveDuplicatesFromSortedArray;

import java.util.Scanner;

/**
 * Created by brightwise on 17/7/22.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length < 2)
            return length;
        int i;
        for(i = 0 ; i < length - 1;) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < length; j++)
                    nums[j - 1] = nums[j];
                length--;
            } else {
                i++;
            }

        }
        return length;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
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
        System.out.println(solution.removeDuplicates(nums));

    }
}