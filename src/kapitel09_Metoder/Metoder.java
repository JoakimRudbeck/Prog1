package kapitel09_Metoder;

public class Metoder {

    public static void main(String[] args) {
        /*
            Denna kommentar ligger inuti en metod som har namnet main.

            Metoden main ligger i sin tur inuti en klass som heter Metoder.

            public static void main(String[] args) kallas för metodens signatur.

            Koden som ligger inom {...} kallas för metodens kropp.

            public betyder att metoden är publik och kan användas från andra klasser inom samma projekt.

            static betyder att metoden tillhör klassen och kan användas direkt utan att först ha en instans av klassen.

            void betyder att metoden inte returnerar något.

            main är namnet på metoden.

            String[] args är en parameter som metoden behöver för att kunna anropas.

            Strukturen för en allmän statisk metod är som följande:

            static returtyp metodnamn(parametrar){
                // kod
            }

            Ex:

            static int kvadrera(int x){
                return x*x;
            }

            Ovan syns en metod med namnet kvadrera som har returtypen int.
            Metoden har en parameter av typen int med parameternamnet x.

            När en metod har en returtyp måste metoden returnera ett värde.
            Det görs med hjälp av nyckelordet return.

            Om metoden saknar returtyp anges det med nyckelordet void.


            SYNLIGHET STATIC RETURTYP METODNAMN(EVENTUELLA PARAMETRAR){
                METOD-KROPP
                Eventuellt return ...
            }

            Exempel:

            public static double geMigPiMultipliceratMed(double faktor){
                double resultat = Math.PI * faktor;
                return resultat;
            }
        */
        run1();
        run2();
    }

    // En metod som tar in en parameter x av typen int och som returnerar en int som motsvarar det kvadrerade värdet av x.
    static int kvadrera(int x){
        return x*x;
    }

    // En metod som tar in två parametrar av typen int och som returnerar en double som representerar kvoten mellan täljare och nämnare.
    static double dividera(int täljare, int nämnare){
        double kvot = (double) täljare / nämnare;
        return kvot;
    }

    static String slåIhopSträngar(String sträng1, String sträng2){
        String resultat = sträng1 + sträng2;
        return resultat;
    }

    static void run1(){
        int a = 5;
        squareMe(5);
        System.out.println(a);
    }

    static void run2(){
        int[] array = new int[]{1,2,3};
        flyttaEttStegTillHöger(array);
        System.out.println(array[0]);
    }

    private static void flyttaEttStegTillHöger(int[] array) {

        int temp = array[0];
        for(int i = 1; i<array.length; i++){
            int attSpara = array[i];
            array[i] = temp;
            temp = attSpara;
        }
        array[0] = temp;
        System.out.println(array[0]);
    }

    private static void squareMe(int x){
        x = x*x;
    }

}