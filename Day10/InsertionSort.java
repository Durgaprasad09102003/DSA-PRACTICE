/*
Insertion Sort

Given an array of integers, sort the array using the insertion sort algorithm.

Insertion sort builds the sorted array one element at a time by repeatedly taking the next element and inserting it into its correct position in the already-sorted portion.

Example 1:
Input: nums = [5, 1, 4, 2, 8]
Output: [1, 2, 4, 5, 8]

Example 2:
Input: nums = [3, 3, 3]
Output: [3, 3, 3]

Constraints:
- 1 <= nums.length <= 10^5
- -10^9 <= nums[i] <= 10^9
*/




import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public int[] Insertion(int arr[], int n){
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertionSort is = new InsertionSort();
        System.out.println("Enter The Size of the array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        

        int[] result = is.Insertion(arr1, n);

        System.out.println(Arrays.toString(result));
    }
}
