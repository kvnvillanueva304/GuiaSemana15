package Semana15;

import javax.swing.JOptionPane;

public class Entrada {
    public static int validarEntero(String texto, int min, int max) {
        int valor = Integer.parseInt(texto.trim());
        if (valor < min || valor > max) {
            throw new IllegalArgumentException("Dispoinle de  " + min + " y " + max);
        }
        return valor;
    }

    public static int leerEntero(String mensaje, int min, int max) {
        while (true) {
            String texto = JOptionPane.showInputDialog(mensaje);
            if (texto == null) {
                throw new IllegalStateException("Transacción cancelada");
            }
            try {
                return validarEntero(texto, min, max);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite solo numeros",
                        "Digito erroneo", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),
                        "No disponible", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}