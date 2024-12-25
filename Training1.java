import java.util.Scanner;
import java.util.Arrays;

public class Training1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter array elements: ");
        for (int elements = 0; elements < arr.length; elements++){
            arr[elements] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        if(arr[0] < 0){
            System.out.println("Array starts with negative number");
        }
        else if (arr[0] == 0) {
            System.out.println("Array starts with zero");
        }
        else{
            System.out.println("Array starts with positive number");
            System.out.println("Negative or zero?");
            sc.nextLine();
            String elementChange = sc.nextLine();
            elementChange = elementChange.toLowerCase();
            switch(elementChange){
                case "zero":
                    zero(arr);
                    break;
                case "negative":
                    negative(arr);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }
    public static int zero(int[] arr){
        arr[0] = 0;
        System.out.println("New array: " + Arrays.toString(arr));
        return arr[0];
    }
    public static int negative(int[] arr){
        arr[0] = (int) (Math.random()* -100);
        System.out.println("New array: " + Arrays.toString(arr));
        return arr[0];
    }
}
