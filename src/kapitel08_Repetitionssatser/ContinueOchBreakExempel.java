package kapitel08_Repetitionssatser;

public class ContinueOchBreakExempel {

    public static void main(String[] args) {
        // Continue och break, sidan 117

        // Continue används då man vill avsluta ett varv i en loop i förtid

        // Break används (förutom i switch-cases) då man vill avsluta en hel loop i förtid:

        // Exempel med continue:
        // Skriv ut följande talföljd:  2 4 6 8 12 14 16 18 22 24 26

        for(int i = 2; i <= 26; i+=2){
            if(i % 10 == 0){ // Om i jämnt delbar med 10
                continue;
            }
            System.out.print(i + " ");
        }

        // Exempel med break:
        // Skriv ut följande talföljd: 2 4 6 8 12 14 16 18 22 24 26

        int räknare = 2;
        while(true){
            if(räknare > 26){
                break;  // Avbryter hela loopen
            }
            else if(räknare % 10 == 0){
                räknare += 2;
                continue;
            }
            System.out.print(räknare + " ");
            räknare+=2;
        }

    }

}
