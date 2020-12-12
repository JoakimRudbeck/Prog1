package kapitel09_Metoder;

import java.util.Scanner;

public class E_uppgifter_praktiskt_prov {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Namn?
        Joakim Cronelöv
        Favoritfärg?
        Blå
        Ålder?
        29

        Du heter Cronelöv i efternamn.
        Din favoritfärg är blå. Blå består av 3 bokstäver
        Du är vuxen.
        Du fyller jämnt om 1 år.

        */
        String fullständigtNamn = frågaEfterNamn("Namn?");
        String färg = frågaEfterFärg();
        int ålder = frågaEfterÅlder();
        skrivaUtEfternamn(fullständigtNamn);
        skrivUtInfoOmFärgen(färg);
        String typAvPerson = geMigTypAvPerson(ålder);
        System.out.println("Du är " + typAvPerson + ".");
        int årKvarTillJämnt = beräknaÅrKvarTillJämnt(ålder);
        System.out.println("Du fyller jämnt om " + årKvarTillJämnt + " år.");
    }

    static void skrivUtInfoOmFärgen(String färg) {
        System.out.println("Din favoritfärg är " + färg + "." + färg + " består av " + färg.length() + " bostäver.");
    }

    static int frågaEfterÅlder() {
        System.out.println("Ålder?");
        return Integer.valueOf(scan.nextLine());
    }

    static String frågaEfterFärg() {
        System.out.println("Favoritfärg?");
        return scan.nextLine();
    }

    static String frågaEfterNamn(String s) {
        System.out.println(s);
        return scan.nextLine();
    }

    static int beräknaÅrKvarTillJämnt(int ålder) {
        int årSedanJämnt = ålder % 10;
        return 10 - årSedanJämnt;
    }

    static String geMigTypAvPerson(int ålder) {
        String typAvPerson = "vuxen";

        if(ålder < 18){
            typAvPerson = "barn";
        }
        else if(ålder >=65){
            typAvPerson = "pensionär";
        }
        return typAvPerson;
    }

    static void skrivaUtEfternamn(String fullständigtNamn) {
        int indexOfSpace = fullständigtNamn.indexOf(' ');
        String efternamn = fullständigtNamn.substring(indexOfSpace);
        System.out.println("Du heter " + efternamn + " i efternamn.");
    }
}