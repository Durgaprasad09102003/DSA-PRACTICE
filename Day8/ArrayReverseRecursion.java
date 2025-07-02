/*
Reverse an Array Using Recursion

Write a program to reverse an array using recursion.

The reversal should be done in-place using a two-pointer recursive approach.

Example 1:
Input: arr = [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]

Example 2:
Input: arr = [10, 20, 30]
Output: [30, 20, 10]

Constraints:
- 1 <= arr.length <= 10^5
*/

import java.util.Scanner;

public class ArrayReverseRecursion {

    public void reverseArray(int arr[], int li, int ui) {
        if (li > ui) return;
        int temp = arr[li];
        arr[li] = arr[ui];
        arr[ui] = temp;
        reverseArray(arr, li + 1, ui - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayReverseRecursion obj = new ArrayReverseRecursion();
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        obj.reverseArray(arr, 0, n - 1);

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
