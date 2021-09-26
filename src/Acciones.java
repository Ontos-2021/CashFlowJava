import javax.swing.*;

public interface Acciones {

    static void ingresar_dinero(Jugador jugador) {
        double monto = Mensajes.input_double("¿Cuánto quieres ingresar?");
        jugador.balance.billetera.ingresardinero(monto);
    }

    static void retirar_dinero(Jugador jugador) {
        double monto = Mensajes.input_double("¿Cuánto quieres retirar?");
        jugador.balance.billetera.retirardinero(monto);
    }

    static void comprar_activo(Jugador jugador) {
        String nombre_activo = Mensajes.input_string("¿Cuál es el activo que quiere comprar?");
        double precio_activo = Mensajes.input_double("¿Cuánto cuesta?");
        double ingreso_pasivo = Mensajes.input_double("Cuánto es el ingreso pasivo que genera?");

        Activo activo = new Activo(nombre_activo, precio_activo, ingreso_pasivo);
        jugador.comprar_activo(activo);

    }

    static void comprar_pasivo(Jugador jugador) {
        String nombre_pasivo = Mensajes.input_string("¿Cuál es el pasivo que quiere comprar?");
        double precio_pasivo = Mensajes.input_double("¿Cuánto cuésta?");
        double gasto_pasivo = Mensajes.input_double("¿Cuánto es el gasto pasivo que genera?");

        Pasivo pasivo = new Pasivo(nombre_pasivo, precio_pasivo, gasto_pasivo);

        jugador.comprar_pasivo(pasivo);
    }

    static void dia_de_pago(Jugador jugador) {
        String mensaje = "¡Felicitaciones " + jugador.nombre + "! ¡Ha llegado el día de pago!";
        Mensajes.show(mensaje, "Día de Pago");

        mensaje = "Salario: " + jugador.balance.salario;
        mensaje += "\nIngreso Pasivo: " + jugador.balance.ingresos_pasivos;
        mensaje += "\nGastos pasivos: " + jugador.balance.gastos_pasivos;
        mensaje += "\nGastos fijos: " + jugador.balance.gastos_fijos;
        mensaje += "\nCashflow: " + jugador.balance.cashflow;
        Mensajes.show(mensaje, "Balance mensual");

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
        String nombre = Mensajes.input_string("¿Cuál es su nombre?");
        int edad = Mensajes.input_int("¿Cuántos años tienes");
        double salario = Mensajes.input_double("¿Cuál es tu salario?");
        double saldo = Mensajes.input_double("¿Cuanto dinero tienes en tu billetera?");

        Jugador jugador = new Jugador(nombre, edad, saldo, salario);

        return jugador;
    }
}
