package MergeSortedArray;

/**
 * Created by brightwise on 17/8/6.
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m + n == 0)
            return;
        int[] nums = new int[m+n];
        int i,j;
        int k = 0;
        for(i=0,j=0;i<m && j<n;) {
            if(nums1[i] < nums2[j]) {
                nums[k++] = nums1[i];
                i++;
            }
            else {
                nums[k++] = nums2[j];
                j++;
            }
        }
        while(i<m){
            nums[k++] = nums1[i++];
        }
        while(j<n){
            nums[k++] = nums2[j++];
        }
        while(k > 0) {
            k--;
            nums1[k] = nums[k];
        }
    }
}