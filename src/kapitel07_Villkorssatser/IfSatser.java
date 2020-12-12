package kapitel07_Villkorssatser;

import java.util.Scanner;

public class IfSatser {

    static Scanner scanner = new Scanner(System.in);
    static boolean uttryck1;
    static boolean uttryck2;

    public static void main(String[] args) {
        ifSats_Syntax();
        ifElseSats_Syntax();
        ifElseIfElseSats_Syntax();
        ifSats_Exempel();
        ifElseIfElseSats_Exempel();
        ifElseSats_Exempel();
        equalsExempel();
        notContainsExempel();
        VillkorExempel();
    }

    static void ifSats_Syntax() {
        // Syntax för if-sats:
        if(uttryck1){
            // Satser
        }
    }

    static void ifElseSats_Syntax() {
        // Syntax för if-else-sats:
        if(uttryck1){
            // Satser
        }
        else{
            // Satser
        }
    }

    static void ifElseIfElseSats_Syntax() {
        // Syntax för if-else-if-else-sats:
        if(uttryck1){
            // satser
        }
        else if(uttryck2){
            // satser
        } // Du kan bygga på med fler else if om du vill.
        else{
            // satser
        }
    }

    static void notContainsExempel() {
        System.out.println("Skriv in ett ord, tack:");
        String input = scanner.nextLine();
        if(!input.contains("a")){
            System.out.printf("%s innehåller inte bokstaven a.", input);
        }
        else {
            System.out.printf("%s innehåller bokstaven a.", input);
        }
    }

    static void ifSats_Exempel() {
        int a = 13;
        if(a < 10){
            System.out.printf("%d är mindre än 10.",a);
        }
        System.out.println("Denna kod körs oavsett, den ligger efter if-satsen.");
    }

    static void ifElseSats_Exempel() {
        int a = 5;
        int b = 3;
        if(a == b){
            System.out.printf("%d är lika med %d. ",a,b);
        }
        else{
            System.out.printf("%d är inte lika med %d. ",a,b);
        }
        // Nu är hela if-else-satsen slut. All kod nedan kommer köras.
        System.out.println("Denna körs alltid.");
    }

    static void ifElseIfElseSats_Exempel() {
        System.out.println("Ålder?");
        int ålder = scanner.nextInt();
        // Koden kommer bara gå in i en av dessa kodblock.
        // Om ålder är 15 så kommer den gå in i första blocket men inte nästa trots att 15 < 65.
        if(ålder < 18){
            System.out.println("Du är ett barn.");
        }
        else if(ålder < 65){
            System.out.println("Du är vuxen.");
        }
        else{
            System.out.println("Du är i pensionsålder.");
        }

        // Här är hela if-satsen slut. All kod nedan kommer alltid att köras
        // förutsatt att vi inte får ett exekveringsfel innan :)
    }

    static void equalsExempel() {
        Scanner scanner = new Scanner(System.in);
        String hej = scanner.nextLine();
        if(hej.equalsIgnoreCase("hej")){ // Jämför utan att bry sig om stora / små bokstäver. Ex: "BRA".equalsIgnoreCase("bra") ger true.
            System.out.println("Inuti if-satsen.");
        }
        else{
            System.out.println("Gick inte in i if-satsen");
        }
    }

    static void VillkorExempel() {
        if((9 % 3 != 0 && 3 == 12-9) || 6 <= 3*2  || 1==1){
            System.out.println("Inne i jobbig if-sats!");
        }
        else{
            System.out.println("Inne i else");
        }
        System.out.println("Utanför if-satsen, programmet fortsätter!");
    }

}