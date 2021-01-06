package kapitel09_Metoder;

public class MatematiskaFunktionerExempel {

    public static void main(String[] args) {

        // För varje funktion av de tre på tavlan:
        for(int i = 1; i<=3; i++){
            switch(i) {
                case 1:
                    printVärdetabell1();
                    break;
                case 2:
                    printVärdetabell2();
                    break;
                case 3:
                    printVärdetabell3();
                    break;
            }
        }

    }

    private static int yValueFromFunction1(int x) {
        int y = 2*x+4;
        return y;
    }

    static void printVärdetabell1(){
        System.out.println("y = 2*x+4");
        for(int x = 1; x <= 5; x++){
            int y = yValueFromFunction1(x);
            System.out.printf("(%d;%d)\n", x, y);
        }
    }

    static void printVärdetabell2() {
        System.out.println("y = 2*x*x+3*x-8");
        for (int x = 1; x <= 5; x++) {
            int y = 2 * x * x + 3 * x - 8;
            System.out.printf("(%d;%d)\n", x, y);
        }
    }

    static void printVärdetabell3(){
        System.out.println("y = (4*x*x*x+8*x*x+18)/(17*x)");
        for(int x = 1; x <= 5; x++){
            int y = yValueFromFunction1(x);
            System.out.printf("(%d;%d)\n", x, y);
        }
    }
}
