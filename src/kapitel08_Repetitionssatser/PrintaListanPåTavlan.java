package kapitel08_Repetitionssatser;

public class PrintaListanPåTavlan {

    public static void main(String[] args) {
        // Vi vill skriva ut följande:
        // 22 24 28 30.0 32 34 38 40.0 42 44 48 50.0 X 54 58 60.0 62 64 68 70.0
        printaListanPåTavlanMedWhile();
        printaListanPåTavlanMedFor();
    }

    static void printaListanPåTavlanMedFor() {

        for(int n = 22;n <= 70;n += 2){
            if(n%10 == 6){  // Om talet slutar på en sexa.
                continue;
            }
            if(n%10 == 0){ // Om talet är ett jämnt tiotal
                System.out.print((double)n + " ");
                continue;
            }
            if(n == 52){  // Om talet är 52, skriv ut X istället.
                System.out.print("X" + " ");
                continue;
            }
            System.out.print(n + " ");
        }
    }


    static void printaListanPåTavlanMedWhile(){
        int tal = 22;
        while (tal<=70){
            if (tal==52){ // Om talet är 52 skriv ut ett X
                System.out.print("X ");
            }
            else if (tal%10==0){ // Alla tiotal
                double talSomDouble = (double)tal;
                System.out.print(talSomDouble + " ");
            }
            else if((tal-6)%10==0){  // Om talet slutar på en sexa.
            }
            else {
                System.out.print(tal + " ");
            }
            tal+=2;
        }
    }
}
