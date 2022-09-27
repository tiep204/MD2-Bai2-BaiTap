import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");


        Scanner sc = new Scanner(System.in);
        //// in hinh chu nhat

//        System.out.println("*****************MENU********************");
//        for ( int i=1; i<=3 ; i++){
//            for(int j = 1; j<10; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

    //// in hinh tam giac vuong
//        System.out.println("****************MENU*****************");
//        for ( int i = 1 ; i<=5; i++){
//            for(int j=1; j<i; j++){
//                System.out.print(" * ");
//
//            }
//            System.out.println("\n");
//
//        }
        //// in hinh tam giac nguoc
        System.out.println("****************MENU*****************");
        for (int i=6; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("  *  ");
            }
            System.out.println("\n");

        }


    }
}