/*

Implement Bubble Sort

Given an array of integers nums, sort the array in ascending order using the Bubble Sort algorithm and return the sorted array.

Note: You must implement the sorting logic using the Bubble Sort technique and not use built-in sorting methods such as Arrays.sort().


Example 1:
Input: nums = [5, 1, 4, 2, 8]
Output: [1, 2, 4, 5, 8]



Example 2:
Input: nums = [3, 2, 1]
Output: [1, 2, 3]



Constraints:
1 <= nums.length <= 1000

-10^4 <= nums[i] <= 10^

*/


import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public int[] Bubble(int arr1[], int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        return arr1;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort bs = new BubbleSort();
        System.out.println("Enter The Size of the array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        

        int[] result = bs.Bubble(arr1, n);

        System.out.println(Arrays.toString(result));
    }
}
