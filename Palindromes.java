
import java.util.Scanner;


public class Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        str = str.toLowerCase();
        palindrome(str);
    }

    public static String palindrome(String plnd) {
        for (int i = 0; i < plnd.length(); i++) {
            if(plnd.charAt(i) != plnd.charAt(plnd.length()- 1 - i)){
                System.out.println("Not palindrome");
                break;
            }
            else{
                System.out.println("Palindrome");
                break;
            }

            
        }
        return plnd;
    }
    
}
