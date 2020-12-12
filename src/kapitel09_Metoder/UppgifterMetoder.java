package kapitel09_Metoder;

import java.util.Scanner;

public class UppgifterMetoder {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        kusinUppgiften();
        förstaHalvanAvOrdetExempel();
        beräknahypotenusanExempel();
        produktAvTalIListaExempel();
        sammanslagenListExempel();
        upprepningAvSträngExempel();
    }

    private static void beräknahypotenusanExempel() {
        System.out.println(hypotenusan(3,4));
    }

    private static void förstaHalvanAvOrdetExempel() {
        System.out.println(förstaHalvanAvOrdet("lampan"));
    }

    private static void produktAvTalIListaExempel() {
        int[] tal = {1, 4, 6, 2};
        System.out.println(produktenAvTalILista(tal));
    }

    private static void sammanslagenListExempel() {
        int[] lista1 = {7, 3, -8};
        int[] lista2 = {-1, 0, 14, 23};
        int[] sammanslagenLista = sammanslagning(lista1, lista2);
        for(int i=0; i<sammanslagenLista.length; i++){
            System.out.print(sammanslagenLista[i] + ", ");
        }
    }

    static void upprepningAvSträngExempel() {
        String svar = upprepningAvSträng("hej",8);
        System.out.println("Detta var svaret vi fick från metoden: " + svar);
    }

    static String upprepningAvSträng(String text, int tal) {

        // skapar en tom sträng ""
        String resultat = "";

        // for loop som loopar så många gånger som tal:
        for(int i = 0; i < tal; i++){
            // tomma strängen plussas på med text
            resultat += text;
        }
        // return strängen.
        return resultat;
    }

    static int[] sammanslagning(int[] l1, int[] l2){
        // skapa en tom lista som är lika lång som summan av de två
        // listornas längder.
        // gå igenom första listan, ta ut varje värde och
        // lägg i den nya listan.
        // gör samma sak för lista 2.
        // returnera den nya listan
        int längdAvNyLista = l1.length + l2.length;
        int[] nyaListan = new int[längdAvNyLista];
        // loopar igenom lista1

        for(int i = 0; i < l1.length; i++){
            // ta ut värdet och ge till nyalistan
            nyaListan[i] = l1[i];
        }
        // loopar igenom lista2:
        for(int i = 0; i < l2.length; i++){
            // ta ut värdet och ge till nyalistan
            int värdet = l2[i]; // tar ut värdet från lista 2
            // ge värdet till nya listan på rätt positiion
            nyaListan[l1.length+i] = värdet;
        }
        return nyaListan;
    }

    static int produktenAvTalILista(int[] lista) {
        int produkt = 1;
        for(int i = 0; i < lista.length; i++){
            produkt*=lista[i];
        }
        return produkt;
    }

    static double hypotenusan(int katet1, int katet2) {
        return Math.sqrt(katet1*katet1+katet2*katet2);
    }

    static String förstaHalvanAvOrdet(String ord) {
        return ord.substring(0,ord.length()/2);
    }

    static void kusinUppgiften() {
        // variabel som håller koll på summan av åldrarna
        System.out.println("Hur många kusiner har du?");
        int antalKusiner = Integer.valueOf(scan.nextLine());
        int summa = 0;
        // loop som frågar efter varje kusins ålder
        for(int i = 1; i<=antalKusiner; i++){
            System.out.println("Hur gammal är kusin nr " + i + "?");
            // summa ökas med det som användaren skrev in
            summa += Integer.valueOf(scan.nextLine());
        }
        System.out.println("Totala åldern av alla kusiner är " + summa);
    }

    static void exempelPåProvUppgift() {
        System.out.println("Uppgift2:");
        /*
        Skapa en metod som givet en sträng returnerar strängen baklänges.
        Anropa sedan din metod med en sträng som användaren skriver in.
        Skriv ut värdet som din metod returnerade.
         */
        System.out.println("Skriv in ett ord, tack :)");
        String ord = scan.nextLine();
        String stringenBaklänges = baklänges(ord);
        System.out.println(ord + " baklänges blir " + stringenBaklänges);
    }

    static String baklänges(String s){
        // skapa en tom sträng
        String svar = "";
        // loopar igenom alla tecken i från slutet till början:
        for(int i = s.length()-1; i>=0; i--){
            // för varje tecken i strängen, lägg till tecknet till den tomma strängen
            svar += s.charAt(i);
        }
        // returnera den fyllda strängen.
        return svar;
    }

    static double avståndetMellan(double[] p1, double[] p2){
        double deltaX = p1[0] - p2[0];
        double deltaY = p2[1] - p2[1];
        return Math.sqrt(deltaX + deltaY);
    }

}