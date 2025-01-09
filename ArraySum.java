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
        int result = sum(arr, index - 1);
        System.out.println("Sum of the elements in array is: " + result);
    }
    public static int sum(int[] arr, int index){
        if(index == 0){
            return arr[0];
        }
        else{
            return arr[index] + sum(arr, index - 1);
        }
    }
}
