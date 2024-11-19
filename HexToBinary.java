import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        String hex = sc.nextLine();
        hex = hex.toUpperCase();
        if (hex.length() == 1 && ((hex.charAt(0)>= '0' && hex.charAt(0) >= 9) || (hex.charAt(0)>= 'A' && (hex.charAt(0)<= 'F')))){
            int decimalValue;
            char hexChar = hex.charAt(0);
            if (hexChar >= '0' && hexChar <= '9' ){
                decimalValue = hexChar - '0';
            }
            else{
                decimalValue = hexChar - 'A' + 10;
            }
            int bit1 = decimalValue %2;
            decimalValue = decimalValue/2;
            int bit2 = decimalValue %2;
            decimalValue = decimalValue/2;
            int bit3 = decimalValue %2;
            decimalValue = decimalValue/2;
            int bit4 = decimalValue %2;
            decimalValue = decimalValue/2;

            String binary = bit4 +" " + bit3 + " "+ bit2+" " + bit1;
            System.out.println("Hexadecimal number: "+hexChar);
            System.out.println("Binary: "+binary);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}