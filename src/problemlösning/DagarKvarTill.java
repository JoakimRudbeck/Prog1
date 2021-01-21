package kapitel09_Metoder;

public class DagarKvarTill {
    static int dagarFrånNyårTIllMidsommar = 31+28+31+30+31+21;
    static int[] dagarIÅretsMånader = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        int dagar = dagarKvarTillMidsommar(6, 23);
        System.out.println(dagar);
    }

    static int dagarKvarTillMidsommar(int månad, int dag){
        // Beräkna dagar från nyår till inkommet datum.
        // Beräkna skillnaden mellan det värdet och antal dagar från nyår och midsommar.
        // Om den skillnaden är negativ. Ta 365 - det värdet.

        int dagarFrånNyårTillInkommetDatum = 0;
        // Loopar igenom listan med dagar i varje månad
        for(int i = 0; i < månad-1; i++){
            dagarFrånNyårTillInkommetDatum += dagarIÅretsMånader[i];
        }
        dagarFrånNyårTillInkommetDatum += dag;

        int dagarMellanMidsommarOchInkommetDatum = dagarFrånNyårTIllMidsommar - dagarFrånNyårTillInkommetDatum;
        if(dagarMellanMidsommarOchInkommetDatum < 0){
            return 365 + dagarMellanMidsommarOchInkommetDatum;
        }
        else{
            return dagarMellanMidsommarOchInkommetDatum;
        }
    }
}
