/*

Reverse Digits of an Integer
Description
Given an integer n, return the integer formed by reversing the digits of n.

If n is negative, the reversed number should also be negative.

Leading zeros in the reversed number should be omitted.

The input number may be zero.

Example 1:
Input: n = 25
Output: 52

Explanation: Reversing digits of 25 results in 52.



Example 2:
Input: n = 123
Output: 321

Explanation: Reversing digits of 123 results in 321.



Example 3:
Input: n = -400
Output: -4

Explanation: Reversing digits of -400 results in -004, which is -4 after removing leading zeros.



Example 4:
Input: n = 0
Output: 0

Explanation: Reversing digits of 0 results in 0.



Constraints
-10^9 <= n <= 10^9

*/

import java.util.Scanner;

class ReverseDigits{
    public int reverse(int x) {
        int digit = 0, temp, sign;

        sign = x > 0 ?  1 : -1;
        x = x < 0 ?  (x * (-1)) : x;
        
        while(x>0){
            if(digit > Integer.MAX_VALUE/10 || digit < Integer.MIN_VALUE/10){
                return 0;
            }
            else{
            temp = x % 10;
            digit = temp + (digit * 10);
            x = x / 10;
            }
        }

        digit = sign < 0 ?  digit * sign : digit;

        return digit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseDigits obj = new ReverseDigits();
        int num = sc.nextInt();
        System.out.println(obj.reverse(num));
    }
}