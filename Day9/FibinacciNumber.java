import java.util.Scanner;

class FibinacciNumber{

    public void fibinacci(int i){
        if(i>=0){
            System.out.print(" 0");
            }
        if(i>=1) {
            System.out.print(" 1");
        }    
        if(i>1){
            int a=0;
            int b=1;
            int c=0;
            for(int j=2;j<i;j++){
                c=a+b;
                a=b;
                b=c;
                System.out.print(" "+c);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibinacciNumber obj = new FibinacciNumber();
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series");
        obj.fibinacci(n);
    }
}