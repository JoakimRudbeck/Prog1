package kapitel08_Repetitionssatser;

public class While {

    public static void main(String[] args) {
        whileLoopExempel();
        whileContinueExempel();
        whileBreakExempel();
    }

    static void whileLoopExempel() {
        // En while loop gör saker om och om igen så länge ett villkor är sant.
        int räknare = 0; // En räknare vars värde kommer vara avgörande för när while-loopen ska ta slut.
        while(räknare < 10){    // Gör följande så länge räknarena värde är mindre än 10:
            System.out.println("Räknarens värde är " + räknare + " vilket är mindre än 10.");
            räknare ++; // Uppdatera räknaren så att den så småningom kommer göra att villkoret blir falskt.
        }
        System.out.println("Nu avlsutades while-loopen eftersom villkoret inte längre är sant.");
    }

    static void whileContinueExempel() {
        // Skriv ut alla tal som är delbara med 3
        int talet = 1;
        while(talet <= 50){
            // Om talet inte är jämnt delbart med 3:
            if(talet % 3 != 0){
                talet++;
                continue;   // Continue avbryter varvet och börjar på nästa varv
            }
            System.out.println(talet);
            talet++;
        }
    }

    static void whileBreakExempel() {
        // Skriv ut alla tal upp till och med 1337
        int räknare = 1;
        while(true){
            System.out.println(räknare);
            if(räknare == 1337){
                break;          // break avbryter hela while-loopen.
            }
            räknare++;
        }
    }

}