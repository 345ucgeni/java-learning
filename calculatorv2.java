import java.util.Scanner;
public class calculatorv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("==== Calculator Menu ====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int number = sc.nextInt();
            if(number == 0) {
                System.out.println("Exiting the program...");
                break;
            }

            System.out.println("Enter 2 double number: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double result =0 ;
            switch(number) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = sub(num1, num2);
                    break;
                case 3:
                    result = mul(num1, num2);
                    break;
                case 4:
                    if(num2==0){
                        System.out.println("You can't divide by zero");
                        continue;
                    }
                    else {
                        result = div(num1, num2);
                    }
                    break;
                case 5:
                    result = power(num1, num2);
                    break;

            }
            System.out.println("Result is : " + result);
        }

    }
    public static double add(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        return a/b;
    }
    public static double power(double a, double b){
        return Math.pow(a,b);
    }

}
