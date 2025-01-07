import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = printNum(num);
        System.out.println("The final result is: " + result);
    }
    public static int printNum(int num) {
        if (num >= 10){
            int product = 1;
            while (num > 0){
                product *= num%10;
                num /= 10;
            }
            return printNum(product);

        }
        else{
            return num;
        }
    }
}