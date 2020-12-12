package kapitel08_Repetitionssatser;

public class TalMellan1Och10000MedVillkor {


    /*
    Skriv ett program som skriver ut alla udda tal T mellan 1 och 10000 som
    uppfyller följande krav:
    * T ska vara delbart med 7
    * T ska innehålla exakt 2 st femmor
     */

    public static void main(String[] args) {

        // Loopar alla udda tal mellan 1 och 10000
        for(int T = 1; T<= 10000; T+=2){
            // Om talet är delbart med 7
            if(T % 7 == 0){
                String TString = "" + T; // ex 5523 --> "5523"
                // Om talet har 2 femmor?
                int antalFemmor = 0;
                // Loopar igenom varje tecken i TString:
                for(int i = 0; i<TString.length(); i++){
                    if(TString.charAt(i) == '5'){
                        antalFemmor++;
                    }
                }
                if (antalFemmor == 2){
                    System.out.println(T);
                }
            }
        }
    }

}
