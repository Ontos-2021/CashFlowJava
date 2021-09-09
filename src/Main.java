import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "¡Hola! ¡Bienvenido al juego Cash Flow!", "Cash Flow", JOptionPane.PLAIN_MESSAGE);

        // Crear jugador

        String nombre = JOptionPane.showInputDialog("¿Cuál es su nombre?");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años tienes?"));

        double saldo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto dinero tienes?"));

        Jugador jugador_1 = new Jugador(nombre, edad, saldo);

        // mainloop

        System.out.println("");

        boolean pregunar_otra_vez = true;

        do {
            int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Qué quieres hacer?\n1- Ingresar Dinero\n2- Retirar Dinero\nIngrese otro número para salir"));
            if (respuesta == 1) {

                double monto = Double.parseDouble(JOptionPane.showInputDialog("Cuánto quieres ingresar?"));
                jugador_1.billetera.ingresardinero(monto);

            } else if (respuesta == 2) {

                double monto = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto quieres retirar?"));
                jugador_1.billetera.retirardinero(monto);

            } else {
                pregunar_otra_vez = false;
                JOptionPane.showMessageDialog(null, "Parece que ingresó mal un dato\nEl programa se cerrará");
            }

            System.out.println("");

        } while (pregunar_otra_vez);

    }
}
