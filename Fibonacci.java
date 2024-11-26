
import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many terms of Fibonacci series do you want?: ");
        int n = sc.nextInt();
        System.out.println("0");
        System.out.println("1");

        int a=0, b=1;
        int counter = 2;
        while (counter < n) {
            counter++;
            int c = a+b;
            a=b;
            b=c;
            System.out.println(c);
            
        }
    }

}
