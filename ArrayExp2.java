import java.util.Scanner;
import java.util.Arrays;

public class ArrayExp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length: ");
        int n = sc.nextInt();
        while (n > 10 || n < 1) {
            System.out.println("Try again: ");
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        System.out.println(FillArr(arr));
    }

    public static String FillArr(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return Arrays.toString(arr);
    }
}
