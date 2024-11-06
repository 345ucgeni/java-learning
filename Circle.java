import java.util.Scanner;


public class Circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Noktanın x değeri: ");
        int x = sc.nextInt();
        System.out.println("Noktanın y değeri: ");
        int y = sc.nextInt();

        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (d < 10) {
            System.out.println("Nokta dairenin içinde.");
        }
        else if (d == 10) {
            System.out.println("Nokta dairenin üzerinde.");
        }
        else{
            System.out.println("Nokta dairenin dışında.");
        }


    }
}
