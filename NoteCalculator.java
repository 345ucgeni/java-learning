/* This calculator uses ATU AI Eng.'s junior year grading system. */
/* Bell curve system isn't used. */
import java.util.Scanner;
public class NoteCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which lesson's note are you calculating?: ");
        System.out.println("Calculus (1)");
        System.out.println("Physics (2)");
        System.out.println("Introduction to AI Eng. (3)");
        System.out.println("Programming (4)");
        System.out.println("Physics Lab (5)");
        System.out.println("Academic English (6)");
        System.out.println("Turkish Language (7)");
        System.out.println("History (8)");
        int choice = sc.nextInt();
        choiceCalc(choice);
    }
    public static void choiceCalc(int choice) {
        Scanner sc = new Scanner(System.in);
        if (choice == 1 || choice == 2 || choice == 3 || choice == 6 || choice == 7 || choice == 8) {
            System.out.println("Midterm: ");
            int inputmidterm = sc.nextInt();
            System.out.println("Final: ");
            int inputfinal = sc.nextInt();
            int midterm = inputmidterm * 40 /100;
            int finalexam = inputfinal *60 /100;
            int total = midterm + finalexam;
            letterGrade(total);
        }
        else if (choice == 4) {
            System.out.println("Midterm: ");
            int inputmidterm = sc.nextInt();
            System.out.println("Final: ");
            int inputfinal = sc.nextInt();
            System.out.println("Quiz 1: ");
            int quiz1 = sc.nextInt();
            System.out.println("Quiz 2: ");
            int quiz2 = sc.nextInt();
            System.out.println("Quiz 3: ");
            int quiz3 = sc.nextInt();
            System.out.println("Quiz 4: ");
            int quiz4 = sc.nextInt();
            int quizzes = (quiz1 + quiz2 + quiz3 + quiz4)/20 ;
            int midterm = inputmidterm * 35 /100;
            int finalexam = inputfinal *45 /100;
            int total = quizzes + midterm + finalexam;
            letterGrade(total);
        }
        else if (choice == 5) {
            System.out.println("Average of quizzes: ");
            int inputquiz = sc.nextInt();
            System.out.println("Average of lab reports: ");
            int inputreport = sc.nextInt();
            System.out.println("Final: ");
            int inputfinal = sc.nextInt();
            int finalexam = inputfinal *40 /100;
            int quiz = inputquiz * 20 /100;
            int labreports = inputreport * 40/100;
            int total = quiz + labreports + finalexam;
            letterGrade(total);
        }
        else{
            System.out.println("Invalid.");
        }
    }
    public static void letterGrade(int total) {
        if (total <= 100 && total >= 90) {
            System.out.println("AA");
        }
        else if (total < 90 && total >= 80) {
            System.out.println("BA");
        }
        else if (total < 80 && total >= 75) {
            System.out.println("BB");
        }
        else if (total < 75 && total >= 70) {
            System.out.println("CB");
        }
        else if (total < 70 && total >= 60) {
            System.out.println("CC");
        }
        else if (total < 60 && total >= 55) {
            System.out.println("DC");
        }
        else if (total < 55 && total >= 50) {
            System.out.println("DD");
        }
        else if (total < 50 && total >= 40) {
            System.out.println("FD");
        }
        else if (total < 40) {
            System.out.println("FF");
        }
        else{
            System.out.println("Invalid.");
        }
    }
}
