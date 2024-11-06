import java.util.Scanner;

public class RPS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Makas(0), taş(1), kağıt(2)");
        int player = sc.nextInt();
        if(player < 0 || player > 2){
            System.out.println("Hata! Sadece 0, 1 veya 2 gir");
        }
        else {
            int computer = (int) (Math.random() * 3);
            switch(computer){
                case 0:
                    if(player == 0){
                        System.out.println("0-0, berabere");
                    }
                    else if(player == 1){
                        System.out.println("0-1, kazandın");
                    }
                    else {
                        System.out.println("0-2, kaybettin");
                    }
                    break;
                    case 1:
                        if(player == 0){
                            System.out.println("1-0, kaybettin");
                        }
                        else if(player == 1){
                            System.out.println("1-1, berabere");
                        }
                        else {
                            System.out.println("1-2, kazandın");
                        }
                        break;
                        case 2:
                            if(player == 0){
                                System.out.println("2-0, kazandın");
                            }
                            else if(player == 1){
                                System.out.println("2-1, kaybettin");
                            }
                            else {
                                System.out.println("2-2, berabere");
                            }
            }
        }
    }

}
