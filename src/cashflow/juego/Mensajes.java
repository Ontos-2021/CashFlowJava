package cashflow.juego;
import javax.swing.*;

public interface Mensajes {

    static void saludar() {
        String mensaje = "¡Hola! ¡Bienvenido al juego Cash Flow!";
        String titulo = "Cash Flow";
        show(mensaje, titulo);
    }

    static void finalizar() {
        String mensaje = "¡Gracias por participar!\nEl programa se cerrará";
        String titulo = "¡El juego ha finalizado!";
        show(mensaje, titulo);
    }

    static void show(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
    }

    static String input_string(String mensaje, String titulo) {
        return JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
    }

    static int input_int(String mensaje, String titulo) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE));
    }

    static double input_double(String mensaje, String titulo) {
        return Double.parseDouble(JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE));
    }
    static boolean inputFinalizar(String mensaje, String titulo) {
        String respuesta = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
        if (respuesta.equalsIgnoreCase("Sí") || respuesta.equalsIgnoreCase("Si")) {
            return true;
        } else if (respuesta.equalsIgnoreCase("No")) {
            return false;
        } else {
            Mensajes.show("Ha ingresado una respuesta inválida. El juego no se finalizará", "Error");
            return false;
        }
    }
}
