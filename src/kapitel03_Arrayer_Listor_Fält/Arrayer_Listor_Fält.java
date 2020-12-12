package kapitel03_Arrayer_Listor_Fält;

import java.util.Scanner;

public class Arrayer_Listor_Fält {

    public static void main(String[] args){
        skapaEnListaExempel();
        skrivaUtVärdenIEnLista();
        exempelMedSplit();
        betygExempel();
        frukter();
        bytaPlatsPåTvåElementILista();
        antalOrdIMening();
        listorIListor();
        vilkenMeningÄrStörst();
        elevNamnExempel();
    }

    static void skapaEnListaExempel() {
        // Tre variabler a,b,c
        int a = 5;
        int b = 7;
        int c = 9;

        // Istället för att ha tre olika variabler kan man skapa EN variabel som innehåller alla dessa tre värden såhär:

        // Version 1:

            int[] enListaAvTreTalVersion1 = new int[3]; // Vid deklareringen måste man ange hur många platser som ska finnas.
            // Efter deklarationen ovan ser fältet ut såhär: [_,_,_] d.v.s tre tomma platser.

            // Fylla fältet med värden:
            enListaAvTreTalVersion1[0] = 5; // Ett fälts platser refereras till med hjälp av index
            enListaAvTreTalVersion1[1] = 7; // Första platsen har index 0, andra 1, tredje 2 och så vidare.
            enListaAvTreTalVersion1[2] = 9;

            // Nu ser fältet/arrayen/listan ut såhär: [5,7,9]

        // Version 2:
            int[] enListaAvTreTal = {5,7,9}; // Ett enklare sätt är att göra såhär.
    }

    static void skrivaUtVärdenIEnLista() {
        System.out.println("Skapar lista...");
        String[] lista = {"hej", "hopp", "tjena"};
        System.out.println("Värdet i listan är:");
        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);
    }

    static void betygExempel() {
        char[] betyg = new char[6];
        betyg[0] = 'A';
        betyg[1] = 'B';
        betyg[2] = 'C';
        betyg[3] = 'D';
        betyg[4] = 'E';
        betyg[5] = 'F';

        System.out.println("Det finns " + betyg.length  + " st olika betyg");
        System.out.println("Högsta betyg är " + betyg[0]);
        System.out.println("Lägsta betyg är " + betyg[5]);
    }

    static void exempelMedSplit() {
        String mening = "Detta är en mening";
        String[] listaMedAllaOrdIMeningen = mening.split(" ");
        int antalOrdIMeningen = listaMedAllaOrdIMeningen.length;
        System.out.println("Dessa ord finns i meningen:");
        System.out.println(listaMedAllaOrdIMeningen[0]);
        System.out.println(listaMedAllaOrdIMeningen[1]);
        System.out.println(listaMedAllaOrdIMeningen[2]);
        System.out.println(listaMedAllaOrdIMeningen[3]);
    }

    static void frukter() {
        // Skapar en lista (array) med 3 element.
        String[] minaFrukter = new String[3];
        minaFrukter[0] = "Banan";
        minaFrukter[1] = "Äpple";
        minaFrukter[2] = "Apelsin";

        String[] minFruktKorg = {"Banan", "Äpple", "Apelsin"};

        System.out.println("Första frukten är " + minFruktKorg[0]);
        System.out.println("Andra frukten är " + minFruktKorg[1]);
        System.out.println("Tredje frukten är " + minFruktKorg[2]);
    }

    static void bytaPlatsPåTvåElementILista() {
        int[] lista = {3,5};
        System.out.println("Värdena innan = " + lista[0] + "," + lista[1]);
        int temp = lista[0];                                                    // Sparar undan det första värdet i en variabel.
        lista[0] = lista[1];                                                    // Lägger in det andra värdet på platsen för det första värdet.
        lista[1] = temp;                                                        // Lägger in undansparade värdet på det andra värdets plats.
        System.out.println("Värdena efter = " + lista[0] + "," + lista[1]);
    }

    // Räknar ut hur många ord det finns i en mening.
    static void antalOrdIMening(){
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Skriv in en mening, tack.");
        String mening = minScanner.nextLine();
        // Delar upp meningen genom att splitta på mellanslag
        String[] ordIMening = mening.split(" ");
        System.out.println("'" + mening + "' har " + ordIMening.length + " ord i sig.");
    }

    static void listorIListor(){
        int[] lista1 = {1,2,3};
        int[] lista2 = {4,5,6};
        int[] lista3 = {7,8,9};
        int[][] tvåDimLista = {lista1, lista2, lista3};
        System.out.println(tvåDimLista[2][1]);
    }

    static void vilkenMeningÄrStörst(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in mening 1, tack:");
        String mening1 = scanner.nextLine();
        System.out.println("Skriv in mening 2, tack:");
        String mening2 = scanner.nextLine();
        int längdMening1 = mening1.length();
        int längdMening2 = mening2.length();
        if(längdMening1 > längdMening2){
            System.out.println(mening1 + " har fler ord än " + mening2);
        }
        else{
            System.out.println(mening2 + " har fler ord än " + mening1);
        }
    }

    static void elevNamnExempel() {
        String[] elevNamn = new String[3]; // en lista av 3 element
        elevNamn[0] = "liam";
        elevNamn[1] = "anton";
        elevNamn[2] = "filippa";
        // elevNamn[3] = "erik";   //GÅR INTE, index är bara 0, 1 och 2 vi får ett ArrayIndexOutOfBoundsException

        System.out.println("Innan bytet:");
        System.out.println(elevNamn[0]);
        System.out.println(elevNamn[1]);
        System.out.println(elevNamn[2]);

        String temp = elevNamn[2];  // elevnamn är nu {"liam", "anton", "filippa"}
        elevNamn[2] = elevNamn[0];  // elevnamn är nu {"liam", "anton", "liam"}
        elevNamn[0] = temp;         // elevNamn är nu {"filippa", "anton", "liam"}

        System.out.println("Efter bytet:");
        System.out.println(elevNamn[0]);
        System.out.println(elevNamn[1]);
        System.out.println(elevNamn[2]);

        String[] elevNamnVersion2 = {"liam", "anton", "filippa", "erik"};
    }
}
