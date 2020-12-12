package kapitel02_Variabler;
import java.util.Scanner;  // Denna rad krävs då vi ska använda klassen Scanner.

public class Inmatning {

    // Denna variabel är static vilket innebär att den kan användas från hela klassen
    static Scanner scan = new Scanner(System.in);
    // För att i Java få input från användaren kan ett Scanner-objekt användas

    public static void main(String[] args) {
        inmatningAvSträng();
        inmatningAvHeltal();
    }


    static void inmatningAvSträng() {
        System.out.println("Skriv in ett ord, tack: ");
        // Nu vill vi använda vårt scanner-objekt och anropa dess nextLine-metod.
        String indata = scan.nextLine();  // nextLine kommer returnera den sträng som användaren skriver in via tangentbordet följt av enter.
        // variabeln indata innehåller nu den sträng som användren skrev in.
        System.out.println("Du skrev " + indata);
    }

    static void inmatningAvHeltal() {
        System.out.println("Hur gammal är du?");
        String ålderAsString = scan.nextLine();           // Läser in en till rad från tangentbordet.
        int ålder = Integer.valueOf(ålderAsString);       // Typomvandling från String till int med hjälpklassen Integer.
        System.out.println("Du är " + ålder + " år gammal.");
    }
}