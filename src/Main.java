import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "¡Hola! ¡Bienvenido al juego Cash Flow!", "Cash Flow", JOptionPane.PLAIN_MESSAGE);

        // Crear jugador

        String nombre = JOptionPane.showInputDialog("¿Cuál es su nombre?");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años tienes?"));

        double saldo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto dinero tienes?"));

        double salario = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es tu salario?"));

        Jugador jugador_1 = new Jugador(nombre, edad, saldo, salario);

        // mainloop

        System.out.println("");

        boolean preguntar_otra_vez = true;
        int numero_jugada = 1;

        do {
            int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Qué quieres hacer?\n1- Ingresar Dinero\n2- Retirar Dinero\n3- Día de pago\n4- Comprar Activo Financiero\n5- Comprar Pasivo\nIngrese otro número para salir"));
            double monto;
            switch (respuesta){
                case 1:
                    monto = Double.parseDouble(JOptionPane.showInputDialog("Cuánto quieres ingresar?"));
                    jugador_1.balance.billetera.ingresardinero(monto);
                    break;
                case 2:
                    monto = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto quieres retirar?"));
                    jugador_1.balance.billetera.retirardinero(monto);
                    break;
                case 3:
                    diadepago dia_de_pago = new diadepago(jugador_1);
                    break;
                case 4:
                    String nombre_activo = JOptionPane.showInputDialog("¿Qué es lo que quiere comprar?");
                    double precio_activo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto cuesta?"));
                    double ingreso_pasivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto es el ingreso pasivo que genera?"));
                    Activo activo = new Activo(nombre_activo, precio_activo, ingreso_pasivo);
                    jugador_1.comprar_activo(activo);
                    break;
                case 5:
                    String nombre_pasivo = JOptionPane.showInputDialog("¿Qué es lo que quiere comprar?");
                    double precio_pasivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto cuesta?"));
                    double gasto_pasivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto es el gasto pasivo que genera?"));
                    Pasivo pasivo = new Pasivo(nombre_pasivo, precio_pasivo, gasto_pasivo);
                    jugador_1.comprar_pasivo(pasivo);
                    break;

                default:
                    preguntar_otra_vez = false;
                    JOptionPane.showMessageDialog(null, "Ha finalizado el juego. ¡Gracias por participar!\nEl programa se cerrará");
                    break;
            }

            numero_jugada ++;
            System.out.println("Jugada número: " + numero_jugada);
            System.out.println("");

        } while (preguntar_otra_vez);
    }
}
