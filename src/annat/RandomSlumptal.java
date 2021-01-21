package Annat;

public class RandomSlumptal {

    public static void main(String[] args) {
        kronaKlaveExempel();
        simuleraTärningkast();
        beräknaSannolikhetFörSexaPåTärning();
    }

    static void kronaKlaveExempel() {
        System.out.println("Kastar pengen upp i luften...");
        String utfall = singlaSlant();
        System.out.println("Det blev " + utfall);
    }

    static String singlaSlant(){
        double slumptal = Math.random(); // ett tal mellan 0.0 och 0.9999999
        if(slumptal < 0.5) {
            return "krona";
        }
	    else{
	        return "klave";
        }
    }

    static void beräknaSannolikhetFörSexaPåTärning() {
        int antalkast = 1000000000;
        int räknare = antalkast;
        int antalSexor = 0;

        long tidStart = System.currentTimeMillis(); // Tid i ms sedan 1 jan 1970.
        while(räknare > 0){
            räknare--;
            int a = 1 + (int)(6*Math.random()); // Beräkna ett tal mellan 1 och 6.
            //System.out.println(a);
            if(a == 6){
                antalSexor++;
            }
        }
        long tidSlut = System.currentTimeMillis();
        long tidFörfluten = tidSlut - tidStart;
        double procent = 100*((double)antalSexor / antalkast);
        System.out.println("Det blev " + antalSexor + " st sexor av totalt " + antalkast);
        System.out.println("Det motsvarar " + procent + "%");
        System.out.println("Matematiska korrekta är 1/6, ca " + 100*(1.0/6));
        System.out.println("Det tog " + tidFörfluten + " ms att simulera " + antalkast + " tärningskast.");
    }

    static void simuleraTärningkast() {
        while(true) {
            int slumptal = 1 + (int)(6 * Math.random()); // Math.random() ger ett värde mellan 0.0 och 0.999..
            System.out.println(slumptal);
        }
    }

}