package kapitel07_Villkorssatser;

import java.util.Scanner;

import static kapitel07_Villkorssatser.Övningar.scan;

public class Miniräknare {

    public static void main(String[] args) {
        miniRäknare();
    }

    static void miniRäknare() {
    /*
        Skriv en miniräknare som klarar av
        att beräkna "a # b" där a och b är heltal
        och # är någon av operatorerna + - * /

        OBS: Användaren matar in "a # b".

        T.ex
        "3 + 7" --> 10
        "3 * 7" --> 21

        Tips:
        "a # b".split(" "); kommer ge en lista med
                ["a", "#", "b"]
    */

        // En ansats till lösning:
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.valueOf(parts[0]);
        int b = Integer.valueOf(parts[2]);
        String operator = parts[1];
        double svar = 0;
        if(operator.equals("+")){
            svar = a+b;
        }
        else if( operator.equals("-")){
            svar = a-b;
        }
        else if(operator.equals("*")){
            svar = a*b;
        }
        else if(operator.equals("/")){
            svar = (double) a / b;
        }
        System.out.printf("%s blir %.2f\n", input, svar);
    }
}
