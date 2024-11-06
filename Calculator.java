import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("+(1), -(2), *(3), /(4)");
        int c = sc.nextInt();
        switch (c){
            case 1:
                System.out.println(a + b);
                break;
                case 2:
                    System.out.println(a - b);
                    break;
                    case 3:
                        System.out.println(a * b);
                        break;
                        case 4:
                            if (b == 0){
                                System.out.println("You can't divide by zero");
                            }
                            else {
                                System.out.println(a / b);
                            }
                            break;
        }
    }
}
