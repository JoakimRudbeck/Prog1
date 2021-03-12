package annat.Filhantering;

import java.io.*;
import java.util.Scanner;

public class LäsningOchSkrivning {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        läsningFrånFil();
        skrivTilFil();
    }

    static void skrivTilFil() throws IOException {
        String filnamn = "writeFile.txt";
        String path = "src/Annat/" + filnamn;
        FileWriter myWriter = new FileWriter(path);
        System.out.println("Vad vill du skriva till filen?");
        String dataTillFil = scanner.nextLine();
        myWriter.write(dataTillFil);
        myWriter.close();
        System.out.println("Skrev " + dataTillFil + " till filen " + path);
    }

    static void läsningFrånFil() throws IOException {
        String filnamn = "readFile.txt";
        String path = "src/Annat/" + filnamn;
        BufferedReader reader = new BufferedReader(new FileReader(path));
        System.out.println("Innehållet i filen " + path + ":");
        while(true){
            String rad = reader.readLine();
            if(rad == null){
                break;
            }
            System.out.println(rad);
        }
        System.out.println();
        reader.close();
    }

}

