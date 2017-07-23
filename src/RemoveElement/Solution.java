package RemoveElement;

import java.util.Scanner;

/**
 * Created by brightwise on 17/7/23.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != val) {
                nums[index++] = nums[j];
            }
        }
        return index;
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

        System.out.println(solution.removeElement(nums, num));


    }
}
