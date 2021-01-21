package Annat;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Meritvärde {

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        System.out.println("Välkommen till programmet som beräknar ditt meritvärde!");
        System.out.println("Vad heter du?");
        Scanner scanner = new Scanner(System.in);
        String namn = scanner.nextLine();
        System.out.println("Hur många kurser vill du registrera?");
        int antalKurser = parseInt(scanner.nextLine());
        HashMap<String, Character> kurser = new HashMap<>();
        for(int i = 1; i <= antalKurser; i++){
            System.out.println("Namn på kurs?");
            String kurs = scanner.nextLine();
            System.out.println("Betyg i " + kurs + "?");
            char betyg = scanner.nextLine().toUpperCase().charAt(0);
            kurser.put(kurs, betyg);
        }
        double merit = getMerit(antalKurser, kurser);
        System.out.println("Sammanställning för " + namn + ":");
        for(String kurs : kurser.keySet()){
            System.out.println(kurs + ", " + kurser.get(kurs));
        }
        System.out.printf("Annat.Meritvärde baserat på dina %d kurser är %.2f", antalKurser, merit);
    }

    private static double getMerit(int antalKurser, HashMap<String, Character> kurser) {
        double merit = 0;
        for(char betyg : kurser.values()){
            switch(betyg){
                case 'A':
                    merit+=20;
                    break;
                case 'B':
                    merit+=17.5;
                    break;
                case 'C':
                    merit+=15;
                    break;
                case 'D':
                    merit+=12.5;
                    break;
                case 'E':
                    merit+=10;
                    break;
                case 'F':
                    break;
            }
        }
        merit /= antalKurser;
        return merit;
    }
}
