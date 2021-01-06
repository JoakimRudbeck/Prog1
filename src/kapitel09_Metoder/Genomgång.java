package kapitel09_Metoder;

public class Genomgång {

    public static void main(String[] args) {
        //uppgift1();

        ritaUtRektangel(25,7, '8');
    }

    private static void uppgift1() {
        int bredd = 4;
        int höjd = 2;
        int omkretsen = omkrets(bredd,höjd);
        System.out.println("Omkretsen är " + omkretsen);
    }



    /* Mallen för alla metoder:

    static RETURDATATYP/void METODNAMN(EVENTUELLT PARAMETRAR){
        KOD KOD KOD
    }

    */


    /* Uppgift 1:
    Skapa en metod som givet en rektangels bredd och höjd returnerar rektangelns omkrets.
     */

    // bredd = 4, höjd = 2 -->  2*4 + 2*2 = 8 + 4 = 12


    // Metod som beräknar omkrets för rektangel givet bredd och höjd
    static int omkrets(int bredd, int höjd){

        if(bredd < 0 || höjd < 0){
            return 0;
        }
        // Beräkna omkretsen
        int omkrets = 2*bredd + 2*höjd;
        // Returnera omkretsen
        return omkrets;
    }


        /* Uppgift 2:
        Skapa en metod som givet en bredd och en höjd skriver ut en rektangel.

        bredd = 5 och höjd = 3:

        * * * * *
        * * * * *
        * * * * *

         */

    // Metod som givet bredd och höjd ritar ut en rektangel med bredd och höjd
    static void ritaUtRektangel(int bredd, int höjd, char tecken){
        // Gör följande höjd gånger:
        for(int i = 0; i < höjd; i++){

            // Gör följande bredd gånger:
            for(int j = 0; j < bredd; j++){
                // Skriv ut "* "
                System.out.print("" + tecken + " ");
            }
            // Gör radbrytning
            System.out.println();
        }
    }


    static void ritaUppRektangel(int bredd, int höjd){
        // Gör följande höjd gånger:
        for(int i = 0; i < höjd; i++){  // denna gör höjd st varv
            // Gör följande bredd gånger:
            for(int j = 0; j < bredd; j++){
                // Skriv ut *
                System.out.print("* ");
            }
            // Gör enter
            System.out.println();
        }

    }

}