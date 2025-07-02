package Day10;
/*
Selection Sort

Given an array of integers, implement the Selection Sort algorithm to sort the array in ascending order.

Selection Sort works by repeatedly finding the minimum element from the unsorted portion of the array and moving it to the beginning.

Example 1:
Input: nums = [64, 25, 12, 22, 11]
Output: [11, 12, 22, 25, 64]

Example 2:
Input: nums = [5, 1, 4, 2, 8]
Output: [1, 2, 4, 5, 8]

Constraints:
- 1 <= nums.length <= 10^5
- -10^9 <= nums[i] <= 10^9
*/




import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public int[] Selection(int arr1[], int n){
        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(arr1[j] < arr1[min]){
                    min=j;
                }
            }
            int temp = arr1[min];
            arr1[min] = arr1[i];
            arr1[i] = temp;

        }

        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelectionSort ss = new SelectionSort();
        System.out.println("Enter The Size of the array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        

        int[] result = ss.Selection(arr1, n);

        System.out.println(Arrays.toString(result));
    }
}
