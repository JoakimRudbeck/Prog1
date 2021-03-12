package annat.Filhantering;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sittplatser {

    static Scanner scan = new Scanner(System.in);
    static final String FILNAMN_ATT_LÄSA_FRÅN = "SAMPLE_GRUPP.txt";
    public static void main(String[] args){
        try{
            slumpaPlatser();
        }
        catch(Exception e){
            System.out.println("Oups: " + e.getMessage());
        }
    }

    private static void slumpaPlatser() throws FileNotFoundException, InterruptedException {
        int rader = 4;
        int platserPerRad = 5;
        List<String> namn = new ArrayList<>();
        File file =  new File("src/Annat/Filhantering/" + FILNAMN_ATT_LÄSA_FRÅN);
        Scanner reader = new Scanner(file);
        int längsta = 0;
        while(reader.hasNextLine()){
            String n = reader.nextLine();
            if(n.length()> längsta){
                längsta = n.length();
            }
            namn.add(n);
        }
        //Collections.shuffle(namn);
        System.out.println();
        System.out.println("\tJoakim\t\t\t\t\t\tTavlan\n");
        for(int rad = 1; rad <=rader; rad++){
            //scan.nextLine();
            for(int plats=1; plats <=platserPerRad; plats++){

                String namnet = namn.get(0);
                System.out.print(namnet);
                for(int i = namn.get(0).length(); i<=längsta;i++){
                    System.out.print(" ");
                }
                System.out.print("\t");
                namn.remove(0);
                if(plats==3){
                    System.out.print("\t\t");
                }
                Thread.sleep(1500);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDÖRR");
    }
}