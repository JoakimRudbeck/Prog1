package kapitel09_Metoder;

import java.util.Scanner;

public class MerExempelPåMetoder {

    public static void main(String[] args) {
        System.out.println(namnBaklänges("RUDBECK"));
    }

    static double geMigArean(double radie){
        return 3.14*radie*radie;
    }

    static double geMigVolymen(double radie, double höjd){
        return geMigArean(radie)*höjd;
    }

    // "JOAKIM" ska bli "MIKAOJ"
    static String namnBaklänges(String namnet){
        // vänd namnet
        String deomvändanamnet = "";
        for(int i = namnet.length() - 1; i >= 0; i--){
            deomvändanamnet += namnet.charAt(i);
        }
        // skicka tillbaka de vända namnet.
        return deomvändanamnet;
    }

    static void taBortTeckenSetup(){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] t = new char[3];
        t[0] = scan.nextLine().charAt(0);
        t[1] = scan.nextLine().charAt(0);
        t[2] = scan.nextLine().charAt(0);
        String resultat = taBortTeckenFrånSträng(s,t);
        System.out.println(resultat);
    }

    static String taBortTeckenFrånSträng(String s, char[] t){
        String resultat = ""; // Skapar ett tomt resultat från början.
        for(int i = 0; i < s.length(); i++){ // För varje tecken i s
            boolean skaJagLäggaTillTecknet = true;
            for(int j = 0; j < t.length; j++){  // För varje tecken i t.
                if(s.charAt(i) == t[j]){        // Om det är ett tecken som ska bort
                    skaJagLäggaTillTecknet = false;
                    break;
                }
            }
            if(skaJagLäggaTillTecknet){
                resultat += s.charAt(i);
            }
        }
        return resultat;
    }







}