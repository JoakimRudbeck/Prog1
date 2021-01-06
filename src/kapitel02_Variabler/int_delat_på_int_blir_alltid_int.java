package kapitel02_Variabler;

public class int_delat_på_int_blir_alltid_int {

    public static void main(String[] args) {

        // Nu ska jag visa lite märkliga beteenden hos heltal inom programmering.

        // Vad blir 7 / 4 matematiskt? Svar: 1.75

        // Vad blir 7 / 4 programmeringsmässigt?

        //System.out.println(7/4); // Detta är 1 och det beror på att både 7 och 4 är int så då kommer även svaret kvoten vara en int

        // int / int blir int
        // double / int blir double
        // int / double blir double
        // double / double blir double

        // dvs så länge double finns med i täljare eller nämnare så blir kvoten en double
        // men om BÅDE täljare och nämnare är int blir svaret int och decimalerna går förlorade.

        // hur lösa detta då?

        System.out.println(7.0 / 4); // 7.0 är double så detta löser det.
        System.out.println(7 / 4.0);
        System.out.println((double)7 / 4);
        System.out.println(7 / (double)4); // Alla dessa sätt löser :)

        System.out.println((double)(7/4)); // Detta löser dock inte eftersom (7/4) kommer beräknas först och det blir ju 1
        // sedan görs det om till double vilket är 1.0 kolla själva :)

        double a = (double)(7/4); // På samma sätt kommer a nu ha värdet 1.0
        System.out.println(a);


    }

}
