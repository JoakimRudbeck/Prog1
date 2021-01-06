package kapitel14_Samlingar;

import java.util.ArrayList;

public class Samlingar {


    public static void main(String[] args) {
        ArrayList<Integer> minaTal = new ArrayList<>();
        minaTal.add(4);
        minaTal.add(7);
        minaTal.add(9);
        minaTal.add(1);

        minaTal.remove(1); // Ta bort elementet på index 1
        int längd = minaTal.size(); // längden av listan
        minaTal.add(2,5); // lägg in 5 på index 2.


        int[] tal = {1,4,6,8};

        System.out.println(tal);
    }
}
