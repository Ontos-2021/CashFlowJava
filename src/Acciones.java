import javax.swing.*;

public interface Acciones {

    static void ingresar_dinero(Jugador jugador) {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Cuánto quieres ingresar?"));
        jugador.balance.billetera.ingresardinero(monto);
    }

    static void retirar_dinero(Jugador jugador) {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto quieres retirar?"));
        jugador.balance.billetera.retirardinero(monto);
    }

    static void comprar_activo(Jugador jugador) {
        String nombre_activo = JOptionPane.showInputDialog("¿Qué es lo que quiere comprar?");
        double precio_activo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto cuesta?"));
        double ingreso_pasivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto es el ingreso pasivo que genera?"));
        Activo activo = new Activo(nombre_activo, precio_activo, ingreso_pasivo);
        jugador.comprar_activo(activo);
    }

    static void comprar_pasivo(Jugador jugador) {
        String nombre_pasivo = JOptionPane.showInputDialog("¿Qué es lo que quiere comprar?");
        double precio_pasivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto cuesta?"));
        double gasto_pasivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto es el gasto pasivo que genera?"));
        Pasivo pasivo = new Pasivo(nombre_pasivo, precio_pasivo, gasto_pasivo);
        jugador.comprar_pasivo(pasivo);
    }

    static void dia_de_pago(Jugador jugador) {
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

    static Jugador crear_jugador() {
        String nombre = JOptionPane.showInputDialog("¿Cuál es su nombre?");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años tienes?"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto dinero tienes?"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es tu salario?"));
        Jugador jugador = new Jugador(nombre, edad, saldo, salario);
        return jugador;
    }
}
