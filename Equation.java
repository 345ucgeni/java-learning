
import java.util.Scanner;


public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();

        int pow = 1;
        for(int i = 1; i <= y; i++){
            pow *= x;}

        int factorial = 1;
        for(int j = 1; j <= x; j++){
            factorial *= j;
        }

        double result = (double) pow/factorial;
        System.out.println(result);


    }

}
