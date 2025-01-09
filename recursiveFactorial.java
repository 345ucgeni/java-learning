import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int num = sc.nextInt();
        int factorial = Calculate(num);
        if( num < 0 ) {
         System.out.println("Invalid");}
        else{
            System.out.println("Factorial of " + num + " = " + factorial);
        }
    }
    public static int Calculate(int num) {
        if ( num == 0 || num ==1){
            return 1;
        }
        else{
            num *= Calculate(num -1);
            return num;
        }
        }
    }
