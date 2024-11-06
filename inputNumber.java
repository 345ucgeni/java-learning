import java.util.Scanner;

public class inputNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        System.out.println("Answer: " + (num1+num2) );

    }
}
