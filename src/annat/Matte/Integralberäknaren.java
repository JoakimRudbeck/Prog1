package annat.Matte;

import java.util.Scanner;

public class Integralberäknaren {

    static Scanner scan = new Scanner(System.in); // En scanner som sköter inmatning från användaren.

    static void meny() {
        System.out.println("Vilken funktion vill du integrera?");
        System.out.println("\t[1] y = x^2");
        System.out.println("\t[2] y = e^x");
        System.out.println("\t[3] y = cos(x)");
        System.out.println("\t[4] y = x*ln(x)");
        int användarensVal = Integer.valueOf(scan.nextLine());         // Sparar värdet som användaren skriver in.

        System.out.println("Undre integrationsgräns a?");
        double a = Double.valueOf(scan.nextLine());
        System.out.println("Övre integrationsgräns b?");
        double b = Double.valueOf(scan.nextLine());
        System.out.println("Hur många staplar vill du använda?");
        double antalStaplar = Integer.valueOf(scan.nextLine());

        double integralBredd = b - a;                           // Beräknar bredden på intervallet.
        double stapelBredd = integralBredd / antalStaplar;      // Beräknar bredden på varje stapel.

        // Skapar 3 variabler för de olika integralvärdena (exakt värde, rektangelmetod, trapetsmetoden):
        double integralVärdeExakt = 0.0;
        double integralVärdeRektangelMetoden = 0.0;
        double integralVärdeTrapetsMetoden = 0.0;

        // En variabel som håller koll på vilken funktion som ska integreras:
        String funktion = "";

        // Gör olika beräkningar beroende på vilket val som användaren skrev in.
        switch (användarensVal){
            case 1: // Alternativ [1] y = x^2
                funktion = "x^2";
                integralVärdeExakt = primitivTillxKvadrat(b) - primitivTillxKvadrat(a); // Integralkalkylens fundamentalsats
                break;
            case 2: // Alternativ [2] y = e^x
                funktion = "e^x";
                integralVärdeExakt = primitivTilleUpphöjtTillX(b) - primitivTilleUpphöjtTillX(a); // Integralkalkylens fundamentalsats
                break;
            case 3: // Alternativ [3] y = cos(x)
                funktion = "cos(x)";
                integralVärdeExakt = primitivTillCosX(b) - primitivTillCosX(a); // Integralkalkylens fundamentalsats
                break;
            case 4:  // Alternativ [4] y = x*ln(x)
                funktion = "x*ln(x)";
                break;
        }

        // Beräknar de numeriska värdena på integralen med rektangelmetoden resp. trapetsmetoden:
        integralVärdeRektangelMetoden = rektangelMetoden(funktion,a,b,stapelBredd);
        integralVärdeTrapetsMetoden = trapetsMetoden(funktion,a,b,stapelBredd);

        // Beräknar skillnaden mellan exakta värdet och de numeriska värdena:
        double deltaRektangelMetoden = Math.abs(integralVärdeExakt - integralVärdeRektangelMetoden);
        double deltaTrapetsMetoden = Math.abs(integralVärdeExakt - integralVärdeRektangelMetoden);

        System.out.println("Värdet av integralen av y = " + funktion + " från " + a + " till " + b + " dx är:");
        if(funktion.equals("x*ln(x)")){
            System.out.println("\t\t\tExakt värde saknas");
            System.out.printf("\t%.3f\tRektangelmetoden\n", integralVärdeRektangelMetoden);
            System.out.printf("\t%.3f\tTrapetsmetoden\n", integralVärdeTrapetsMetoden);
        }
        else{
            System.out.printf("\t%.3f\tExakt värde (Integralkalkylens fundamentalsats)\n", integralVärdeExakt);
            System.out.printf("\t%.3f\tRektangelmetoden (delta: %.5f)\n", integralVärdeRektangelMetoden, deltaRektangelMetoden);
            System.out.printf("\t%.3f\tTrapetsmetoden (delta: %.5f)\n", integralVärdeTrapetsMetoden, deltaTrapetsMetoden);
        }
    }

    static double rektangelMetoden(String funktion, double a, double b, double stapelBredd) {
        double integralVärde = 0.0;
        for(double i = a; i < b; i+=stapelBredd){
            switch(funktion){
                case "x^2":
                    integralVärde += stapelBredd*xKvadrat(i+stapelBredd/2);
                    break;
                case "e^x":
                    integralVärde += stapelBredd*eUpphöjtTillX(i+stapelBredd/2);
                    break;
                case "cos(x)":
                    integralVärde += stapelBredd*cosX(i+stapelBredd/2);
                    break;
                case "x*ln(x)":
                    integralVärde += stapelBredd*xLnx(i+stapelBredd/2);
                    break;
            }
        }
        return integralVärde;
    }

    static double trapetsMetoden(String funktion, double a, double b, double stapelBredd) {
        double integralVärde = 0.0;
        for(double i = a; i < b; i+=stapelBredd){
            switch(funktion){
                case "x^2":
                    integralVärde += stapelBredd*(xKvadrat(i) + xKvadrat(i+stapelBredd)) / 2;
                    break;
                case "e^x":
                    integralVärde += stapelBredd*(eUpphöjtTillX(i) + eUpphöjtTillX(i+stapelBredd)) / 2;
                    break;
                case "cos(x)":
                    integralVärde += stapelBredd*(cosX(i) + cosX(i+stapelBredd)) / 2;
                    break;
                case "x*ln(x)":
                    integralVärde += stapelBredd*(xLnx(i) + xLnx(i+stapelBredd)) / 2;
                    break;
            }
        }
        return integralVärde;
    }

    static double xKvadrat(double x) {
        return Math.pow(x,2);
    }

    static double primitivTillxKvadrat(double x) {
        return Math.pow(x,3) / 3;
    }

    static double cosX(double x) {
        return Math.cos(x);
    }

    static double primitivTillCosX(double x) {
        return Math.sin(x);
    }

    static double eUpphöjtTillX(double x) {
        return Math.pow(Math.E,x);
    }

    static double primitivTilleUpphöjtTillX(double x) {
        return Math.pow(Math.E,x);
    }

    static double xLnx(double x) {
        return x*Math.log(x);
    }

    public static void main(String[] args) {
        String.valueOf(45);

        System.out.println("Välkommen till integralberäknaren");
        System.out.println();
        System.out.println("Det här programmet kan användas för att integrera funktioner numeriskt med");
        System.out.println("rektangelmetoden resp. trapetsmetoden och se hur dessa värden avviker från det exakta värdet.");
        System.out.println();
        while(true){
            meny();
            System.out.println("Tryck enter för ny beräkning");
            scan.nextLine();
        }
    }
}