package kapitel02_Variabler;

public class Typomvandlingar {

    public static void main(String[] args){

        // Från int till String:
        int fjortonSomInt = 14;
        String fjortonSomString1 = "" + fjortonSomInt;
        String fjortonSomString2 = String.valueOf(fjortonSomInt);
        // Båda alternativen ovan kommer innebära "14"

        // Från String till int:
        String s = "1337";
        int i = Integer.valueOf(s);

        // Från char till int:
        char aAsChar = 'a';
        int aAsInt = aAsChar;           // aAsInt kommer få värdet 97 eftersom a motsvaras av talet 97 i ASCII-tabellen.

        // Från int till char:
        int heltal = 65;
        char tecken = (char) heltal;    // tecken kommer ha värdet A ty 65 motsvarar A i ASCII-tabellen.
        System.out.println(heltal);
        System.out.println(tecken);

        // Från double till int:
        double decimaltal = 3.14;
        int decimalttalSomHeltal = (int) decimaltal;

        // Från int till double:
        int fem = 5;
        double femSomDouble = fem; // femSomDouble kommer nu få värdet 5.0

        // Från double till String:
        double minDouble = 2.71828;
        String taletESomString = String.valueOf(minDouble);     // "2.71828"
        String alternativtSätt = Double.toString(minDouble);    // Samma resultat "2.71828"

        // Från String till double:
        String minSträng2 = "3.14159";
        double pi = Double.valueOf(minSträng2);
    }
}
