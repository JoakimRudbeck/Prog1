package kapitel09_Metoder;

public class SkapaOchAnropaEgengjordMetod {

    public static void main(String[] args) {
        välkommen(4); // Vi gör ett anrop till metoden

        /*

        Vi ska nu se hur vi kan skapa och anropa egenskapade metoder.

        Alla metoder följer denna mall:

        static RETURDATATYP METODNAMN(EVENTUELLT PARAMETRAR){
            // KOD
            return VÄRDE; (om inte void)
        }

        Först tänkte jag skapa en metod som skriver ut texten "Välkommen!"

        Låt oss göra det!

        Metoden ska inte returnera något, alltså void
        Metoden ska inte ha någon parameter.

        Såhär gör vi:

         */

        // Sådär, nu har ni ett exempel på skapande av egna metoder.
        // Det går alltså mycket bra att anropa metoder från andra metoder :)
        // Tack för denna gång :)
    }

    static void välkommen(int antalUtropstecken){
        System.out.print("Välkommen");
        String utropstecknen = geMigUtropstecken(antalUtropstecken);
        System.out.println(utropstecknen);
    }


    static String geMigUtropstecken(int antal){
        String utrop = "";
        for(int i = 0; i < antal; i++){
            utrop += "!"; // Lägger på så många ! som kommer inte som parameter
        }
        return utrop;
    }


}
