import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first city name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter second city name: ");
        String name2 = sc.nextLine();
        System.out.println("Enter third city name: ");
        String name3 = sc.nextLine();

        if (name1.equals(name2) && name1.equals(name3)){
            System.out.println("Same inputs");
        }
        else if (name2.equals(name3)){
            System.out.println("Same inputs");
        }
        else{
            if (name1.compareTo(name2) > 0){
                String temp = name2;
                name1 = name2;
                name1 = temp;
            }
            else if (name1.compareTo(name3) > 0) {
                String temp = name3;
                name1 = name3;
                name3 = temp;
            }
            else if(name2.compareTo(name3) > 0){
                String temp = name3;
                name3 = name2;
                name2 = temp;
            }

        }
        System.out.println("In order: ");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

    }
    
}