/*
Binary Search

Description:
Given a sorted (in ascending order) integer array nums of n elements and a target value target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4


Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1


Constraints:

1 <= nums.length <= 10^4
-10^4 <= nums[i], target <= 10^4

nums is sorted in ascending order, and all elements are unique.
 */

import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {

    public String Binary(int[] arr1, int n, int search){

        int left = 0;
        int right = n-1;

        if (n <= 0) {
            return "null";
        }

        
        Arrays.sort(arr1);

        while(left<=right){
            int mid = left + (right - left)/2;

            if(arr1[mid] == search){
                return "" + (mid + 1);
            }
            else if(arr1[mid] < search){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return "notfound";

    }
    
    
    public static void main(String[] args) {
        int choice;

        Scanner sc = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();
        System.out.println("Enter The Size of the array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        do{
        
            System.out.println("Enter Searching Element");
            int search = sc.nextInt();
            String result = bs.Binary(arr1, n, search);

            switch (result) {
                case "null" -> System.out.println("Array must have at least one element.");
                case "notfound" -> System.out.println("the element is not found in the array");
                default -> System.out.println("the element is in the position " + result);
            }

            System.out.println("Do you want to search again? yes(1), no(0)");
            choice = sc.nextInt();

        }while(choice == 1);

    }
}
