package kapitel04_Operatorer;

public class InförProvKap1_4ExempelUppgifter {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    static void ex1() {
        int[] minaTal = {2,5,8};
        minaTal[2] %= minaTal[1] - minaTal[0];
        minaTal[0] -= minaTal.length % 2;
        // Hur ser minaTal ut efter denna körning?
    }

    static void ex2() {
        int a = 5;
        int b = 5 % 3;
        int c = ++a * 5 * --b;
        int d = 23 % (c++ * 3 - 2 * a++);
        d += a++;
        // Vad är värdet av variabel e ?
        int e = 20 - d;
    }

    static void ex3() {
        // Hur ser fältet ut efter denna körning?
        int[] fältet = {1,2,3};
        fältet[0] = fältet[2];
        fältet[1] += fältet[0];
    }

    static void ex4() {

        int[] fält = {1,2,3};
        int temp = fält[0];
        fält[0] = fält[2];
        fält[2] = fält[0];
        // Hur ser fält ut nu?
    }

    static void ex5() {
        int a = 8;
        int b = 5 * ++a;
        int c = (66 % b++) % 11;
        // Vad är värdet av c?
    }

    static void ex6() {
        int a = 4;
        int b = 5;          // a = 4, b = 5
        b -= (a/2);         // a = 4, b = 3
        a /= 2;             // a = 2, b = 3
        a += b;             // a = 5, b = 3
        a++;                // a = 6, b = 3
        System.out.println(++a); // skriver ut 7    // a = 7, b = 3
        b--;                // a = 7, b = 2
        a *= ++b;           // a = 21, b = 3
        System.out.println(a); // 21
        System.out.println(b); // 3
        System.out.println((a+b) % 5); // 24 % 5 = 4, skriver ut 4
        // Vad skrivs ut ?
    }
}
