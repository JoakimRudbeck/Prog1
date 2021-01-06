package kapitel04_Operatorer;
import java.util.Scanner;

public class Uppgifter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        uppgift4_2();
        uppgift4_4();
        uppgift4_5();
        uppgift4_6();
        uppgift4_7();
        utmaning();
        printFExempel();
    }

    static void printFExempel() {
        float a = 3.1415927f;
        int b = 5;
        int c = 7;
        // "vanliga sättet":
        System.out.println("a är "+a+" och b är "+b+" och c är "+c+".");
        // Samma sak men med print format:
        System.out.printf("a är %.2f och b är %d och c är %d.", a,b,c);
    }

    static void uppgift4_2() {
        System.out.println("Uppgift 4.2");
        System.out.println("Skriv in ett heltal");
        int tal = Integer.valueOf(scanner.nextLine());
        int ursprungliga = tal;
        tal++;
        tal*=2;
        tal-=6;
        tal/=2;
        tal+=3;
        tal-= ursprungliga;
        System.out.println(tal);
        if(tal == 1){ // Överkurs men vi kommer gå igenom if-satser senare...
            System.out.println("Det stämde att det blev ett till slut :)");
        }
    }

    static void uppgift4_4() {
        System.out.println("Skriv in ett fyrsiffrigt tal, tack.");
        int mittTal = Integer.valueOf(scanner.nextLine());
        int mittTalJusterat = mittTal + 500;
        // lägger på 500 för att avrundningen ska bli rätt.
        int mittTalDelatPåTusen = (mittTalJusterat / 1000);
        // kom ihåg, int dividerat med int blir int, decimalerna försvinner.
        int mittTalAvrundat = mittTalDelatPåTusen * 1000; // Lägger på tre nollor
        System.out.printf("Talet %d avrundat blir %d\n", mittTal, mittTalAvrundat);
    }

    static void uppgift4_5() {
        System.out.println("Uppgift 4.5");
        System.out.println("Mata in ett bråktal på formen A/B");
        String indataSträng = scanner.nextLine(); // t.e.x. "13/5"
        String[] täljareOchNämnareSomSträngar = indataSträng.split("/");
        // split fungerar såhär: Strängen delas upp där det finns ett "/" och en array skapas.
        // motsvarar arrayen {"132, "5"}
        int täljare = Integer.valueOf(täljareOchNämnareSomSträngar[0]);
        int nämnare = Integer.valueOf(täljareOchNämnareSomSträngar[1]);
        int hela = täljare / nämnare;
        int rest = täljare % nämnare;
        String svarIBlandadForm = hela + " " + rest + "/" + nämnare;
        System.out.println("Talet " + täljare + "/" + nämnare + " blir i blandad form: " + svarIBlandadForm);
    }

    static void uppgift4_6() {
        System.out.println("Uppgift 4.6");
        System.out.println("Ange antal timmar:");
        int timmar = scanner.nextInt();
        System.out.println("Ange antal minuter:");
        int minuter = scanner.nextInt();
        System.out.println("Ange antal sekunder:");
        int sekunder = scanner.nextInt();
        System.out.println("Tidsomvandling ger:");
        double totTimmar = timmar + ((minuter*60 + sekunder)/3600.0);
        double totMinuter = 60*timmar + minuter + sekunder/60.0;
        int totSekunder = 60*60*timmar + 60*minuter + sekunder;
        System.out.printf("%.3f h = %.1f min = %d s\n", totTimmar, totMinuter, totSekunder);
    }

    static void uppgift4_7() {
        System.out.println("Uppgift 4.7");
        System.out.println("Ange tid i hela sekunder, tack:");
        int tidISek = scanner.nextInt();
        int tidISekOriginal = tidISek; // kopierar startvärdet för att ha till senare.
        int timmar = tidISek / 3600;
        tidISek-=timmar * 3600;
        int minuter = tidISek / 60;
        tidISek-=minuter * 60;
        int sekunder = tidISek;
        System.out.printf("%d sekunder = %d timmar, %d minuter, %d sekunder", tidISekOriginal, timmar, minuter, sekunder);
    }

    static void utmaning() {
        char[] bokstäver = {'A', 'B', 'C'};
        String[] strängar = {"ABCDEF", "GHIJKL", "MNOPQRSTUVWXYZ"};

        int a = (bokstäver[1] + bokstäver[2]) % strängar.length;
        //tips: "joakim".substring(1,4) ger "oak"
        int b = strängar[2].substring(1, 5).length() - 2;
        // Är a större än eller lika med b ?
        boolean santEllerFalskt = a >= b;

        // Vad skrivs ut och varför?
        System.out.println(santEllerFalskt);
    }

}