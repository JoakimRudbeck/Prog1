package Annat;
import java.util.Scanner;

public class PROVMALL_FÖRNAMN_EFTERNAMN{

    /*
    =============================================
    Din poäng:
    Betyg:

    =============================================
                ### BETYGSGRÄNSER ###

                TOTALT: 18   POÄNG

                    E:  6    POÄNG
                    D:  8    POÄNG
                    C:  10   POÄNG
                    B:  12.5 POÄNG
                    A:  15   POÄNG

    ============================================
    */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for(;;){
            System.out.println("Vilken uppgift vill du köra?");
            int val = Integer.valueOf(scanner.nextLine());
            switch (val){
                case 1: uppgift1(); break;
                case 2: uppgift2(); break;
                case 3: uppgift3(); break;
                case 4: uppgift4(); break;
            }
        }
    }

    static void uppgift1() {
        System.out.println("Uppgift1:");
    }

    static void uppgift2() {
        System.out.println("Uppgift2:");
    }

    static void uppgift3() {
        System.out.println("Uppgift3:");
    }

    static void uppgift4() {
        System.out.println("Uppgift4:");
    }
}