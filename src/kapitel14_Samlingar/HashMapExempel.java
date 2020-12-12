package kapitel14_Samlingar;

import java.util.HashMap;

public class HashMapExempel {

    public static void main(String[] args) {
        namnOchFavoritfärgExempel();
        fotbollsfansExempel();
    }

    private static void namnOchFavoritfärgExempel() {
        // Hashmap används för att spara information som är parvis relaterade.
        // Ex. Man vill spara namn och tillhörande favoritfärg:
        // "Hanna", "Blå"
        // "Joakim", "grön"
        // "Kalle", "röd"

        HashMap<String, String> namnOchFavvoFärg = new HashMap<>();
        namnOchFavvoFärg.put("Hanna", "Blå");
        namnOchFavvoFärg.put("Joakim", "Grön");
        namnOchFavvoFärg.put("Kalle", "Röd");
        for (String namn : namnOchFavvoFärg.keySet()) {
            System.out.println(namn + " tycker om " + namnOchFavvoFärg.get(namn));
        }
    }

    private static void fotbollsfansExempel() {
        // Skapar hashmappen
        HashMap<String, Integer> fans = new HashMap<>();

        // lägger till nyckel-värde-par i hashmapen
        fans.put("Djurgårdare", 12);
        fans.put("Aikare", 3);
        fans.put("Hammarbyare", 8);
        fans.put("Arsenalfans", 2);


        System.out.println("Det finns " + fans.size() + " lag att heja på i din hashmap.");
        System.out.println("Samtliga lag i hashmappen");
        // Loopar igenom varje nyckel i hashmapen
        for (String lag : fans.keySet()){
            System.out.print(lag);
            System.out.print("\tAntal som hejar: ");
            System.out.println(fans.get(lag));
        }
    }
}
