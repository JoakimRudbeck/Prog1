package kapitel13_Sortering_och_Sökning;

public class SorteringOchSökning {

    public static void main(String[] args) {

    }

    // Metod som söker efter ett värde i en lista
    // returnerar indexet för det sökta värdet
    // returnerar -1 om det sökta värdet inte finns i listan
    static int sekventiellSökning(int[] lista, int sökVärde){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == sökVärde){
                return i;
            }
        }
        return -1;
    }

    static int binärSökning(int[] lista, int sökVärde){
        int min = 0;
        int max = lista.length -1;
        int index = -1;

        while(min <= max && index == -1){
            int mitten = (min+max)/2;
            if(sökVärde > lista[mitten]){
                min = mitten + 1;
            }
            else if(sökVärde > lista[mitten]){
                max = mitten - 1;
            }
            else{
                index = mitten;
            }
        }
        return index;
    }
}
