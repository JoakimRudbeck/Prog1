package annat.Matte;

import java.util.Scanner;

public class Mattespel {
    static Scanner scanner = new Scanner(System.in);
    static String input = "";
    public static void main(String[] args) {
        try{
            System.out.println("Välkommen till matematikens underbara värld!\nHur många spelare är ni?");
            int antalSpelare = Integer.valueOf(scanner.nextLine());
            String[] spelare = new String[antalSpelare];
            int[] poäng = new int[antalSpelare];
            for(int i = 0; i < spelare.length; i++){
                System.out.println("Vad heter spelare nummer " + (i+1) + "?");
                spelare[i] = scanner.nextLine();
                poäng[i] = 0;
            }
            while(!input.equalsIgnoreCase("Q")){
                try{
                    for(int s = 0; s < spelare.length; s++) {
                        System.out.println("\nDags för spelare " + spelare[s]);
                        int fråga = (int) (1.5 + Math.random());
                        switch (fråga) {
                            case 1:
                                poäng[s] += multiplikationsfråga();
                                break;
                            case 2:
                                poäng[s] += additionFråga();
                                break;
                        }
                        System.out.printf("Spelare %s, %d poäng.", spelare[s], poäng[s]);
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("##### POÄNGSTÄLLNING #####");
                    printStatus(spelare, poäng);
                }
                catch(Exception ee){
                    if(input.equalsIgnoreCase("Q")){
                        break;
                    }
                    else{
                        System.out.println("Vänligen ange ett tal eller Q för att avsluta.");
                        continue;
                    }
                }
            }
            System.out.println("Bra spelat!");
            System.out.println("#####   RESULTAT    #####");
            printStatus(spelare, poäng);
            System.out.println("Tack för idag, ha en underbar dag!");

        }
        catch(Exception e){
            System.out.println("Något gick fel, programmet avslutas.");
        }
    }
    private static void printStatus(String[] spelare, int[] poäng) {
        for(int i = 0; i < spelare.length; i++){
            System.out.println("     " + spelare[i] + ", " + poäng[i] + " poäng.");
        }
        System.out.println("##########################");
    }
    private static int additionFråga() {
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        System.out.printf("Vad blir %d + %d ?\n", a,b);
        input = scanner.nextLine();
        int svar = Integer.valueOf(input);
        System.out.println();
        if(svar == a+b){
            System.out.println("RÄTT!");
            return 1;
        }
        else{
            System.out.println("FEL");
            return 0;
        }
    }
    private static int multiplikationsfråga() {
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        System.out.printf("Vad blir %d * %d ?\n", a,b);
        input = scanner.nextLine();
        int svar = Integer.valueOf(input);
        System.out.println();
        if(svar == a*b){
            System.out.println("RÄTT!");
            return 1;
        }
        else{
            System.out.println("FEL");
            return 0;
        }
    }
}