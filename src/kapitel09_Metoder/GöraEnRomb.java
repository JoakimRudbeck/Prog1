package kapitel09_Metoder;

public class GöraEnRomb {

    public static void main(String[] args) {
        int bredd = 14;
        int höjd = 22;
        char tecken = '#';
        ritaUtRomb(bredd,höjd, tecken);

        /*

        Nu ska vi skapa ett program som skriver ut en romb:
        En romb har en bredd och en höjd

        Detta är en 7*4 romb:

        ******* 0 mellanslag + 7*
         ******* 1 mellanslag + 7*
          ******* 2 mellanslag + 7*
           *******  Detta görs 4 gånger


        En enkel pseudokod för denna utskrift:
            // för varje rad:
        //          skriv ut mellanslag
        //          skriv ut erfoderligt antal *
        //          gör ett enterslag!

         */
    }

    private static void ritaUtRomb(int bredd, int höjd, char tecken) {
        // för varje rad:
        //      skriv ut mellanslag
        //      skriv ut erfoderligt antal *
        //      gör ett enterslag!

        for(int rad = 1; rad <= höjd; rad++){ // för varje rad
            skrivUtMellanslag(rad);
            skrivUtStjärnor(bredd, tecken);
            enterSlag();
        }
    }

    private static void enterSlag() {
        System.out.println();
    }

    private static void skrivUtStjärnor(int bredd, char tecken) {
        // Denna ska skriva ut lika många * som bredd
        for(int kolumn = 1; kolumn <=bredd; kolumn++){
            System.out.print("" + tecken);
        }
    }

    private static void skrivUtMellanslag(int rad) {
        for(int kolumn = 1; kolumn <= rad; kolumn++){ // gör lika många varv som rad
            System.out.print(" ");
        }
    }


}
