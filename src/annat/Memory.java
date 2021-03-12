package annat;

import java.util.Random;

public class Memory {
    private static final int MEMORY_SIZE_IN_BYTES = 4000;
    private static final int START_ADRESS = 0;
    private static final int BYTE_LENGTH = 8;
    private static final int WORD_LENGTH = 4;
    private static final double PROBABILITY_ONE = 0.5;

    public static void main(String[] args) {
        printMemory();
    }

    // En metod som visuellt skriver ut ungefär hur datorns minne är uppbyggt.
    static void printMemory() {
        Random r = new Random();
        int adress = START_ADRESS;

        for(int i = 0; i < MEMORY_SIZE_IN_BYTES / WORD_LENGTH; i++){
            String s = "" + Integer.toHexString(adress) + ": ";
             adress += WORD_LENGTH;
            for (int j = 0; j <BYTE_LENGTH*WORD_LENGTH; j++){
                if(j%BYTE_LENGTH==0)
                    s+=" ";
                s += r.nextDouble() < PROBABILITY_ONE ? "1" : "0";
            }
            System.out.println(s);
        }
    }
}
