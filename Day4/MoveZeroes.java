/*
Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]


Example 2:
Input: nums = [0]
Output: [0]
 

Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

 */


 
import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[a] = nums[i];
                a++;
            }
        }

        for (int i = a; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes obj = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        obj.moveZeroes(nums);
        System.out.println("After moving zeroes: " + Arrays.toString(nums));
    }
}
