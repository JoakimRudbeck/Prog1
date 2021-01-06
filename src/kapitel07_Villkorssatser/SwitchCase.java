package kapitel07_Villkorssatser;

import java.util.Scanner;

public class SwitchCase {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       humörMedIf();
       humörMedSwitchCase();
       humörMedVillkorsoperatorn();
    }

    static void humörMedIf() {
        System.out.println("Hur mår du idag?");
        String humör = scanner.nextLine();
        if(humör.equals("Bra")){
            System.out.println(":)");
        }
        else if(humör.equals("Super")){
                System.out.println(":D");
        }
        else if(humör.equals("Dåligt")){
                System.out.println(":(");
        }
        else{
            System.out.println("Jag kan inte tyda ditt humör!");
        }
    }

    static void humörMedSwitchCase() {
        System.out.println("Hur mår du idag?");
        String humör = scanner.nextLine();

        switch(humör){
            case "Bra":
                System.out.println(":)");
                break;
            case "Super":
                System.out.println(":D");
                break;
            case "Dåligt":
                System.out.println(":(");
                break;
            default:
                System.out.println("Jag kan inte tyda ditt humör");
                break;
        }
        System.out.println("Denna rad körs efter switch-case");
    }

    private static void humörMedVillkorsoperatorn() {
        System.out.println("Hur mår du idag?");
        String humör = scanner.nextLine();
        String utskrift = humör.equals("Bra") ? ":)" : humör.equals("Super") ? ":D" : humör.equals("Dåligt") ? ":(" : "Jag kan inte tyda ditt humör";
        System.out.println(utskrift);
    }

}