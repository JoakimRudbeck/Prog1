package kapitel07_Villkorssatser;

import java.util.Scanner;

public class Uppgifter {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        uppgift7_1();
        uppgift7_3();
        uppgift7_4();
        uppgift7_6();
        uppgift7_9();
        uppgift7_10();
    }

    static void uppgift7_1() {
        System.out.println("Uppgift 7.1, sid 100");
        System.out.println("Vad gör du? [svänga/rakt]");
        String val = scanner.nextLine();
        if(val.equalsIgnoreCase("svänga")){
            System.out.println("Sväng höger, trevlig resa!");
        }
        else if(val.equalsIgnoreCase("rakt")){
            System.out.println("Fortätt rakt fram, trevlig resa!");
        }
        else{
            System.out.println("Jag föstår inte vad du skrev.");
        }
    }

    static void uppgift7_3() {
        System.out.println("Uppgift 7.3, sid 100");
        System.out.println("Skriv in ett heltal, tack.");
        int tal = Integer.valueOf(scanner.nextLine());
        if(tal < 0){
            System.out.println("Ditt tal är negativt");
        }
        else if( tal > 0){
            System.out.println("Ditt tal är positivt");
        }
        else if(tal == 0){
            System.out.println("Ditt tal är 0.");
        }
    }

    static void uppgift7_4() {
        System.out.println("Uppgift 7.4, sid 100");
        System.out.println("Hur vill du resa?");
        String färdsätt = scanner.nextLine();
        switch (färdsätt.toLowerCase()){
            case "cykel":
                System.out.println("På med hjälmen och cykla iväg");
                break;
            case "bil":
                System.out.println("Hoppa in i bilen");
                break;
            case "buss":
                System.out.println("Dags att kliva ombord på bussen");
                break;
            case "tåg":
                System.out.println("Trevlig resa med tåget, Tutuuut");
                break;
        }
    }

    static void uppgift7_6() {
        // TODO
    }

    static void uppgift7_9() {
        // TODO
    }

    static void uppgift7_10() {
        // TODO
    }
}
