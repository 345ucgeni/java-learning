import java.util.Scanner;

public class GettingReadyForFinalsv1 {

 public static void print(int n){
     int j;
     for(int i = 1; i <= n; i++) {
         for (j = 1; j <= n - i; j++){
             System.out.print(".");}
         while (j <= n) {
             System.out.print(i);
             j++;
         }
         System.out.println();
     }
     }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     int input = sc.nextInt();
     print(input);
 }
 }


