package kapitel08_Repetitionssatser;

import java.util.Scanner;

public class Uppgifter {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        uppgift1();
        uppgift2();
        uppgift3();
        uppgift4();
        uppgift5();
        uppgift6();

    }

    static void uppgift1() {
        System.out.println("Uppgift1:Skriver ut talen 3 till 10");
        System.out.println("a:");
        for(int tal = 3; tal <= 10; tal++){
            System.out.print(tal + " ");
        }
        System.out.println("\nb:");
        int tal = 3;
        while(tal <=10){
            System.out.print(tal + " ");
            tal++;
        }

        System.out.println("\nc:");
        int talet = 3;
        do{
            System.out.print(talet + " ");
            talet++;
        }
        while(talet<=10);
    }

    static void uppgift2() {
        System.out.println("Uppgift2: Skriv in talen 1-5 i ett fält");
        int[] fältet = new int[5];
        // inmatning till fältet:
        for(int index = 0; index < fältet.length; index++){
            fältet[index] = index + 1; // lägger in värde i fältet
        }

        // skriver ut värdena i omvänd ordning:
        for(int index = fältet.length-1; index >=0; index--){
            System.out.println(fältet[index]);
        }
    }

    static void uppgift3() {
        System.out.println("Uppgift3a:");
        System.out.println("Antal stjärnor ?");
        int antal = Integer.valueOf(scanner.nextLine());
        for(int i = 1; i <= antal; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.println("Uppgift3b:");
        System.out.println("Antal rader?");
        int rader = Integer.valueOf(scanner.nextLine());
        System.out.println("Antal kolumner?");
        int kolumner = Integer.valueOf(scanner.nextLine());

        for(int rad = 0; rad < rader; rad++){
            for(int kolumn = 0; kolumn < kolumner; kolumn++){
                System.out.print("*");
            }
            System.out.println(); // ny rad
        }
    }

    static void uppgift4() {
        int antal = 0;
        loop: do{

            System.out.println("Meny");
            System.out.println("1. Nollställ");
            System.out.println("2. Öka passagerare med en");
            System.out.println("3. Minska passagerare med en");
            System.out.println("4. Antal passagerare");
            System.out.println("5. Avsluta program");
            int val = Integer.valueOf(scanner.nextLine());
            switch (val){
                case 1:
                    antal = 0;
                    System.out.println("Passagerare nollställt!");
                    break;
                case 2:
                    antal++;
                    System.out.println("Ökade antal apssagerare med en");
                    break;
                case 3:
                    if(antal == 0){
                        antal--;
                        System.out.println("Minskade antal apssagerare med en");
                    }
                    else {
                        System.out.println("Kan inte minska antal passagerare eftersom antal är 0");
                    }
                    break;
                case 4:
                    System.out.println("Antal passagerare ombord = " + antal);
                    break;
                case 5:
                    break loop;
            }
        }
        while(true);
    }

    static void uppgift5() {



        System.out.println("Uppgift5");
        System.out.println("n?");
        int n = Integer.valueOf(scanner.nextLine());
        int summa = 0;
        for(int i = 1; i <=n; i++){
            summa += i;
            System.out.print(i);
            if(i != n){
                System.out.print("+");
            }
            else{
                System.out.print("=" + summa);
            }
        }
    }

    static void uppgift6() {
        System.out.println("Uppgift6");
        System.out.println("n?");
        int n = Integer.valueOf(scanner.nextLine());
        int produkt = 1;
        for(int i = 1; i <=n; i++){
            produkt += i;
            System.out.print(i);
            if(i != n){
                System.out.print("+");
            }
            else{
                System.out.print("=" + produkt);
            }
        }
    }


}
