package Annat;

public class X_MAS
{

    static int wait1 = 700;
    static int wait2 = 90;
    static int wait3 = 100;
    public static void main(String[] args) throws InterruptedException {
        laugh();
        Thread.sleep(wait1);
        speak();
        Thread.sleep(wait1);
        make();
    }

    static void laugh() throws InterruptedException {
        for(int i = 0; i < 10; i++){
            System.out.println();
        }
        for(int i=0; i<=2; i++)
        {
            System.out.print("Ho! ");
            Thread.sleep(X_MAS.wait3);
        }
    }

    static void speak() throws InterruptedException {

        String hälsning = "\nGOD JUL OCH GOTT NYTT ÅR\nÖNSKAR PROGRAMMERINGSLÄRARNA PÅ RUDBECK!!!";
        for(char c : hälsning.toCharArray()){
            System.out.print("" + c);
            Thread.sleep(X_MAS.wait3);

        }
    }

    static void make() throws InterruptedException {
        for(int i=0; i<9; i++)
        {
            Thread.sleep(X_MAS.wait1);

            System.out.println();
            /* Each level(from base to top)is one space further in so that we get a tree looking structure */
            for(int j=9; j>=i; j--)
            {
                System.out.print(" ");
            }

            for(int k=0; k<=i; k++)
            {
                System.out.print("* ");
                if(k == i){
                    continue;
                }
                Thread.sleep(X_MAS.wait2);
            }
        }
        //Thread.sleep(X_MAS.wait2);
        System.out.println("\n         ||");
        Thread.sleep(X_MAS.wait2);
        System.out.print("         ||");
        Thread.sleep(5000);
        String hälsning = "Glöm inte bort att plugga lite på lovet också ;)";
        for(char c : hälsning.toCharArray()){
            //System.out.print("" + c);
            Thread.sleep(X_MAS.wait3);

        }
        Thread.sleep(700000);
    }

}