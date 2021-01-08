package kapitel06_AktivitetsdiagramOchPseudokod;

public class Exitticket {

    public static void main(String[] args) {
        boolean niFårSLutaTidigare = false;

        int a = 0;
        int b = 0;
        niFårSLutaTidigare = (3 > 2 && a % 10 == 4) || a*b == 121 == !true; // && betyder OCH

        if(niFårSLutaTidigare == true){
            System.out.println("Ni får sluta tidigare");
        }
        else{
            System.out.println("Ni får inte sluta tidigare");
        }


    }
}
