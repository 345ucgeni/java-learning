import java.util.Scanner;

public class Trial1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        boolean exist =false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Target: " +target +" found at: (" + i + ", " + j + ")");
                    exist = true;
                    break;
                }
            }
            if (exist) break;
        }

        if (!exist) {
            System.out.println("Target not found.");
        }
    }
}