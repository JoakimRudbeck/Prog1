package kapitel08_Repetitionssatser;

import java.util.Scanner;

public class ForLoop {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ritaUppTriangel();
        ritaUppRektangel();
        störstaTalILista();
        forLoopExempel();
        forLoopExempelFrågaAnvändaren();
        loopaIgenomEnLista();
        fyllaEnListaMedVärden();
        nestladForLoopExempel();
        besökaKöpCentret();
        beräknaMedelvärdeUrEnListaMedTal();

    }

    static void ritaUppTriangel() {
        System.out.println("Höjd?");
        int höjd = Integer.valueOf(scan.nextLine());
        System.out.println("Tecken?");
        char tecken = scan.nextLine().charAt(0);

        for(int i = 1; i <= höjd; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(tecken + " ");
            }
            System.out.println();
        }
    }

    static void ritaUppRektangel() {
        System.out.println("Höjd?");
        int höjd = Integer.valueOf(scan.nextLine());
        System.out.println("Bredd?");
        int bredd = Integer.valueOf(scan.nextLine());
        System.out.println("Tecken?");
        char tecken = scan.nextLine().charAt(0);

        for(int i = 1; i <= höjd; i++){
            for(int j = 1; j<= bredd; j++){
                System.out.print(tecken + " ");
            }
            System.out.println();
        }
    }

    static void beräknaMedelvärdeUrEnListaMedTal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hur många tal vill du spara?");
        int antal = Integer.valueOf(scan.nextLine());
        int[] lista = new int[antal];

        // Ger listan värden:
        for(int i = 0; i < lista.length; i++){
            System.out.println("Skriv in tal på plats " + (i+1) + ":");
            lista[i] = scan.nextInt();
        }
        // Beräknar medelvärde:
        int summa = 0;
        for(int i = 0; i < lista.length; i++){
            summa += lista[i];
        }
        double medelvärde = (double)summa / lista.length;
        System.out.println("Medelvärdet av talen i listan är " + medelvärde);
    }

    static void störstaTalILista() {
        System.out.println("Hur många tal vill du skriva in?");
        int antalTal = scan.nextInt();

        int[] lista = new int[antalTal];
        // läser in tal
        for(int i = 0; i<lista.length; i++){
            System.out.println("Tal på plats " + (i+1) + "?");
            lista[i] = scan.nextInt();
        }

        int största = lista[0];

        // loopar igenom alla tal i listan
        for(int i = 0; i < lista.length; i++){
            if(lista[i] > största){
                största = lista[i];
            }
        }
        System.out.println("Största är " + största);
    }

    static void forLoopExempel() {
        // En for-loop gör saker om och om igen.
        // For-loopen har en iterationsvariabel, ofta kallad i
        // For-loopen ändrar värdet på i efter varje varv i loopen
        // For-loopen måste veta hur länge den ska hålla på.

        // i är iterationsvariabeln
        // Loopen håller på så länge i är mindre än 5 (dvs 5 varv)
        // I slutet av varje varv ökar iterationsvariabeln i med 1.
        int b = 7;
        for(int i = 44; i <= 126; i++){
            if(i % 2 == 0){
                System.out.println("Värdet på iterationsvariabeln i är " + i);
            }
        }

        System.out.println("Programmet fortsätter efter att for-loopen är klar.");

    }

    static void forLoopExempelFrågaAnvändaren() {
        System.out.println("Startvärde?");
        int startVärde = Integer.valueOf(scan.nextLine());
        System.out.println("Slutvärde (inklusive)?");
        int slutVärdeInklusive = Integer.valueOf(scan.nextLine());
        System.out.println("Steg?");
        int steg = Integer.valueOf(scan.nextLine());

        for(int i = startVärde; i <= slutVärdeInklusive; i+=steg){
            System.out.println("Iterationsvaribeln i har värdet " + i + " i detta varvet av loopen.");
        }
        System.out.println("Nu är vi utanför loopen och denna rad körs nu :)");
    }

    static void loopaIgenomEnLista() {

        String[] lista = {"mango", "äpple", "banan"};

        System.out.println(lista);

        for(int i = 0; i < lista.length; i++){

            System.out.println("Värde i listan:" + lista[i]);

        }
        System.out.println("Nu är vi utanför loopen");
    }

    static void fyllaEnListaMedVärden() {
        // Skapar en lista av strängar med 5 platser:
        String[] listaAvSträngar = new String[5];

        // Skapar en loop som gör lika många varv som antal platser i listan av strängar:
        for(int i = 0; i < listaAvSträngar.length; i++){    // i börjar på 0 och kommer anta värdena 0,1,2,3,4.
            System.out.println("Skriv in ett ord som du vill lägga in på index " + i + " i listan:");
            listaAvSträngar[i] = scan.nextLine(); // Lägger in värdet som användaren skriver in i listan på den plats vars index är i.
        }

        // For loopen ovan gör precis följande fast på bara 3 rader kod.
        /*
        listaAvSträngar[0] = scan.nextLine();
        listaAvSträngar[1] = scan.nextLine();
        listaAvSträngar[2] = scan.nextLine();
        listaAvSträngar[3] = scan.nextLine();
        listaAvSträngar[4] = scan.nextLine();
        */

        // Loopar igenom hela listan och skriver ut resp värde i listan:
        for(int i = 0; i < listaAvSträngar.length; i++){  // i kommer även i denna loop anta värdena 0,1,2,3,4
            System.out.println("Ordet på index " + i + " i listan är: " + listaAvSträngar[i]);
        }
    }

    static void nestladForLoopExempel() {
        // Skriver ut alla koordinater i första kvadranten från origo till punkten (9,9)
        for(int y = 9; y >= 0; y--){
            for(int x = 0; x <= 9; x++){
                System.out.printf("(%d,%d)\t", x,y);
            }
            System.out.println();
        }
    }

    static void besökaKöpCentret() {
        // Besöker varje våning v:
        for(int v = 1; v <= 6; v++){
            // Besöker varje affär a
            for(int a = 1; a <= 4; a++){
                System.out.println("Är på våning " + v + ", vid affär " + a);
            }
        }
    }

}