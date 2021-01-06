package kapitel04_Operatorer;

import java.util.Scanner;

public class Modulo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        vadÄrKlockan();
    }

    private static void vadÄrKlockan() {
        System.out.println("Hur mycket är klockan?");
        String klockslag = scanner.nextLine();
        String[] listaUppdeladPåTimmeOchMinut = klockslag.split(":");
        System.out.println("Längden av min lista är " + listaUppdeladPåTimmeOchMinut.length);
        System.out.println("Timmar = " + listaUppdeladPåTimmeOchMinut[0]);
        System.out.println("Minuter = " + listaUppdeladPåTimmeOchMinut[1]);
    }
}
