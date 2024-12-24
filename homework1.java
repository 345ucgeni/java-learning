import java.util.Arrays;

public class homework1 {
    public static void main(String[] args) {
        int[] arr = {2, 4,6,8,10, 12,14, 16};
        System.out.println("Array: " + Arrays.toString(arr));
        reverseArr(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static int reverseArr(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        return arr.length;
    }
}
