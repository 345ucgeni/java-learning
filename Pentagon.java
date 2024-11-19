import java.util.Scanner;
import java.lang.Math;

public class Pentagon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vertex of pentagon: ");
        double r = sc.nextDouble();
        double s = 2*r*Math.sin(Math.PI/5);
        double area = (5*Math.pow(s, 2))/(4*Math.tan(Math.PI/5));
        System.out.println("Side length: "+s);
        System.out.println("Area: "+area);
    }

}
