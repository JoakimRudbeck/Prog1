package kapitel07_Villkorssatser;

public class Villkor {

    public static void main(String[] args) {
        enklaVillkor();
        sammanslagnaVillkor();
        avanceradeSammanslagdaVillkor();
    }

    static void enklaVillkor() {
        // Det finns 6 olika jämförelser att göra

        System.out.println(3 == 7);     // lika med
        System.out.println(3 < 7);      // mindre än
        System.out.println(3 <= 7);     // mindre än eller lika med
        System.out.println(3 > 7);      // större än
        System.out.println(3 >= 7);     // större än eller lika med
        System.out.println(3 != 7);     // skilt från
    }

    static void sammanslagnaVillkor() {
        // En kan slå ihop villkor med varandra med hjälp av OCH och ELLER
        // OCH skrivs &&
        // ELLER skrivs ||

        // OCH (&&)
        System.out.println(3 < 7 && 4 < 8); // true eftersom båda villkoren är true
        System.out.println(3 < 7 && 4 > 8); // false eftersom ena villkoret är false

        // ELLER (||)
        System.out.println(3 < 7 || 4 < 8); // true eftersom minst ett av villkoren är true
        System.out.println(3 < 7 || 4 > 8); // true eftersom minst ett av villkoren är true
    }

    static void avanceradeSammanslagdaVillkor() {
        // Vad tror du vi får för utskrift och varför?
        System.out.println(((8%3) < 5 && 4/3 > 1) || 6 < 1+2+3) ;
    }

}
