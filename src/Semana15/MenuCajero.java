package Semana15;

import javax.swing.JOptionPane;

public class MenuCajero {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Kevin", 100);
        String[] ops = { "Deposito", "Retiro", "Saldo disponible", "Salir" };
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null,
                    "Cuál es su consulta", "Cajero", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, ops, ops[0]);
            try {
                if (opcion == 0 || opcion == 1) {
                    String txt = JOptionPane.showInputDialog("Cantidad:");
                    if (txt == null) {
                        continue;
                    }
                    int monto = Integer.parseInt(txt.trim());
                    if (monto <= 0) {
                        throw new IllegalArgumentException("La cantidad debe de ser mayor a 4.00");
                    }
                    if (opcion == 0) {
                        cuenta.depositar(monto);
                    } else {
                        cuenta.retirar(monto);
                    }
                    JOptionPane.showMessageDialog(null,
                            "Aplicado. Saldo: $" + cuenta.getSaldo());
                } else if (opcion == 2) {
                    JOptionPane.showMessageDialog(null,
                            "Saldo: $" + cuenta.getSaldo());
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite cantidad en número: ",
                        "Digito invalido", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException | IllegalStateException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),
                        "Operacion rechazada", JOptionPane.WARNING_MESSAGE);
            }
        } while (opcion != 3 && opcion != JOptionPane.CLOSED_OPTION);
    }
}
