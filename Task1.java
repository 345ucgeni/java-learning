import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int num1 = sc.nextInt();
        System.out.println("Bir sayı daha girin");
        int num2 = sc.nextInt();
        int toplam = num1 + num2;
        int cikar = num1 - num2;
        int bol = num1 / num2;
        int carp = num1 * num2;
        System.out.println("Toplam = " + toplam);
        System.out.println("Cikar = " + cikar);
        System.out.println("Bol = " + bol);
        System.out.println("Carp = " + carp);


    }
}

