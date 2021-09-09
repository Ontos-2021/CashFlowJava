import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "¡Hola! ¡Bienvenido al juego Cash Flow!", "Cash Flow", JOptionPane.PLAIN_MESSAGE);

        String nombre = JOptionPane.showInputDialog("¿Cuál es su nombre?");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años tienes?"));

        double saldo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto dinero tienes?"));

        Jugador jugador_1 = new Jugador(nombre, edad, saldo);
    }
}
