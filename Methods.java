import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter another number");
        int m = sc.nextInt();
        MaxMin(n, m);
    }
    public static void MaxMin(int n, int m) {
        if (n > m){
            System.out.println(n + " is greater than " + m);
        }
        else if (n < m){
            System.out.println(n + " is less than " + m);
        }
        else{
            System.out.println(n + " is equal to " + m);
        }
    }
}
