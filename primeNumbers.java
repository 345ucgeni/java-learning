
import java.util.Scanner;


public class primeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if(start < 2){
                System.out.println("Not a prime number");
                continue;
            }    
        
        for (int j = 2; j < i; j++){
            if(i % j == 0){
                isPrime = false;

            }
            
        }
        if(isPrime){
            System.out.println(i);
        }
    }
    }

}
