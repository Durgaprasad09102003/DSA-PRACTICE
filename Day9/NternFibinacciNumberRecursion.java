import java.util.Scanner;
public class NternFibinacciNumberRecursion {
    public int fibinacci(int i){
       if(i<=1) return i;
       int last = fibinacci(i-1);
       int secondLast = fibinacci(i-2);
       return last+secondLast;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NternFibinacciNumberRecursion obj = new NternFibinacciNumberRecursion();
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        System.out.println("Nth term of the Fibonacci series is:");
        System.out.println(obj.fibinacci(n));
    }
}
