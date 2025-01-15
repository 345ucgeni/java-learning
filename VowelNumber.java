import java.util.Scanner;

public class VowelNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = sc.nextLine();

        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
