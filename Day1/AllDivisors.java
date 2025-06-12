/*
Find All Divisors of an Integer
You are given a positive integer n. Your task is to find all divisors of n and return them in a sorted list.

A divisor of n is any number d such that n % d == 0.


Example 1:
Input: n = 6
Output: [1, 2, 3, 6]

Explanation: 6 is divisible by 1, 2, 3, and 6.



Example 2:
Input: n = 8
Output: [1, 2, 4, 8]

Explanation: 8 is divisible by 1, 2, 4, and 8.



✅ Constraints:
1 <= n <= 10^6
 */

import java.util.*;
class AllDivisors{
    public int[] divisors(int n) {
        List<Integer> arr1 = new ArrayList<>();

        int sqrt = (int)Math.sqrt(n);
        for(int i = 1; i<= sqrt; i++){
            if(n%i == 0){
                arr1.add(i);
                if(i != n/i){
                    arr1.add(n/i);
                }
            }
        }

        int[] result = new int[arr1.size()];
        for(int i=0; i < arr1.size(); i++){
            result[i] = arr1.get(i);
        }

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AllDivisors obj = new AllDivisors();
        int num = sc.nextInt();
        System.out.println(Arrays.toString(obj.divisors(num)));
    }
    
}