import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        int number = sc.nextInt();
        int cpunum = (int)(Math.random()*100);
        while (number != cpunum){
            guess(number, cpunum);
            number = sc.nextInt();
        }
        System.out.println("Correct guess!");

    }
    public static void guess(int user, int pc){
        if (user > pc){
            System.out.println("Try lower");
        }
        else{
            System.out.println("Try higher");
        }
    }


    
}
