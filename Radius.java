import java.util.Scanner;

public class Radius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Yarıçap değeri giriniz: ");
        double radius = sc.nextDouble();
        System.out.println("Dairenizin alanı: " + (radius * radius * 3));
    }
}
