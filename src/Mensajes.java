import javax.swing.*;

public interface Mensajes {

    static void saludar() {
        String mensaje = "¡Hola! ¡Bienvenido al juego Cash Flow!";
        String titulo = "Cash Flow";
        show(mensaje, titulo);
    }

    static void show(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
    }

    static String input_string(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    static int input_int(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    static double input_double(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
    }
}
