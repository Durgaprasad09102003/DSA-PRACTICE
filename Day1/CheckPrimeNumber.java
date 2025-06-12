/*
Check for Prime Number

Problem Description:
You are given an integer n. You need to check if the number is prime or not.
Return true if it is a prime number, otherwise return false.

Definition:
A prime number is a number that has exactly two distinct positive divisors: 1 and itself.

Constraints:
1 <= n <= 5000

Input:
A single integer n.

Output:
Return true if n is a prime number, otherwise false.

Examples:
Example 1:
Input: n = 5  
Output: true  
Explanation: The only divisors of 5 are 1 and 5. So, it's prime.




Example 2:
Input: n = 8  
Output: false  
Explanation: 8 has divisors 2 and 4 apart from 1 and itself.




Example 3:
Input: n = 9  
Output: false  
Explanation: 9 is divisible by 3.
 */

import java.util.Scanner;

public class CheckPrimeNumber {
    public boolean isPrime(int n) {
            //your code goes here

        if(n==1){
        return false;
        }

        int sqrt = (int)Math.sqrt(n);

        for(int i=2; i<= sqrt; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckPrimeNumber obj = new CheckPrimeNumber();
        int num = sc.nextInt();
        System.out.println(obj.isPrime(num));
    }
}
