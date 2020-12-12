package kapitel06_AktivitetsdiagramOchPseudokod;

import java.util.Scanner;

public class Övningar {

    public static void main(String[] args) {
        övning6_1();
        övning6_2();
        övning6_3();
        övning6_4();
    }

    static void övning6_1() {
        System.out.println("Övning 6.1:");
        /*
        Pseudokod:
            Läs in tre heltal
            Multiplicera talen med 2,3 respektive 4
            Addera resultaten
            Skriv ut slutvärdet
        */

        // Omsatt till kod:

        // Läs in tre heltal:
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in 3 heltal");
        int[] treTal = {scan.nextInt(), scan.nextInt(), scan.nextInt()};

        // Multiplicera talen med 2,3 respektive 4
        treTal[0] *= 2;
        treTal[1] *= 3;
        treTal[2] *= 4;

        // Addera resultaten:
        int summa = treTal[0] + treTal[1] + treTal[2];

        // Skriv ut slutvärdet:
        System.out.printf("Summan är %d\n", summa);
    }

    static void övning6_2() {
        /*
            Pseudokod:

            Läs in timmar
            Läs in minuter
            Läs in sekunder

            Beräkna totala antalet sekunder

            Skriv ut totala antalet sekunder
        */
    }

    static void övning6_3() {
        /*
            Pseudokod:

            Läs in vikt på godiset i hg
            Läs in priset på godiset per hg

            Beräkna totala priset för godiset

            Om vikten är mer än 5 hg:
                Dra bort 10 % av priset

            Skriv ut vad priset blev för godiset
        */
    }

    static void övning6_4() {
        System.out.println("Övning 6.4:");
        /*
            Pseudokod:

            Skapa ett heltal med värdet 10

            Så länge heltalet är större än eller lika med 1:
                Skriv ut heltalet
                Minska heltalet med 1
        */

        // Kod (Loopar kommer senare dock men kan vara kul för er att se redan nu)

        int heltal = 10;

        while(heltal >= 1){
            System.out.println(heltal);
            heltal--;
        }
    }
}
