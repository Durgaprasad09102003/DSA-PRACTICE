/*
Factorial Using Functional Recursion

Write a program to compute the factorial of a given non-negative integer `n` using functional recursion.

Functional recursion means the result is returned directly through the function call (not through accumulating variables or global state).

Example 1:
Input: n = 5
Output: 120
Explanation: 5! = 5 × 4 × 3 × 2 × 1 = 120

Example 2:
Input: n = 0
Output: 1
Explanation: 0! is defined as 1.

Constraints:
- 0 <= n <= 20
*/

import java.util.Scanner;

public class FactorialFunctional {
    public int factorial(int n, int sum) {
        if (n == 0) return 1;
        return n * factorial(n - 1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactorialFunctional sp = new FactorialFunctional();
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + sp.factorial(n, 0));
    }
}
