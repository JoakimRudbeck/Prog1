package Annat;

public class ProgramMedSleep {

    public static void main(String[] args) throws InterruptedException {
        // Man kan instruera datorn att den ska vila genom att beordra den tråd som körs att vila en stund såhär:
        // Notera att "throws InterruptedException" måste läggas till i slutet av mainmetodens huvud om Thread.sleep(_) ska användas.

        System.out.println("HEJ");
        Thread.sleep(1000);     // tråden vilar i 1000 ms, d.v.s. 1 sekund.
        System.out.println("Hej igen efter 1 sekunds vila.");
        Thread.sleep(3000);     // tråden vilar i 3000 ms, d.v.s. 3 sekunder.
        System.out.println("Hej igen efter ytterligare 3 sekunders vila.");
    }
}