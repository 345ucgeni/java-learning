
import java.util.Scanner;



public class negativeOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        while ((num%2 == 0 && num < 0) || num >= 0) {
            System.out.println("Enter number");
            num = sc.nextInt();
         
            if(num%2 != 0 && num < 0){
                System.out.println("Program terminated.");
            }
        }
    }

}
