import java.util.Scanner;
public class PrdTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        producting(n);
    }
    public static void producting(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * n + " ");
        }
    }
}
