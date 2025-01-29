import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the edge a: ");
        int a = sc.nextInt();
        System.out.println("Enter the edge b: ");
        int b = sc.nextInt();
        euclid(a, b);
    }
    public static void euclid(int a, int b) {
        int c = (int) Math.sqrt(a*a + b*b);
        int area = (a * b) / 2;
        int perimeter = a+b+c;
        System.out.println("Perimeter of the triangle: " + perimeter);
        System.out.println("Area of the triangle: " + area);
        System.out.println("Hypotenuse of the triangle: " + c);
    }
}
