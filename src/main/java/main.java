import javax.swing.*;
import java.util.GregorianCalendar;

public class main {

    public static void main(String[] args) {
        int jahresZahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib eine Jahreszahl ein: "));

        boolean message = (new GregorianCalendar().isLeapYear(jahresZahl));

        if (message == true) {
            System.out.println("Das Jahr " + jahresZahl + " ist ein Schaltjahr!");
        }
        else {
            System.out.println("Das Jahr " + jahresZahl + " ist kein Schaltjahr!");
        }

    }
}
