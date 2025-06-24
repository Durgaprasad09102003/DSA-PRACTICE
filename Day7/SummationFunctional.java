/*
Sum of First N Natural Numbers Using Functional Recursion

Write a program to compute the sum of the first n natural numbers using functional recursion.

Functional recursion means returning the result directly through function calls without using global state or accumulating variables.

Example 1:
Input: n = 5
Output: 15
Explanation: 5 + 4 + 3 + 2 + 1 = 15

Example 2:
Input: n = 0
Output: 0

Constraints:
- 0 <= n <= 10^6
*/

import java.util.Scanner;

public class SummationFunctional {
    public int summation(int i, int sum) {
        if (i == 0) return 0;
        return i + summation(i - 1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SummationFunctional sp = new SummationFunctional();
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Sum of first " + n + " natural numbers is " + sp.summation(n, sum));
    }
}
