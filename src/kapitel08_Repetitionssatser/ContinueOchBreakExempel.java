package kapitel08_Repetitionssatser;

public class ContinueOchBreakExempel {

    public static void main(String[] args) {
        // Continue och break, sidan 117

        // Continue används då man vill avsluta ett varv i en loop i förtid

        // Break används (förutom i switch-cases) då man vill avsluta en hel loop i förtid:

        // Exempel med continue:
        // Skriv ut följande talföljd:  2 4 6 8 12 14 16 18 22 24 26
        for(int i = 2; i <= 26; i+=2){      // Loopen börjar på 2, ökar med 2 och slutar vid 26.
            if(i % 10 == 0){                // Om i jämnt delbar med 10 (då i är 10 och 20)
                continue;                   // Hoppa vidare till nästa varv
            }
            System.out.print(i + " ");      // Skriv ut värdet på i.
        }

        // Exempel med break:
        // Skriv ut följande talföljd (samma som ovan): 2 4 6 8 12 14 16 18 22 24 26
        int räknare = 2;
        while(true){                        // Oändlig loop
            if(räknare > 26){               // Om vi gått förbi 26
                break;                      // Avbryter hela loopen
            }
            else if(räknare % 10 == 0){     // Om räknaren är jämnt delbar med 10 (för 10 och 20)
                räknare += 2;               // Öka räknaren med 2
                continue;                   // Hoppa till nytt varv i loopen
            }
            System.out.print(räknare + " ");
            räknare+=2;                     // Öka räknaren med 2
        }

    }

}
