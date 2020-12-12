package kapitel02_Variabler;

class ByteKlass {

    public static void main(String[] args) {
        byte störstaByte = Byte.MAX_VALUE;
        byte nästStörsta = (byte) (störstaByte - 1);
        byte ännuStörre = (byte) (störstaByte + 1);
        System.out.println(nästStörsta);
        System.out.println(störstaByte);
        System.out.println(ännuStörre);
        // Fundera på varför vi får den utskrift vi får.
    }
}
