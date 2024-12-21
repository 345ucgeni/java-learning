import java.util.Scanner;

public class arrayfr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ///Kendi içinde ayarlayacağı sayılar
        double[] myList = new double[5];
        for (int i = 1; i < 5; i++) {
           myList[i] = i + myList[i-1];
       }
         myList[0] = myList[1]+myList[4];
        ///Kullanıcıdan alınan sayılar
        int[] inputList = new int[5];
        for (int i = 1; i < 5; i++) {
            inputList[i] = sc.nextInt();
        }
        ///Rastgele sayılar
        double[] mathList = new double[5];
        for (int i = 1; i < 5; i++) {
            mathList[i] = Math.random()*100;
        }

        System.out.println(myList);
        System.out.println(inputList);
        System.out.println(mathList);

    }
}
