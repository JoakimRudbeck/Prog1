package kapitel09_Metoder;

import java.util.Scanner;

public class Telefonnummer {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        UPPGIFT: REGISTRERA TELEFONNUMMER

        Skriv ett program som frågar efter telefonnummer.
        Fråga hur många telefonnummer som ska registreras.
        Be användaren skriva in så många telefonnummer som angavs.
        Spara alla telefonnummer i en lista.
        Skriv ut alla telefonnummer i listan.
        Skriv därefter ut alla telefonnummer som uppfyller villkoret "två 2:or i sig eller börjar med 070".
        Skriv även ut hur många procent av alla telefonnummer som uppfyllde villkoret.
         */

        // Fråga hur många telefonnummer som ska registreras.
        System.out.println("Hur många telfonnummer vill du registrera?");
        int antalNummer = Integer.valueOf(scan.nextLine());

        // Spara alla telefonnummer i en lista.
        String[] telenummer = new String[antalNummer];

        // Be användaren skriva in så många telefonnummer som angavs.
        for(int i = 0; i < telenummer.length; i++){
            System.out.println("Ange telenummer:");
            telenummer[i] = scan.nextLine(); // lägg in värdet i listan
        }

        // Skriv ut alla telefonnummer i listan.
        System.out.println("Alla nummer:");
        for(int i = 0; i < telenummer.length; i++){
            System.out.println(telenummer[i]);
        }

        // Skriv därefter ut alla telefonnummer som uppfyller villkoret "två 2:or i sig eller börjar med 070".
        System.out.println("Dessa nummer innehöll två tvåor eller började med 070:");
        int antalSomUppfyllerVillkoret = 0; // Räknare
        // Loopar igenom varje nummer i listan
        for(int i = 0; i < telenummer.length; i++){
            // Om börjar med 070:
            if(telenummer[i].substring(0,3).equals("070")){
                System.out.println(telenummer[i]);
                antalSomUppfyllerVillkoret++;
                continue;
            }

            // Kollar om nummret har två tvåor:
            int antalTvåor = 0;
            // Loopar igenom varje tecken i numret:
            for(int j = 0; j < telenummer[i].length(); j++){
                if(telenummer[i].charAt(j) == '2'){
                    antalTvåor++;
                }
            }
            if(antalTvåor == 2){
                System.out.println(telenummer[i]);
                antalSomUppfyllerVillkoret++;
            }
        }

        // Skriv även ut hur många procent av alla telefonnummer som uppfyllde villkoret:
        double procentSomUppfyller = 100.0*antalSomUppfyllerVillkoret / antalNummer;
        System.out.println("Det var " + procentSomUppfyller + " % som uppfyllde villkoret.");
    }
}
