/*
Second Largest Element in an Array
Problem Statement
Given an array of integers nums, return the second-largest distinct element in the array. If the second-largest element does not exist, return -1.

Constraints
1 <= nums.length <= 10^5

-10^9 <= nums[i] <= 10^9

Examples
Example 1:
Input:
nums = [8, 8, 7, 6, 5]
Output:
7

Example 2:
Input:
nums = [10, 10, 10, 10, 10]
Output:
-1

Example 3:
Input:
nums = [1]
Output:
-1

Example 4:
Input:
nums = [2, 1]
Output:
1
*/

import java.util.Scanner;

public class SecondLargestElementArray {
    public int secondLargestElement(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;


        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                smax = max;
                max = nums[i];
            }
            else if(max > nums[i] && smax < nums[i]){
                smax = nums[i];
            }

            
        }
        return (smax == Integer.MIN_VALUE) ? -1 : smax;
    }


    public static void main(String[] args) {
        SecondLargestElementArray obj = new SecondLargestElementArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of the array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Second Largest Element in the array is "+obj.secondLargestElement(arr1));
    }
    
}
