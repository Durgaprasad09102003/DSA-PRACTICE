/*

Greatest Common Divisor (GCD) of Two Numbers


Description
Given two integers n1 and n2, return the Greatest Common Divisor (GCD) of the two numbers.

The Greatest Common Divisor of two integers is the largest positive integer that divides both numbers without leaving a remainder.

Example 1:
Input: n1 = 4, n2 = 6
Output: 2

Explanation: Divisors of 4 are {1, 2, 4}, divisors of 6 are {1, 2, 3, 6}. The greatest common divisor is 2.




Example 2:
Input: n1 = 9, n2 = 8
Output: 1

Explanation: Divisors of 9 are {1, 3, 9}, divisors of 8 are {1, 2, 4, 8}. The greatest common divisor is 1.




Constraints
1 <= n1, n2 <= 10^9

*/

import java.util.Scanner;
class GreatestCommonDivisor {
    public int GCD(int n1, int n2) {
        int temp;

        while(n2 != 0){
            temp = n1;
            n1 = n2;
            n2 = temp % n2;
        }
        return n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GreatestCommonDivisor obj = new GreatestCommonDivisor();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(obj.GCD(num1, num2));
    }
}