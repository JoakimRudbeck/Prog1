package Annat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Felhantering {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        felhanteringExempel();
        divideByZeroExample();
        arrayExempel();
    }

    private static void divideByZeroExample() {
        try{
            System.out.printf("Täljare?");
            int täljare = Integer.valueOf(scan.nextLine());
            System.out.printf("Nämnare?");
            int nämnare = Integer.valueOf(scan.nextLine());
            int kvot = täljare / nämnare;
            System.out.println(kvot);
        }
        catch(ArithmeticException error){
            System.err.println("Division med noll inte tillåtet.");
        }
    }


    private static void felhanteringExempel() {
        try{
            scan = new Scanner(System.in);
            System.out.println("Namn: ");
            String namn = scan.nextLine();
            System.out.println("Ålder: ");
            int ålder = Integer.valueOf(scan.nextLine());
            System.out.println("Du heter " + namn + " och är " + ålder + " år gammal.");
        }
        catch(NumberFormatException error){
            System.out.println("Det har blivit fel med siffrorna, skriv ett tal tack.");
        }
    }

    private static void arrayExempel() {
        boolean keepOnTrying = true;
        while(keepOnTrying) {
            try {
                System.out.println("Antal tal: ");
                int antalTal = scan.nextInt();
                int[] tal = new int[antalTal];
                for (int i = 0; i < tal.length; i++) {
                    System.out.println("Tal på plats " + i + ":");
                    tal[i] = scan.nextInt();
                }

                System.out.println("Vilket index vill du skriva ut?");
                int index = scan.nextInt();
                System.out.println(tal[index]);
                keepOnTrying = false;

            } catch (InputMismatchException error) {
                System.out.println("Skriv ett heltal, tack.");
            } catch (NegativeArraySizeException error) {
                System.out.println("Skriv ett positivt heltal, tack.");
            } catch (NumberFormatException error) {
                System.out.println("Skriv endast tal, tack.");
            } catch (ArrayIndexOutOfBoundsException error) {
                System.out.println("Index måste vara existerande.");
            }
        }
    }
}
