import java.util.Scanner;

public class annualTax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Submit your income: ");
        double income = sc.nextInt();
        double tax = income * 18 / 100;
        System.out.println("Your tax amount: " + tax);
    }
}
