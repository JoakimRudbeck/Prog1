package kapitel07_Villkorssatser;

import java.util.Scanner;

public class Övningar {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        övning7_1();
        övning7_2();
        övning7_3();
        övning7_4();
        övning7_5();
        övning7_6();
        övning7_7();
    }

    static void övning7_1() {
        System.out.println("Övning 7.1:");
        System.out.println("Ålder?");
        int ålder = scan.nextInt();
        if(ålder >= 12){
            System.out.println("Du får delta på tävlingen");
        }
        else{
            System.out.println("Du får tyvärr inte delta på tävlingen.");
        }
    }

    static void övning7_2() {
        System.out.println("Övning 7.2:");
        double tankVolym = 50;
        double prisPerLiter = 9.50;
        System.out.println("Hur mycker etanol finns i tanken?");
        double etanolITanken = scan.nextDouble();
        if (etanolITanken > 10){
            System.out.println("Kör vidare.");
        }
        else{
            System.out.println("Du bör tanka");
            double literTillFullTank = tankVolym - etanolITanken;
            double prisFörAttFåFullTank = literTillFullTank * prisPerLiter;
            System.out.println("Du bör tanka " + literTillFullTank + " liter, det kommer kosta " + prisFörAttFåFullTank + " kr.");
        }
    }

    static void övning7_3() {
        int taxa = 5;
        System.out.println("Ålder?");
        int ålder = Integer.valueOf(scan.nextLine());
        if(ålder >= 15 && ålder < 65){
            taxa *= 2;
        }
        if(ålder < 0){
            System.out.println("Ålder måste vara ett naturligt tal.");
        }
        else{
            System.out.println("Det kostar " + taxa + " kr.");
        }
    }

    static void övning7_4() {
        int taxa = 10;
        System.out.println("Ålder?");
        int ålder = Integer.valueOf(scan.nextLine());
        if(ålder < 15 || ålder >= 65){
            taxa /= 2;
        }
        if(ålder < 0){
            System.out.println("Ålder måste vara ett naturligt tal.");
        }
        else{
            System.out.println("Det kostar " + taxa + " kr.");
        }
    }

    static void övning7_5() {
        System.out.println("Längd?");
        //double längd = ...
        System.out.println("Vind?");
    }

    static void övning7_6() {
        // Läs uppgiften på s.87
        // Diskutera med grannen hur lösas?!

        // Skriv pseudokod:
        // 1. Läs in antal CD-skivor
        Scanner scanner = new Scanner(System.in);
        System.out.println("Antal skivor?");
        int antal = Integer.valueOf(scanner.nextLine());

        // 2. Räkna ut priset för antal CD-skivor:

        double priset = 0;

        // om antal skivor är mindre än 10:
        if(antal <= 10){
            System.out.println("Du får ingen rabatt");
            // ge ingen rabatt
            // priset = 9,9 * antal skivor
            priset = 9.9*antal;
        }
        // om antal skivor är mer än 10:
        else if(antal > 10 && antal < 50){
            System.out.println("Du får 5 % rabatt");
            // ge 5% rabatt
            // priset = 9,9 * antal skivor * 0,95
            priset = 9.9*antal*0.95;
        }
        // om antal skivor större än 100:
        else if(antal > 100){
            System.out.println("Du får 15 % rabatt");
            // ge rabatt med 15%
            priset = 9.9*antal*0.85;
        }
        // om antal skivor större än 50:
        else if(antal > 50){
            System.out.println("Du får 10 % rabatt");
            // ge 10% rabatt
            // priset = 9,9 * antal skivor * 0,9
            priset = 9.9*antal*0.9;
        }

        // 3. Skriv ut totala priset
        System.out.println("Tot pris för " + antal + " skivor är " + priset + " SEK");

        // Testkör
    }

    static void övning7_7() {
        double behållning = 1000;
        System.out.println("MENY");
        System.out.println("1. Insättning");
        System.out.println("2. Uttag");
        System.out.println("3. Visa behållning");
        String val = scan.nextLine();
        switch (val) {
            case "1":
                System.out.println("Hur mycket vill du sätta in?");
                double insättning = Double.valueOf(scan.nextLine());
                behållning += insättning;
                System.out.println("Behållningen är nu " + behållning);
                break;
            case "2":
                System.out.println("Hur mycket vill du ta ut?");
                double uttag = Double.valueOf(scan.nextLine());
                if(uttag <= behållning) {
                    behållning -= uttag;
                    System.out.println("Behållningen är nu " + behållning);
                }
                else {
                    System.out.println("Det finns inte tillräckligt med pengar att ta ut.");
                }
                break;
            case "3":
                System.out.println("Behållningen är " + behållning);
                break;
        }
    }
}