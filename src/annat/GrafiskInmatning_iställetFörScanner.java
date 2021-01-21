package Annat;

import javax.swing.*;

public class GrafiskInmatning_iställetFörScanner {

    public static void main(String[] args) {
        inmatningPopUpRutaExempel();
    }

    private static void inmatningPopUpRutaExempel() {
        // Popupruta där användaren kan skriva in något som en sträng
        String namn = JOptionPane.showInputDialog(null, "Namn?");
        // Popupruta som skriver ut något
        JOptionPane.showMessageDialog(null,"Du heter " + namn);
        // Popupruta som har knapparna ja (0), nej (1), cancel (2)
        int val = JOptionPane.showConfirmDialog(null, "Avsluta?");

        switch(val){
            // ja
            case 0:
                System.exit(0);
                break;
            // nej
            case 1:
                inmatningPopUpRutaExempel();
                break;
                // cancel
            case 2:
                break;
        }
    }

}
