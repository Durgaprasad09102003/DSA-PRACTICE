/*
Check if the Number is an Armstrong Number

Given an integer n, return true if it is an Armstrong number, and false otherwise.

An Armstrong number is a number that is equal to the sum of its digits raised to the power of the number of digits.

Mathematically:
For an integer n with k digits:
If
n = d₁^k + d₂^k + ... + dₖ^k  
Then n is an Armstrong number.

Constraints:
0 <= n <= 10^9

Example 1:
Input: n = 153
Output: true
Explanation: 1^3 + 5^3 + 3^3 = 153


Example 2:
Input: n = 9474
Output: true
Explanation: 9^4 + 4^4 + 7^4 + 4^4 = 9474


Example 3:
Input: n = 123
Output: false
 */

import java.util.Scanner;
 class ArmstrongNumber {
    public boolean isArmstrong(int n) {
        int len = n == 0 ? 1 : (int)(Math.log10(n) + 1);
        int temp, sum = 0, check = n;
        while(n > 0){
            temp = n % 10;
            sum = sum + (int)Math.pow(temp, len);
            n = n / 10;
        }

        if(check == sum){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArmstrongNumber obj = new ArmstrongNumber();
        int num = sc.nextInt();
        System.out.println(obj.isArmstrong(num));
    }
 }
    
