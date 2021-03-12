package annat;

public class Asynkront {

    public static void main(String[] args) {

        // Skapar en tråd
        Thread godMorgon = new Thread(() -> godMorgon());

        // Skapar en annan tråd
        Thread godKväll = new Thread(() -> godKväll());

        // Startat tråden godMorgon
        godMorgon.start();

        // Startar tråden godKväll
        godKväll.start();

        // Vad hände?
        // Utfördes koden i den ordning vi hade trott?

    }

    private static void godMorgon() {
        for(int i = 0; i < 10000000; i++){
            int blaj = i % 10000;
        }
        System.out.println("GOD MORGON");
    }

    private static void godKväll() {
        System.out.println("GOD KVÄLL");
    }

}
