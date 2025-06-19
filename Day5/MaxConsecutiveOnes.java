/*
Max Consecutive Ones
Given a binary array nums, return the maximum number of consecutive 1's in the array.



Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.



Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.

 */

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, current = 0;
        for (int num : nums) {
            if (num == 1) {
                current++;
                if (current > max) max = current;
            } else {
                current = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter binary elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = obj.findMaxConsecutiveOnes(nums);
        System.out.println("Max consecutive 1s: " + result);
    }
}
