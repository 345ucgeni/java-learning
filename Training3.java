import java.util.Scanner;
import java.util.Arrays;

public class Training3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr= new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter array elements: ");
            int elt1 = sc.nextInt();
            for (int j = 0; j < 4; j++) {
                int elt2 = sc.nextInt();
                arr[i][j] = elt1 + elt2;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
