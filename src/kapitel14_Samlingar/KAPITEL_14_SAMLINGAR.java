package kapitel14_Samlingar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class KAPITEL_14_SAMLINGAR {


    public static void main(String[] args) {
        /*

        ArrayList - En dynamisk lista som kan ändra storlek:

        */

        // HashMap - En datastruktur som kopplar samman nycklar och värden:


        HashMap<String,ArrayList<Double>> personOchTimmarSömnsnasteveckan = new HashMap<>();

        ArrayList<Double> joakimsTimmarsömn = new ArrayList<>();
        joakimsTimmarsömn.add(8.0);
        joakimsTimmarsömn.add(6.5);
        joakimsTimmarsömn.add(9.0);
        joakimsTimmarsömn.add(10.0);
        joakimsTimmarsömn.add(7.0);
        joakimsTimmarsömn.add(5.5);
        joakimsTimmarsömn.add(6.0);

        personOchTimmarSömnsnasteveckan.put("joakim",joakimsTimmarsömn);
        personOchTimmarSömnsnasteveckan.put("joakim",joakimsTimmarsömn);


        /*System.out.println("Alla åldrar i hashmappen:");
        Collection<Integer> värden = namnOchÅlder.values();
        for(Integer värde : värden){
            System.out.println(värde);
        }
*/
        System.out.println();







/*



        add * 2
        remove
        foreach

        En lista med namn
        ArrayList<String> listaAvNamn = new ArrayList<>();





        /*
        HashMap<String,Integer> namnOchÅlder = new HashMap<>();
        namnOchÅlder.put("Joakim",29);
        namnOchÅlder.put("Kalle Anka",100);

        System.out.println(namnOchÅlder);

        // Vill skriva ut alla nycklar (namn i vårt fall)

        Set<String> namnen = namnOchÅlder.keySet();

        System.out.println("Alla namn i hashmappen:");
        for (String namn : namnen){
            System.out.println(namn);
        }

        Collection<Integer> åldrarna = namnOchÅlder.values();

        System.out.println("Alla åldrar i hashmappen:");
        for (Integer ålder : åldrarna){
            System.out.println(ålder);
        }

         */

        // y = f(x)
        // y    x
        // 4    2
        // 9    3
        // 16   4
        // 25   5
        // 36   6
        // Vad är funktionen ?







    }





    // HashMap - En datastruktur som kopplar samman nycklar och värden:

















    // ArrayList - En dynamisk lista som kan ändra storlek:
    // ArrayList<String> minLista = new ArrayList<>();
    // Add för att lägga till
    // Remove för att ta bort









    // HashMap - En datastruktur som kopplar samman nycklar och värden:
    // HashMap<key,value> minMapp = new HashMap<key,value>();
    // Ex:
    // HashMap<String,boolean> myndigaPersoner = new HashMap<String, boolean>();
    // myndigaPersoner.put("Joakim", true);
    // myndigaPersoner.put("Nisse", false);

}
