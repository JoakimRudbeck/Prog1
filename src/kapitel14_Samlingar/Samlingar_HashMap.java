package kapitel14_Samlingar;


import java.util.HashMap;

public class Samlingar_HashMap {

    public static void main(String[] args) {
        hashMapExempel();
    }

    private static void hashMapExempel() {
        System.out.println("HASHMAP EXEMPEL");
        // En hashmap kan spara massa parvis kopplade värden i en lista.
        // Tänk er en matematisk funktion, f(x) = x+2 och dess värdetabell:
        // x    y
        // 1    3       1 är ihopkopplat med 3
        // 2    4       2 är ihopkopplat med 4
        // 3    5       ...
        // 4    7       ...

        HashMap<String, Character> minaBetyg = new HashMap();
        // En hashmap som kopplar samman strängar med tecken
        // Strängarna motsvarar kurser och tecknen motsvarar betyget
        // strängarna är nyckeln och tecknen är värdena

        minaBetyg.put("Svenska", 'E'); // put används för att lägga in ett 'key-value'-par i hash-mappen.
        minaBetyg.put("Matte 5", 'C'); // "Matte 5" kopplas till 'C'
        minaBetyg.put("Programmering <3", 'A');

        System.out.println("Nycklarna:");
        System.out.println(minaBetyg.keySet());

        System.out.println("Följande finns i hashmappen:");
        for(String kurs : minaBetyg.keySet()){
            if(kurs.startsWith("Prog")){
                System.out.println(kurs + " : " + minaBetyg.get(kurs));
            }
            //System.out.println(kurs + " : " + minaBetyg.get(kurs));
        }
        System.out.println("HELA HASHMAPPEN:");
        System.out.println(minaBetyg);

    }


}
