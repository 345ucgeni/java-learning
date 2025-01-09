import java.util.Scanner;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int index = sc.nextInt();
        int[] arr = new int [index];
        System.out.println("Enter the elements of the array: ");
        for( int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        String arry = Arrays.toString(arr);
        System.out.println("The sorted array is: " + arry);
        int result = findthebiggest(arr, index - 1);
        System.out.println("The biggest number is: " + result);
    }
    public static int findthebiggest(int[] arr, int index) {
        if ( index == 0){
            return arr[index];
        }
        else{
            return Math.max(arr[index], findthebiggest(arr, index - 1));
        }

    }
}
