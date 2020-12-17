package kapitel13_Sortering_och_Sökning;

import java.util.Scanner;

public class UppgifterSorteringOchSökning {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        sorteraTal();
    }

    static void sorteraTal(){
        int antalTal = 11;
        int[] osorteradLista = ElvaTal(antalTal);
        // sortera listan:
        int[] sorteradLista = bubbelSortera(osorteradLista);

        skrivUtVärdenILista(sorteradLista);
    }

    private static void skrivUtVärdenILista(int[] osorteradLista) {
        // Skriv ut varje värde i den sorterade listan.
        for(int i = 0; i < osorteradLista.length; i++){
            System.out.println(osorteradLista[i]);
        }
    }

    private static int[] ElvaTal(int antalTal) {
        int[] osorteradLista = new int[antalTal];
        // Läs in 11 tal i en lista:
        for(int i = 0; i < osorteradLista.length; i++){
            osorteradLista[i] = scan.nextInt();
        }
        return osorteradLista;
    }


    static int[] bubbelSortera(int[] lista){
        for(int i = lista.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){         // Loopar igenom paren i listan.
                if(lista[j] > lista[j+1]){      // Om de vänstra värdet i paret är större än de högra.
                    int temp = lista[j+1];      // Sparar undan de högra (mindre) värdet.
                    lista[j+1] = lista[j];      // Lägger in de vänstra (större) värdet på den högra platsen i paret.
                    lista[j] = temp;            // Lägger in de undansparade högra (mindre) värdet på den vänstra platsen i paret.
                }
            }
        }
        return lista;
    }
}
