/*
Find the Largest Element in an Array

Given an array of integers nums, return the value of the largest element in the array.

Constraints:
1 <= nums.length <= 10^5

-10^9 <= nums[i] <= 10^9


Example 1:
Input: nums = [3, 3, 6, 1]
Output: 6


Example 2:
Input: nums = [3, 3, 0, 99, -40]
Output: 99
 */

import java.util.Scanner;

public class LargestElementArray {

    public int largestElement(int[] nums, int n) {
        int max = nums[0];
        for(int i=0;i<n; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    /* 
    public int largestElement(int[] nums, int n) {
        Arrays.sort(nums);
        return nums[n-1];
    }
    */

    public static void main(String[] args) {
        LargestElementArray obj = new LargestElementArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of the array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Largest Element in the array is "+obj.largestElement(arr1, n));
    }
}

