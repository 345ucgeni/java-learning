import java.util.Scanner;

public class carRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the velocity of car1: ");
        int v1 = sc.nextInt();
        System.out.println("Enter the velocity of car2: ");
        int v2 = sc.nextInt();
        System.out.println("Enter the race area(between 1-3): ");
        int area = sc.nextInt();
        switch(area){
            case 1:
            v1 = v1 + 150;
            v2 = v2 + 100;
            if (v1 < v2){
                System.out.println("Car2 is the winner");
            }
            else if (v2 == v1){
                System.out.println("Draw");
            }
            else{
                System.out.println("Car1 is the winner");
            }
            break;

            case 2:
            v1 = v1 + 100;
            v2 = v2 + 120;
            if (v1 < v2){
                System.out.println("Car2 is the winner");
            }
            else if (v2 == v1){
                System.out.println("Draw");
            }
            else{
                System.out.println("Car1 is the winner");
            }
            break;

            case 3:
            v1 = v1 + 170;
            v2 = v2 + 200;
            if (v1 < v2){
                System.out.println("Car2 is the winner");
            }
            else if (v2 == v1){
                System.out.println("Draw");
            }
            else{
                System.out.println("Car1 is the winner");
            }
            break;

            default:
            System.out.println("Invalid input");
        } 
    }
    
}
