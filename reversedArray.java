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
        reversedArray(arr, 0 ,index - 1);
        System.out.println("Reversed array: ");
        for(int array: arr){
            System.out.print(array + " ");
        }

    }
    public static void reversedArray(int[] arr, int start ,  int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reversedArray(arr, start + 1, end - 1);

    }
}
