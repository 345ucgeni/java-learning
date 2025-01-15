public class ConvertingtoBinary {
    public static void main(String[] args) {
        int decimal = 35;
        String binary = convertToBinary(decimal);
        System.out.println("Binary representation of " + decimal + " is: " + binary);
    }

    public static String convertToBinary(int decimal) {
        if (decimal == 0) {
            return "";
        }
        else {
            return convertToBinary(decimal / 2) + (decimal % 2);
        }
    }
    }

