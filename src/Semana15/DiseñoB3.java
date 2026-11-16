package Semana15;

import javax.swing.JOptionPane;

public class DiseñoB3 {
    public static void main(String[] args) {
        String[] ops = { "Consulta de saldo disponible", "Deposito", "Salir" };
        int i = JOptionPane.showOptionDialog(null, "Seleccione una operacion",
                "Menu principal", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, ops, ops[0]);

        if (i == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Cerrar");
        } else {
            JOptionPane.showMessageDialog(null, "Opcion: " + ops[i]);
        }
    }
}