import java.util.Scanner;

public class PTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter column: ");
        int column = sc.nextInt();
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        Pascal(row, column);
        System.out.println("Pascal("+ row +", "+ column + ") = " + Pascal(row, column) );
    }
    public static int Pascal(int row, int column) {
        if(column == 0 || column == row){
            return 1;
        }
        else{
            return Pascal(row-1, column) + Pascal(row-1, column-1);
        }

    }
}
