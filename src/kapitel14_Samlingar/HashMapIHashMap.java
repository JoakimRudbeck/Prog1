package kapitel14_Samlingar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapIHashMap {


    public static void main(String[] args) {

        HashMap<String, HashMap<String, Character>> minaKurser = new HashMap<>();

        HashMap<String, Character> prog1 = new HashMap<>();
        prog1.put("Prov1", 'B');
        prog1.put("Prov2", 'C');

        HashMap<String, Character> matte4 = new HashMap<>();
        prog1.put("Prov1", 'B');
        prog1.put("Prov2", 'C');

        minaKurser.put("Programmering1", prog1);
        minaKurser.put("Matte4", matte4);

        for(String kursnamn : minaKurser.keySet()){
            for(String uppgift : minaKurser.get(kursnamn).keySet()){
                System.out.println(uppgift + " betyg: " + minaKurser.get(kursnamn).get(uppgift));
            }
        }


    }
}
