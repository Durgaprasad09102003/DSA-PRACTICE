
import java.util.Scanner;

class PrintNtimesRecurrsion{

    private void printNtimes(int i){
        if(i>0){
            i--;
            System.out.println("Durga Prasad");
            printNtimes(i);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNtimesRecurrsion obj = new PrintNtimesRecurrsion();
        System.out.println("Enter the number of times you want to print the message");
        int n = sc.nextInt();
        obj.printNtimes(n);

    
    }
}