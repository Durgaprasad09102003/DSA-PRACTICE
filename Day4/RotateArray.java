/*
Rotate Array
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]



Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 
 */
import java.util.Arrays;

class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  

        reverse(nums, 0, n - 1);     
        reverse(nums, 0, k - 1);     
        reverse(nums, k, n - 1);     
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray obj = new RotateArray();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(nums));
        obj.rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}
