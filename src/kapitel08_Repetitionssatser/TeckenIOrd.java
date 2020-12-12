package kapitel08_Repetitionssatser;

import java.util.Scanner;

public class TeckenIOrd {

    static final Scanner scan = new Scanner(System.in);

    /*
      Skriv ett program som frågar användaren efter ett ord S och ett tecken T.
      Programmet ska skriva ut hur många T det finns i S.
    */
    public static void main(String[] args) {
        // Läs in ordet S
        System.out.println("ORD?");
        String S = scan.nextLine();

        // Läs in tecknet T
        System.out.println("TECKEN?");
        char T = scan.nextLine().charAt(0);

        // skapa räknare = 0
        int räknare = 0;
        // loopar igenom varje tecken i ordet S
        for(int i = 0 ; i < S.length(); i++){
            if(S.charAt(i) == T){ // om tecknet i S är tecknet T:
                räknare++; // öka räknaren med 1
            }
        }
        // Skriver ut räknarens värde
        System.out.println("Det finns " + räknare + " st '" + T + "' i " + "\""+ S + "\"" );



    }
}
