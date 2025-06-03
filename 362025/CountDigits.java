/*

Count the Number of Digits
Description
Given an integer n, return the number of digits in the number.

If n is 0, return 1 (as 0 is a single-digit number).

If n is negative, consider its absolute value when counting digits.

Example 1:
Input: n = 4
Output: 1

Explanation: 4 has only 1 digit.



Example 2:
Input: n = 14
Output: 2

Explanation: 14 has 2 digits.



Example 3:
Input: n = 0
Output: 1

Explanation: 0 is a single-digit number.


Example 4:
Input: n = -456
Output: 3

Explanation: The number -456 has 3 digits when the sign is ignored.


Constraints
-10^9 ≤ n ≤ 10^9

The number has no leading zeroes unless it is 0 itself.

*/


import java.util.*;

class CountDigits {
    public int countDigit(int n) {
        if(n == 0){
            return 1;
        }
        
        int digit = 0;

        n = n < 0 ? -n : n;

        while(n > 0){
            digit++;
            n = n/10;
        }

        return digit;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountDigits obj = new CountDigits();
        int num = sc.nextInt();
        System.out.println(obj.countDigit(num));
    }
}