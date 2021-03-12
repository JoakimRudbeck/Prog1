package annat;

import static java.lang.Thread.sleep;

public class CountDown {

    private static final int MINUTER_KVAR = 6*60;
    private static final int TALBAS = 2; // funkar med 2, 8, 10, 16
    private static String MEDDELANDE = "Tid kvar av passet: ";
    private static String SLUT_MEDDELANDE = "Nu är rasten slut";

    public static void main(String[] args) throws InterruptedException {
        countDown(MINUTER_KVAR, TALBAS, 1000);
    }

    private static void countDown(long minuterKvar, int bas, int millis) throws InterruptedException {
        for(long i = 60*minuterKvar; i >= 0; i--){
            System.out.print(MEDDELANDE.toUpperCase());
            switch(bas){
                case 2:
                    System.out.println(Long.toBinaryString(i));
                    break;
                case 8:
                    System.out.println(Long.toOctalString(i));
                    break;
                case 10:
                    System.out.println(i);
                    break;
                case 16:
                    System.out.println(Long.toHexString(i));
                    break;
                default:
                    System.out.println(i);

            }
            sleep(millis);
        }
        System.out.printf("#### %s ####", SLUT_MEDDELANDE.toUpperCase());
    }

}
