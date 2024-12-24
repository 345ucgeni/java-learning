import java.util.Scanner;
public class ArrayDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        arr(a);
    }
    public static int arr(int[] a){
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
            else if (a[i] < min){
                min = a[i];
            }
        }
        int diff = max - min;
        System.out.println("The maximum element is: " + max);
        System.out.println("The minimum element is: " + min);
        System.out.println("The difference between the elements of the array is " + diff);
        return diff;
    }

}
