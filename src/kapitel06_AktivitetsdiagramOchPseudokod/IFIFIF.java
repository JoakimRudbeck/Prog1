package kapitel06_AktivitetsdiagramOchPseudokod;

public class IFIFIF {

    public static void main(String[] args) {
         int ålder = 88;

         // om yngre än 18 då är du barn
        if(ålder <= 18){
            System.out.println("Du är barn");
        }
        else if(ålder > 18 && ålder <= 65){
            System.out.println("Du är vuxen");
        }
        else{
            System.out.println("Du är pensionär");
        }

        System.out.println("Tillbaka i programmet...");

        // men om du är äldre än 18 och yngre än 65 då är du vuxen

        // annars är du pensionär




/*
        int a = 6;
        int b = 4;

        // Om summan av a och b är jämnt skriv jämnt:
        int summa = a+b;
        boolean villkoret = summa % 2 == 0;
        if(villkoret == true){
            // kod om villkoret är sant
            System.out.println(summa + " är ett jämnt tal");
        }
        else{
            // kod om villkoret är falskt
            System.out.println(summa + " är inte ett jämnt tal");
        }


        // Annars skriv udda

*/
    }
}
