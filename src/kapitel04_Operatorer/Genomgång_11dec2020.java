package kapitel04_Operatorer;

public class Genomgång_11dec2020 {

    public static void main(String[] args) {

        int a = 5;
        int b = 4;

        int c = a / b; // 5 / 4 = 1.25 --> 1
        // int delat på int blir alltid int

        // modulus, a % b ger resten då a divideras med b
        // exempel 8 % 3, 8 bullar ska delas upp på högar om 3

        // bulle bulle bulle     bulle bulle bulle       bulle bulle  2 bullar kvar

        // 8 % 3 = 2
        // 8 = 2*3 + 2

        // 6 % 2 = 0
        // 6 = 2*3 + 0

        // 13 % 5 = 3
        // 13 = 2*5 + 3

        // 237 % 10 = 7
        // 237 = 23*10 + 7

        int aa = 1337 % 10;  // 7
        int bb = 5 % 3; // 2
        int cc = a * b;
        // provfråga: Vad är värdet av cc ?

        // 1234556434534234459 % 2 = 1  (udda tal ger resten 1, jämna tal ger resten 0)

        int månader = 59;  // 59 = 4*12 + 11
        int år = månader / 12; // 4
        int återståendeMånader = månader % 12;  // 11

        System.out.print(månader + " månader är samma sak som ");
        System.out.println(år + " år och " + återståendeMånader + " månader.");

        // TILLDELANDE ARITMETISKA OPERATORER

        int p = 5;  // p får värdet 5

        // Öka p med 8:
        p = p + 8;  // = är tecknet för tilldelning
        // nu har p värdet 13

        // alternativt sätt att öka med 8:
        p += 8;

        p -= 4;  // p ska minska med 4
        p *= 5;  // p ska multipliceras med 5
        p /= 2;  // p ska divideras med 2
        p %= 5;  // p ska tas modulo 5

        int aaa = 4;  // aaa har värdet 4
        int aaaOriginal = aaa;  // sparar en kopia av aaa.
        aaa += 4;     // aaa har värdet 8  aaa = aaa + 4
        aaa %= 5;     // aaa har värdet 3
        aaa /= 2;     // aaa har värdet 1
        aaa *= 5;     // aaa har värdet 5
        // Vad har aaa för värde nu ?  SVAR: aaa har värdet 5

        // En vanlig tilldelning är att öka/minska en variabel med 1:

        int s = 5;

        // Olika sätt att öka med 1:
        s = s + 1;
        s += 1;
        s -= -1; // p = p - (-1) = p + 1
        s++;  // postfix  (utförs efteråt)
        ++s;  // prefix  (utförs före)

        int t = 3;
        int r = 2 + t++;  // r får värdet 5, t har nu värdet 4
        t = 3;
        int rr = 2 + ++t;  // rr får värdet 6, t har nu värdet 4

        // Prioritering:
        int q = ((4+3) % 4) / 3;  // För parenteser gäller samma som i matematiken



    }


}
