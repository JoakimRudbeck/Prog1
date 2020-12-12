package kapitel01_Grunder;
// Om en Javaklass ligger i ett specifikt paket (package) måste det specificeras högst upp i Java-filen.

// Det här är en kommentar. När koden kompileras kommer kommentarer inte tolkas som kod.
// Det här är också en kommentar. Kommentarer är bra för att beskriva med ord vad koden gör.

/*
    Det här är ett annat sätt att skriva en kommentar.
    Den här typen av kommentar kan vara bra om man ska skriva flera rader i sin kommentar.
 */


public class Program {      // Den här raden deklararer en Java-klass med namnet Program. Klasser i Java börjar med stor bokstav.

    public static void main(String[] args) {
        /*
            När en Java-klass ska köras görs alltid först ett anrop till klassens main-metod.
            Det är här i main-metoden som programmet du skriver börjar.
            Från denna main-metod kan anrop göras till andra kodblock, så kallade metoder.
        */

        // Metodanrop till metoden uppgiftABC().
        uppgiftABC();

        // Metodanrop till metoden enAnnanUppgift().
        enAnnanUppgift();
    }   // Den här "måsvingen" avslutar main-metoden.

    // Här kommer en metod med namnet uppgiftABC
    static void uppgiftABC(){ // Metoden börjar.
        System.out.println("Detta är kod inuti metoden uppgiftABC()");
    }   // Metoden avslutas

    // Här är en metod med namnet enAnnanUppgift
    static void enAnnanUppgift(){ // Att skriva variabelnamn eller metodnamn såhär: detHärEttVariabelNamn kallas att skriva i camelCase.
        System.out.println("Detta är kod inuti metoden enAnnanUppgift()");
    }


}   // Den här "måsvingen" avslutar hela Java-klassen
