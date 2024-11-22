import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        double num1 = (Math.random()*10);
        double num2 = (Math.random()*10);
        double num3 = (Math.random()*10);

        double num = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=");

        while (num == num3 ? true : false) {
           if (num == num3) {
               System.out.println(num + "=" + num3);
               System.out.println(num + "is our chosen number.");
           }

           else {
               System.out.println(num + "!=" + num3);
               continue;
           }
        }
    }
}

