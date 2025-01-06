import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int celcius = sc.nextInt();
        int fahrenheit = (celcius * 5 / 9) + 32;
        System.out.println("Celcius : " + celcius);
        System.out.println("Fahrenheit : " + fahrenheit);
    }
}
