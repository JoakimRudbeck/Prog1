package kapitel09_Metoder;

public class MetoderTvåEnklaExempel {

    /*
    Alla metoder följer denna mall:
    static RETURDATATYP METODNAMN(EVENTUELLA PARAMETRAR){
        // KOD
        return VÄRDE; (inte om void)
    }
     */

    public static void main(String[] args) {
        int tal = 3;
        // Anropar metoden och sparar svaret i en variabel:
        int svar = dubbelVärde(tal);
        System.out.println(tal + " gav oss svaret " + svar);


        int a = 5;
        System.out.println("Multiplikationstabellen för " + a + ":");
        for(int i = 1; i <= 10; i++){
            int produkt = produktAv(a,i);
            System.out.println(a + "*" + i + " är " + produkt);
        }
    }

    /*
    Skapa en metod som givet ett heltal returnerar
    dubbleringen av detta heltal.
     */
    static int dubbelVärde(int inkommandeTal){
        int dubbleratVärde = inkommandeTal * 2;
        return dubbleratVärde;
    }

    // Metod som givet två heltal returnerar produkten av dessa heltal:
    static int produktAv(int tal1, int tal2){
        int produkt = tal1 * tal2;
        return produkt;
    }
}
