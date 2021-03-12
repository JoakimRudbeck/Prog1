package annat.Matte;

public class TaletE {

    public static void main(String[] args) {

        // f(x) = a^x
        // f'(x) = lim h -> 0 (a^(x+h) - a^x) / h = lim h -> 0 a^x * (a^h - 1) / h

        // Vi vill hitta ett värde på basen a så att uttrycket (a^h - 1) / h blir så nära 1 som möjligt.

        // Börjar med att testa a = 2
        double a = 2;

        // Sätter h till ett litet värde
        double h = 0.000001;

        // Beräknar värdet av (a^h - 1) / h
        double värdet = (Math.pow(a,h) - 1) / h;

        // Så länge värdet inte är tillräckligt nära 1
        while(värdet < 0.9999 || 1.0001 < värdet){
            // Öka värdet på a
            a = a + 0.0001;

            // Beräkna nytt värde med det nya värdet på a.
            värdet = (Math.pow(a,h) - 1) / h;
        }

        System.out.println("En approximation av talet e är " + a);
    }
}