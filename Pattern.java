
import java.util.Scanner;


public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        path(n);
        System.out.println();
        reversePath(n);
    }
    public static void path(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = i; j <= n; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
            for(int m = 1; m <= i; m++){
                System.out.println(" ");
            }   
        }
    }
    public static void reversePath(int n) {
        for (int i = n; i > 0; i--) {
            for(int m = 1; m <= i; m++){
                System.out.print(" ");
            }
            System.out.println();
            for(int j = i; j <= n; j++){
                System.out.print(i+ " ");
            }   

            System.out.println();
        }

    }
}