package kapitel14_Samlingar;

import java.util.ArrayList;
import java.util.Scanner;

public class Samlingar_ArrayList {

    public static void main(String[] args) {
        //arrayListExempel();
        arrayListMedSträngarExempel();
    }

    static void arrayListExempel() {
        System.out.println("ARRAYLIST EXEMPEL");
        // En arrayList är en dynamisk lista som kan ändra storlek.
        // Du kan enkelt lägga till och ta bort element från en arrayList med add(element) och remove(index)
        // Du kan även infoga ett element på ett visst index med add(index, element)
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.add(11);
        System.out.println(arrayList);
        arrayList.add(1,100);
        System.out.println(arrayList);

        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        // Annan typ av syntax för att loopa över en samling.
        for(int i : arrayList) {
            System.out.println(i);
        }
        // Skriver ut varje tecken i strängen "joakim"
        for (char c : "joakim".toCharArray()){
            System.out.println(c);
        }
    }

    static void arrayListMedSträngarExempel(){
        ArrayList<String> strängarIEnLista; // Deklararer en ny variabel av typen ArrayList
        strängarIEnLista = new ArrayList<>(); // Tilldelar variabeln värdet av en ny tom dynamisk lista

        System.out.println("Hur många strängar vill du spara i din dynamiska lista ?");
        Scanner scan = new Scanner(System.in);
        int antalSträngar = Integer.valueOf(scan.nextLine());

        for(int i = 0; i < antalSträngar; i++){
            System.out.println("Vilket ord vill du lägga till?");
            String ordet = scan.nextLine();
            strängarIEnLista.add(ordet);
            System.out.println("Listans innehåll: " + strängarIEnLista);
        }
        String run = "ja";
        while("ja".equalsIgnoreCase(run)){
            System.out.println("Vill du byta plats på några strängar i listan?");
            run = scan.nextLine();
            System.out.println("Vilket index vill du byta plats på ? index från 0 till " + (strängarIEnLista.size() -1));
            System.out.println(strängarIEnLista);
            int indexPåSträngAttByta = Integer.valueOf(scan.nextLine());
            System.out.println("På vilket index vill du lägga in ordet " + strängarIEnLista.get(indexPåSträngAttByta));
            int nyttIndex = Integer.valueOf(scan.nextLine());
            System.out.println("Byter plats...");
            String ordAttFlytta = strängarIEnLista.remove(indexPåSträngAttByta);

            strängarIEnLista.add(nyttIndex, ordAttFlytta);
            System.out.println(strängarIEnLista);


        }

    }
}
