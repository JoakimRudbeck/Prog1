package kapitel07_Villkorssatser;

import java.util.Scanner;

public class VillkorsOperatorer_22jan2021 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ifExempel();
        System.out.println("Vad heter du?");
        String namn = scan.nextLine();

        if(namn.length() % 2 == 0){
            System.out.println(namn + " består av ett jämnt antal bokstäver.");
        }
        else{
            System.out.println(namn + " består av ett udda antal bokstäver.");
        }

    }

    private static void ifExempel() {
        // Vad kommer skrivas ut ?

        String s = "Sportlov";   // s.substring(0,5) = "Sport"
        //          01234567
        boolean distans = true;
        int a = 5;

        // ! betyder icke eller inte. ex !false är samma som true.
        // !true = false

        // substring är en del av en sträng

        if(!distans || (s.substring(0,5).length() < a)){  // false || false = false
            System.out.println("Ni får sluta tidigare idag, jippi!");
        }
        else if(true && (!true || false)){ // false && false = false
            System.out.println("Ni får sluta tidigare idag, jippi!");
        }
        else{
            System.out.println("Ni slutar som vanligt idag!");
        }
    }
}
