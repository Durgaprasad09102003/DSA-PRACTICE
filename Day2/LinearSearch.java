/*
Linear Search

Description:
You are given an array of integers nums and an integer target. Implement a function to search for target using linear search. Return the index of the first occurrence of target if found. If the target is not found, return -1.

Example 1:
Input: nums = [4, 2, 7, 1, 3, 5], target = 3  
Output: 4  
Explanation: 3 is present at index 4.



Example 2:
Edit
Input: nums = [10, 20, 30, 40, 50], target = 25  
Output: -1  
Explanation: 25 is not present in the array.




Example 3:
Input: nums = [], target = 5  
Output: -1  
Explanation: The array is empty.
 */


import java.util.Scanner;

class LinearSearch {

    public String Linear(int[] arr1, int n, int search){
        if (n <= 0) {
            return "null";
        }
        
        for(int i=0; i<n; i++){
            if(arr1[i] == search){
                return ""+(i+1);
            }
        }

        return "notfound";
    }


    public static void main(String[] args) {
        int choice;

        Scanner sc = new Scanner(System.in);
        LinearSearch ls = new LinearSearch();
        System.out.println("Enter The Size of the array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        do{
        
            System.out.println("Enter Searching Element");
            int search = sc.nextInt();
            String result = ls.Linear(arr1, n, search);

            switch (result) {
                case "null" -> System.out.println("Array must have at least one element.");
                case "notfound" -> System.out.println("the element is not found in the array");
                default -> System.out.println("the element is in the position " + result);
            }

            System.out.println("Do you want to search again? yes(1), no(0)");
            choice = sc.nextInt();

        }while(choice == 1);

    }
}