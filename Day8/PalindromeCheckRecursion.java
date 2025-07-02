/*
Palindrome Check Using Recursion

Write a recursive function to check whether a given string is a palindrome.
A palindrome is a word, phrase, or sequence that reads the same backward as forward.

Example 1:
Input: str = "madam"
Output: true

Example 2:
Input: str = "hello"
Output: false

Constraints:
- 1 <= str.length <= 10^5
- The string contains only lowercase/uppercase English letters.
*/

import java.util.Scanner;

public class PalindromeCheckRecursion {

    public boolean isPalindrome(int n, String str) {
        if (n >= str.length() / 2) return true;
        if (str.charAt(n) != str.charAt(str.length() - n - 1)) return false;
        return isPalindrome(n + 1, str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeCheckRecursion obj = new PalindromeCheckRecursion();
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Is palindrome: " + obj.isPalindrome(0, str));
    }
}
