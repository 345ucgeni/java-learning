
import java.util.Scanner;


public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month(1-12): ");
        int month = sc.nextInt();
        if (month < 1 || month > 12){
            System.out.println("Invalid input");
        }
        if (month == 2){
            System.out.println("Enter a year: ");
            int year = sc.nextInt();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println("February, 29 days, winter.");
            }
            else{
                System.out.println("February, 28 days, winter.");
            }
        }
        System.out.println(month + " ");

        switch(month){
            case 1, 12, 2: System.out.println("winter");
                break;
            case 3, 4, 5:System.out.println("spring");
                break;
            case 6, 7, 8: System.out.println("summer");
                break;
            case 9, 10, 11: System.out.println("fall");
                break;        
        }
        switch (month) {
            case 1, 3,5,7,8,10,12: System.out.println("31 days");
                break;
            case 4,6,9,11: System.out.println("30 days");
                break;
        }
    }
}