package annat;

public class Tidavläsning {

    public static void main(String[] args) {
        tidAvläsning();
    }

    private static void tidAvläsning() {
    /*
        För att beräkna hur lång tid det tar för datorn att utföra en viss kodsnutt
        kan man i pseudokod göra såhär:

        Spara tiden som förflutit sedan 1 jan 1970 i en variabel av typen long, kalla den startTid t.ex.
        Exekvera den kod som du vill beräkna tiden för.
        Spara tiden som förflutit sedan 1 jan 1970 i en variabel av typen long, kalla den slutTid t.ex.
        Beräkna skillanden mellan slutTid och startTid.
     */

        // Kodexempel:
        long startTid = System.currentTimeMillis(); // motsvarar tiden i millisekunder sedan 1 jan 1970.

        long summan = 0;

        // Beräknar 1+2+3+4+5+...+1000000000 (en miljard)
        for(int i = 1; i <= 1000000000; i++){
            summan += i;
        }
        long slutTid = System.currentTimeMillis();
        long totalTidMilliSekunder = slutTid - startTid;
        double totalTidSekund = totalTidMilliSekunder / 1000.0;
        System.out.println("1+2+3+4+5+...+1000000000 är " + summan);
        System.out.println("Det tog " + totalTidSekund + " sekunder att beräkna detta.");
    }
}