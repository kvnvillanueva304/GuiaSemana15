package Semana15;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;

public class DiseñoB4 {
    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", new Font("SansSerif", Font.PLAIN, 18));

        String[] plazos = { "6 meses", "12 meses", "24 meses", "36 meses" };
        Object p = JOptionPane.showInputDialog(null, "Plazo del credito:",
                "Credito", JOptionPane.QUESTION_MESSAGE, null, plazos, plazos[1]);

        if (p == null) {
            JOptionPane.showMessageDialog(null, "Sin seleccion");
        } else {
            JOptionPane.showMessageDialog(null, "Plazo Aceptado: " + p);
        }
    }

}
