import java.util.Scanner;

public class PrintNtoOneRecurrsion {
    public void ntoOne(int i, int n){
        if(i < 1){
            return;
        }
        System.out.println(i);
        ntoOne(i-1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNtoOneRecurrsion obj = new PrintNtoOneRecurrsion();
        System.out.println("Enter the number of times you want to print the Number");
        int n = sc.nextInt();
        obj.ntoOne(n, n);
    }
}
