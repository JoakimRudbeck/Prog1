package kapitel08_Repetitionssatser;

import java.util.Scanner;

public class Meny {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menyExempel1();
        menyExempel2();
    }

    static void menyExempel1() {
        int[] a = {1,2,3};
        System.out.println(a[3]);
        Scanner scan = new Scanner(System.in);
        String input = "";
        while(!input.equals("SLUTA")){
            skrivUtMeny();
            input = scan.nextLine();
            switch(input){
                case "AREA":
                    beräknaArea(scan);
                    break;
                case "VOLYM":
                    beräknaVolym(scan);
                    break;
                case "SLUTA":
                    break;
                default:
                    System.out.println("Skriv in antingen AREA, VOLYM eller SLUTA.");
            }
        }
    }

    static void menyExempel2() {
        /*
        För alltid:
            Slumpa fram två tal
            Fråga efter produkten av talen
            Om användaren skriver in sluta:
                Hoppa ur loopen
            Om användaren skriver in rätt:
                Öka poäng med 1
            Annars:
                Ingen poäng
        Beräkna procentRätt
        Skriv ut hur många procent rätt spelaren hade.
        */
        System.out.println("Välkommen till spelet huvudrakning :D");
        String svar;
        int poäng = 0;
        int antalSpelade = 0;

        while(true){
            int a = (int)(Math.random()*10); // Slumpar fram tal mellan 0 och 10
            int b = (int)(Math.random()*10);
            int produkt = a*b;
            System.out.println("Vad blir " + a + " * " + b + "?");
            svar = scan.nextLine();
            if(svar.equalsIgnoreCase("sluta")){
                break;
            }
            antalSpelade++;
            int svarAsInt = Integer.valueOf(svar);
            if(svarAsInt == produkt){
                poäng++;
                System.out.println("Rätt!");
            }
            else{
                System.out.println("Fel!");
            }
        }
        double procentRätt = 100 * ((double) poäng / antalSpelade);
        System.out.println("Du hade " + procentRätt + "% rätt.");
    }

    static void skrivUtMeny() {
        System.out.println();
        System.out.println("Vad vill du göra?");
        System.out.println("\t[AREA]\t Beräkna area av rektangel");
        System.out.println("\t[VOLYM]\t Beräkna volym av rätblock");
        System.out.println("\t[SLUTA]\t Avsluta programmet");
    }

    static void beräknaArea(Scanner scan) {
        System.out.println("Rektangelns bas?");
        double bas = Double.valueOf(scan.nextLine());
        System.out.println("Rektangelns höjd?");
        double höjd = Double.valueOf(scan.nextLine());
        double area = bas * höjd;
        System.out.printf("Rektangelns area är %.1f area-enheter.\n",  area);
    }

    static void beräknaVolym(Scanner scan) {
        System.out.println("Rätblockets bredd?");
        double bredd = Double.valueOf(scan.nextLine());
        System.out.println("Rätblockets djup?");
        double djup = Double.valueOf(scan.nextLine());
        System.out.println("Rätblockets höjd?");
        double höjd = Double.valueOf(scan.nextLine());
        double volym = bredd * djup * höjd;
        System.out.printf("Rätblockets volym är %.1f volym-enheter.\n", volym);
    }

}