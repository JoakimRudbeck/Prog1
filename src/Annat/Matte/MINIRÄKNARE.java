package Annat.Matte;

import java.util.Scanner;

public class MINIRÄKNARE {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        miniräknareMedIfElse();
        miniräknareMedSwitchCase();
    }

    static void miniräknareMedIfElse() {
        //Läs in strängen "A operator B"
        System.out.println("Skriv in A operator B");
        String indata = scan.nextLine();

        //Ta ut talet A ur strängen
        String[] splittad = indata.split(" "); // {"A", "OPERATOR", "B"}
        int a = Integer.valueOf(splittad[0]);

        //Ta ut talet B ur strängen
        int b = Integer.valueOf(splittad[2]);

        //Ta ut operatorn ur strängen
        String operator = splittad[1];

        //Beräkna värdet av A operator B (baserat på operatorn)

        if(operator.equals("+")){
            System.out.println(a+b);
        }
        else if(operator.equals("-")){
            System.out.println(a-b);
        }
        else if(operator.equals("*")){
            System.out.println(a*b);
        }
        else if(operator.equals("%")){
            System.out.println(a%b);
        }
        else{
            System.out.println("Jag uppfattade inte din operator.");
        }
    }

    static void miniräknareMedSwitchCase() {
        //Läs in strängen "A operator B"
        System.out.println("Skriv in A operator B");
        String indata = scan.nextLine();

        //Sug ut talet A ur strängen
        String[] splittad = indata.split(" "); // {"A", "OPERATOR", "B"}
        int a = Integer.valueOf(splittad[0]);

        //Sug ut talet B ur strängen
        int b = Integer.valueOf(splittad[2]);

        //Sug ut operatorn ur strängen
        String operator = splittad[1];

        //Beräkna värdet av A operator B (baserat på operatorn)

        switch(operator){
            case "+":
                addition(a, b);
                break;
            case "-":
                subtraktion(a, b);
                break;
            case "*":
                multiplikation(a, b);
                break;
            case "%":
                modulo(a, b);
                break;
            default:
                defaultMeddelande();
        }



    }

    private static void defaultMeddelande() {
        System.out.println("Jag uppfattade inte din operator.");
    }

    private static void modulo(int a, int b) {
        System.out.println(a%b);
    }

    private static void multiplikation(int a, int b) {
        System.out.println(a*b);
    }

    private static void subtraktion(int a, int b) {
        System.out.println(a-b);
    }

    private static void addition(int a, int b) {
        System.out.println(a+b);
    }
}