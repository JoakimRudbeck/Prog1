package kapitel07_Villkorssatser;

import java.util.Scanner;

public class SwitchCase {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String namn = "Joakim";
        System.out.println("Vad heter du?");
        String namnInput = scanner.nextLine();
        System.out.println("Du heter " + namnInput);

        if(namn.equals(namnInput)){
            System.out.println("Du heter samma som läraren");
        }
        else{
            System.out.println("Du heter inte samma som läraren");
        }

















        //humörMedIf();
        //humörMedSwitchCase();
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

}