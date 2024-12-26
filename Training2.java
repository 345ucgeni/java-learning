import java.util.Scanner;
import java.util.Arrays;
public class Training2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter surname:");
            String surname = sc.nextLine();
            int inputnum = i + 1;
            System.out.println("Input number " + inputnum + " has been saved successfully.");
            String fullname = name + " " + surname;
            arr[i] = fullname;
        }
        System.out.println(Arrays.toString(arr));
    }
}
