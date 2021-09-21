import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "¡Hola! ¡Bienvenido al juego Cash Flow!", "Cash Flow", JOptionPane.PLAIN_MESSAGE);

        // Crear jugador

        Jugador jugador_1 = crear_jugador();

        // mainloop

        System.out.println("");

        boolean preguntar_otra_vez = true;
        int numero_jugada = 1;

        do {
            int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Qué quieres hacer?\n1- Ingresar Dinero\n2- Retirar Dinero\n3- Día de pago\n4- Comprar Activo Financiero\n5- Comprar Pasivo\nIngrese otro número para salir"));
            double monto;
            switch (respuesta){
                case 1:
                    ingresar_dinero(jugador_1);
                    break;
                case 2:
                    retirar_dinero(jugador_1);
                    break;
                case 3:
                    //diadepago dia_de_pago = new diadepago(jugador_1);
                    dia_de_pago(jugador_1);
                    break;
                case 4:
                    comprar_activo(jugador_1);
                    break;
                case 5:
                    comprar_pasivo(jugador_1);
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

    public static void ingresar_dinero(Jugador jugador) {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Cuánto quieres ingresar?"));
        jugador.balance.billetera.ingresardinero(monto);
    }

    public static void retirar_dinero(Jugador jugador) {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto quieres retirar?"));
        jugador.balance.billetera.retirardinero(monto);
    }

    public static void comprar_activo(Jugador jugador) {
        String nombre_activo = JOptionPane.showInputDialog("¿Qué es lo que quiere comprar?");
        double precio_activo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto cuesta?"));
        double ingreso_pasivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto es el ingreso pasivo que genera?"));
        Activo activo = new Activo(nombre_activo, precio_activo, ingreso_pasivo);
        jugador.comprar_activo(activo);
    }

    public static void comprar_pasivo(Jugador jugador) {
        String nombre_pasivo = JOptionPane.showInputDialog("¿Qué es lo que quiere comprar?");
        double precio_pasivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto cuesta?"));
        double gasto_pasivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto es el gasto pasivo que genera?"));
        Pasivo pasivo = new Pasivo(nombre_pasivo, precio_pasivo, gasto_pasivo);
        jugador.comprar_pasivo(pasivo);
    }

    public static void dia_de_pago(Jugador jugador) {
        JOptionPane.showMessageDialog(null, "¡Felicitaciones " + jugador.nombre + "! ¡Ha llegado el día de pago!");
        JOptionPane.showMessageDialog(null, "Salario: " + jugador.balance.salario + "\nIngreso Pasivo: " + jugador.balance.ingresos_pasivos + "\nGastos pasivos: " + jugador.balance.gastos_pasivos + "\nGastos fijos: " + jugador.balance.gastos_fijos + "\nCashflow: " + jugador.balance.cashflow);
        System.out.println("¡Día de pago!");
        System.out.println("Salario: " + jugador.balance.salario);
        System.out.println("Ingresos pasivos: " + jugador.balance.ingresos_pasivos);
        System.out.println("Gastos pasivos: " + jugador.balance.gastos_pasivos);
        System.out.println("Gastos fijos: " + jugador.balance.gastos_fijos);
        System.out.println("Cashflow: " + jugador.balance.cashflow);
        jugador.balance.billetera.ingresardinero(jugador.balance.salario + jugador.balance.ingresos_pasivos);
        jugador.balance.billetera.retirardinero(jugador.balance.gastos_pasivos + jugador.balance.gastos_fijos);
    }

    public static Jugador crear_jugador() {
        String nombre = JOptionPane.showInputDialog("¿Cuál es su nombre?");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años tienes?"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto dinero tienes?"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es tu salario?"));
        Jugador jugador = new Jugador(nombre, edad, saldo, salario);
        return jugador;
    }
}
