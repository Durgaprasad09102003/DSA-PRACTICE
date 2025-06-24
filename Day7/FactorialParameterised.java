/*
Factorial Using Parameterized Recursion

Write a program to compute the factorial of a given non-negative integer `n` using parameterized recursion.

In parameterized recursion, an additional parameter (typically an accumulator) is passed to each recursive call to keep track of the computation state.

Example 1:
Input: n = 5
Output: 120
Explanation: factorial(5) = 5 × 4 × 3 × 2 × 1 = 120

Example 2:
Input: n = 0
Output: 1
Explanation: 0! is defined as 1.

Constraints:
- 0 <= n <= 20
*/

import java.util.Scanner;

public class FactorialParameterised {
    public void factorial(int i, int product) {
        if (i <= 1) {
            System.out.println(product);
            return;
        }
        factorial(i - 1, product * i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactorialParameterised sp = new FactorialParameterised();
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sp.factorial(n, 1);
    }
}
