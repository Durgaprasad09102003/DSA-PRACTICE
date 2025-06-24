/*
Sum of First N Natural Numbers Using Parameterized Recursion

Write a program to compute the sum of the first n natural numbers using parameterized recursion.

In parameterized recursion, an extra argument (typically an accumulator) is passed to the recursive function to keep track of intermediate results.

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

class SummationParameterised {
    public void summation(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        summation(i - 1, sum + i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SummationParameterised sp = new SummationParameterised();
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sp.summation(n, 0);
    }
}
