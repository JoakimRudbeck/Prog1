package kapitel08_Repetitionssatser;

public class DoWhileLoop {

    public static void main(String[] args) {
        doWhileExempel();
    }

    static void doWhileExempel() {
        long start = System.currentTimeMillis(); // Ger antal millisekunder som gått sedan 1 jan 1970.
        do{
            System.out.println("Gör detta så länge det inte gått mer än 10 sek sedan start.");
            System.out.println("Antal millisekunder sedan 1 jan 1970: " + System.currentTimeMillis());
        }
        while(System.currentTimeMillis() - start < 10*1000 );
        System.out.println("Nu har vi kommit ut ur do-while-loopen");
    }








    static void doWhileExempel2() {
        int a = 4;
        while(a == 5){
            System.out.println("HEJ");
        }


        do{
            System.out.println("hej"); // kommer ändå köra en gång
        }
        while(a==5); // är falskt

        System.out.println("Nu har vi kommit ut ur do-while-loopen");
    }

}
