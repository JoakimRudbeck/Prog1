package kapitel02_Variabler;

import java.util.Scanner;

public class Övningar {

    public static void main(String[] args) {
        System.out.println("Övningarna startar");
        övning2_1();
        övning2_2();
        övning2_3();
        övning2_4();
        övning2_5();
        övning2_6();
        övning2_7();
        övning2_8();
        System.out.println("Övningarna slutar");
    }

    static void övning2_1() {
        System.out.println("ÖVNING 2.1");
        double talA, talB, summa;           // Deklarerar tre variabler av typen double.
        talA = 2.1;                         // Tilldelar variabel talA värdet 3.14
        talB = 3.1;
        summa = talA + talB;                // Variabel summa tilldelas summan av talA och talB
        System.out.println("Tal A är " + talA);
        System.out.println("Tal B är " + talB);
        System.out.println("Summan är " + summa);
    }

    static void övning2_2() {
        System.out.println("ÖVNING 2.2");
        Scanner minScanner = new Scanner(System.in);            // Skapar ett Scanner-objekt som ska läsa från tangentbordet
        System.out.println("Skriv in ett tal, tack:");
        String taletSomSträng = minScanner.nextLine();          // Läser in från tangentbordet
        int taletSomInt = Integer.valueOf(taletSomSträng);      // Gör om strängen till till int
        int kvadrat = taletSomInt * taletSomInt;                // Skapar och beräkna kvadraten
        System.out.println(taletSomInt + " i kvadrat är " + kvadrat);
    }

    static void övning2_3() {
        System.out.println("ÖVNING 2.3");
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Ange din ålder:");
        int ålder = Integer.valueOf(minScanner.nextLine());
        int förraNollningsåldern = (ålder / 10) * 10;
        int årKvarTillNästaNollning = 10 - (ålder - förraNollningsåldern);
        System.out.println("Du fyller " + (ålder + årKvarTillNästaNollning) + " om " + årKvarTillNästaNollning + " år!");
    }

    static void övning2_4() {
        System.out.println("ÖVNING 2.4");
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Skriv ett heltal");
        int a = Integer.valueOf(minScanner.nextLine());
        System.out.println("Skriv ett heltal");
        int b = Integer.valueOf(minScanner.nextLine());
        System.out.println("Skriv ett heltal");
        int c = Integer.valueOf(minScanner.nextLine());
        int summa = a + b + c;
        double medelVärde = summa / 3.0;    // Testa vad som händer om det står 3 istället för 3.0
        System.out.printf("Summan av %d, %d och %d är %d\n", a,b,c,summa);                // printf kan användas såhär
        System.out.printf("Medelvärdet av %d, %d och %d är %f", a,b,c,medelVärde);      // %d betyder heltal och %f betyder decimaltal
        System.out.println();
    }

    static void övning2_5() {
        System.out.println("ÖVNING 2.5");
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Ange för- och efternamn:");
        String namn = minScanner.nextLine();
        char förstaInitialen = namn.charAt(0);          // Tar ut det första tecknet ur strängen
        int indexOfMellanslag = namn.indexOf(' ');     // Tar ut indexet för där mellanslaget är
        char andraInitialen = namn.charAt(indexOfMellanslag+1);
        System.out.printf("%s har initialerna %s.%s.", namn, förstaInitialen, andraInitialen);
        System.out.println();
    }

    static void övning2_6() {
        System.out.println("ÖVNING 2.6");
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Ange för- och efternamn:");
        String namn = minScanner.nextLine();
        int indexOfMellanslag = namn.indexOf(' ');
        String förnamn = namn.substring(0, indexOfMellanslag);          // skapar en delsträng från index 0 till mellanslaget
        String efternamn = namn.substring(indexOfMellanslag);           // Om inget slutindex anges så fås resten av strängen
        System.out.println("Förnamn: " + förnamn);
        System.out.println("Efternamn: " + efternamn);
    }

    static void övning2_7() {
        System.out.println("ÖVNING 2.7");
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Tecken: ");
        String indata = minScanner.nextLine();
        char förstaTecknetIIndata = indata.charAt(0);
        int tecknetsIntVärde = (int) förstaTecknetIIndata;
        System.out.println("Tecknet " + förstaTecknetIIndata + " har teckenkoden " + tecknetsIntVärde);
    }

    static void övning2_8() {
        System.out.println("ÖVNING 2.8");
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Ange stor bokstav: ");
        String indata = minScanner.nextLine();
        char tecknet = indata.charAt(0);
        char tecknetSomLitet = (char)(tecknet + 32);    // Skillnaden mellan stora A (65) och lilla a (97) är 32 enligt UNICODE-tabellen sid 37 i boken.
        System.out.println("Litet " + tecknet + " blir " + tecknetSomLitet);
    }

}
