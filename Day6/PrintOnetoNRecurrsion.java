import java.util.Scanner;

public class PrintOnetoNRecurrsion {
    public void onetoN(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        onetoN(i+1,n);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintOnetoNRecurrsion obj = new PrintOnetoNRecurrsion();
        System.out.println("Enter the number of times you want to print the Number");
        int n = sc.nextInt();
        obj.onetoN(1, n);
    }
}
