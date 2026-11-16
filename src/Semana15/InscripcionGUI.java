package Semana15;

import javax.swing.JOptionPane;

public class InscripcionGUI {
    public static void main(String[] args) {
        try {
            int edad = Entrada.leerEntero("Edad del usuario (18 a 55):", 18,55);
            int meses = Entrada.leerEntero("Plazo de membresia (12 a 18):", 12, 18);

            int r = JOptionPane.showConfirmDialog(null,
                    "<html>Desea continuar con la inscripcion?<br>Edad: " + edad
                            + "<br>Meses: " + meses + "<br>Total: $" + (meses * 25)
                            + "</html>", "Curso de Informatica", JOptionPane.YES_NO_OPTION);

            if (r == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Inscripcion registrada");
            }
        } catch (IllegalStateException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
