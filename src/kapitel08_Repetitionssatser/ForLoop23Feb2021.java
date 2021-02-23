package kapitel08_Repetitionssatser;

import java.util.Scanner;

public class ForLoop23Feb2021 {

    public static void main(String[] args) {
        teoriOmForLoopen();
        värdeTabell();
        kompisarMedBokstavenS();
    }

    private static void teoriOmForLoopen() {
        /* Alla for-loopar följer denna mall:
        for(iterationsvariabel; villkor; förändring){    OBS! Inget ; i slutet av denna rad!
         // Kod som körs varje varv.
        }

        iterationsvariabeln är en variabel som finns tillgänglig genom hela loopens livslängd.
        Exempel på iterationsvariabel är int i = 0;

        Villkor är ett boolean villkor (true eller false) som kontrolleras inför varje nytt varv.
        Så länge som villkoret är sant så kommer loopen gå in i ett till varv.
        Exempel på villkor är i < lista.length

        Förändring är en förändring som görs i slutet av varje varv.
        Exempel på förändring är i++

        */

        // Detta är ett exempel på en loop som skriver ut kvadraten av alla udda tal mellan 3 och 9:
        for(int p = 3; p <= 9; p+=2){
            System.out.print(p*p + "    ");
        }
        // Dvs denna utskrift:
        // 9    25    49    81

        // 3*3  5*5   7*7   9*9
    }

    private static void värdeTabell() {
        System.out.println("Värdetabell för f(x) = 3 + x^2 (x mellan -10 och 10)");
        for(int x = -10; x <= 10; x++){
            int yVärde = 3 + x*x;
            System.out.println("f("  + x + ") = " + yVärde);
        }
    }

    private static void kompisarMedBokstavenS() {
        Scanner scan = new Scanner(System.in);

        // Skriv ett program där användaren får skriva in namnet på sina N st kompisar.
        System.out.println("Hur många kompisar (N) har du ?");
        int N = Integer.valueOf(scan.nextLine());

        // Namnen ska sparas i ett fält.
        String[] namnen = new String[N];

        // Loop som lägger in namnen i fältet:
        for(int indexNummer = 0; indexNummer < namnen.length; indexNummer++){
            System.out.println("Vad heter kompis nummer " + (indexNummer+1) + "?");
            namnen[indexNummer] = scan.nextLine();
        }

        // Räknare för antal namn med s i namnet:
        int antalNamnMedS_I_Namnet = 0;

        System.out.println("Dessa namn har ett 's' i sig:");

        // Loop som skriver ut alla namn som har ett s i sig:
        for(int indexNummer = 0; indexNummer < namnen.length; indexNummer++){
            if(namnen[indexNummer].toLowerCase().contains("s")){
                System.out.println(namnen[indexNummer]);
                antalNamnMedS_I_Namnet++; // Ökar räknaren med 1.
            }
        }

        // Beräknar procent av namnen som innehåller s.
        double procentAvNamnenSomHarS_I_Sig = 100 * ((double) antalNamnMedS_I_Namnet / N);
        System.out.println("Det var " + procentAvNamnenSomHarS_I_Sig + "% av dina kompisar som hade ett 's' i sitt namn.");

    }

}
