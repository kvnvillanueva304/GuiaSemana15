package Semana15;

import javax.swing.JOptionPane;

public class DiseñoB2 {
    public static void main(String[] args) {
        int r = JOptionPane.showConfirmDialog(null,
                "Desea terminar la operación?", "Salir",
                JOptionPane.YES_NO_CANCEL_OPTION);
        String texto;

        if (r == JOptionPane.YES_OPTION) {
            texto = "Gracias por preferirnos";
        } else if (r == JOptionPane.NO_OPTION) {
            texto = "Continuar operación ";
        } else {
            texto = "Operacion cancelada";
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}
