package kapitel02_Variabler;

public class Strängar {

    public static void main(String[] args) {
        slåIhopSträngar();
        strängMetoder();
        strängarExempel();
    }

    static void slåIhopSträngar() {
        String s1 = "Musse";
        String mellanslag = " ";
        String s2 = "Pigg";
        String mussePigg = s1 + mellanslag + s2;
        System.out.println(mussePigg);
    }

    static void strängMetoder() {
        String kalle = "Kalle Anka";
        int kallesLängd = kalle.length();                       // Metoden length() ger längden av en sträng
        System.out.println(kallesLängd) ;                       // Skriver ut 10 eftersom "Kalle Anka" består av 10 tecken
        System.out.println(kalle.indexOf('e'));                 // Metoden indexOf(...) ger indexet (positionen) där tecknet finns i strängen
        System.out.println(kalle.substring(0, 5));              // Metoden substring(..., ...) ger en delsträng av strängen
        String kalleMedSmå = kalle.toLowerCase();               // Metoden toLowerCase() gör om alla tecken i strängen till små bokstäver
        System.out.println(kalleMedSmå);
        String kalleMedStora = kalle.toUpperCase();             // Metoden toUpperCase() gör om alla tecken i strängen till stora bokstäver
        System.out.println(kalleMedStora);
    }

    static void strängarExempel() {
        String s = "Sommarlov är skönt!";
        int längd = s.length();
        System.out.println(s + " har längden " + längd);
        String delAvSträng = s.substring(7,19);
        System.out.println(delAvSträng);

        char c = s.charAt(5);
        System.out.println("Tecknet på index 9 är " + c);

        int indexOfMellanslag = s.indexOf(' ');
        System.out.println("Mellanslag finns på index " + indexOfMellanslag);
    }
}
