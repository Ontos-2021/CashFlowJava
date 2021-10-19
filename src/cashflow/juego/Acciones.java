package cashflow.juego;
import java.util.ArrayList;

import cashflow.modelo.Activo;
import cashflow.modelo.Jugador;
import cashflow.modelo.Pasivo;

public interface Acciones {

    // Menú

    static boolean menu(Jugador jugador) {
        String mensaje = "¡Es tu turno " + jugador.getNombre() + "!";
        mensaje += "\n¿Qué quieres hacer?";
        mensaje += "\n";
        mensaje += "\n1- Ingresar Dinero";
        mensaje += "\n2- Retirar Dinero";
        mensaje += "\n3- Día de pago";
        mensaje += "\n4- Comprar Activo Financiero";
        mensaje += "\n5- Comprar Pasivo";
        mensaje += "\n";

        mensaje += "\nIngrese otro número para finalizar su turno";

        int respuesta = Mensajes.input_int(mensaje, "Menú");

        switch (respuesta) {
            case 1 -> ingresar_dinero(jugador);
            case 2 -> retirar_dinero(jugador);
            case 3 -> {
                dia_de_pago(jugador);
                return false;
            }
            case 4 -> comprar_activo(jugador);
            case 5 -> comprar_pasivo(jugador);
            default -> {
                return false;
            }
        }
        return false;
    }

    static void ingresar_dinero(Jugador jugador) {
        double monto = Mensajes.input_double("¿Cuánto quieres ingresar?", "Ingresar dinero");
        jugador.billetera.ingresar(monto);
    }

    static void retirar_dinero(Jugador jugador) {
        double monto = Mensajes.input_double("¿Cuánto quieres retirar?", "Retirar dinero");
        jugador.billetera.retirar(monto);
    }

    static void comprar_activo(Jugador jugador) {
        String titulo = "Comprar Activo";
        String nombre_activo = Mensajes.input_string("¿Cuál es el activo que quiere comprar?", titulo);
        double precio_activo = Mensajes.input_double("¿Cuánto cuesta?", titulo);
        double ingreso_pasivo = Mensajes.input_double("Cuánto es el ingreso pasivo que genera?", titulo);

        Activo activo = new Activo(nombre_activo, precio_activo, ingreso_pasivo);
        jugador.comprar_activo(activo);
    }

    static void comprar_pasivo(Jugador jugador) {
        String titulo = "Comprar Pasivo";
        String nombre_pasivo = Mensajes.input_string("¿Cuál es el pasivo que quiere comprar?", titulo);
        double precio_pasivo = Mensajes.input_double("¿Cuánto cuésta?", titulo);
        double gasto_pasivo = Mensajes.input_double("¿Cuánto es el gasto pasivo que genera?", titulo);

        Pasivo pasivo = new Pasivo(nombre_pasivo, precio_pasivo, gasto_pasivo);

        jugador.comprar_pasivo(pasivo);
    }

    static void dia_de_pago(Jugador jugador) {
        String mensaje = "¡Felicitaciones " + jugador.getNombre() + "! ¡Ha llegado el día de pago!";
        String titulo = "¡Día de Pago!";
        Mensajes.show(mensaje, titulo);

        mensaje = "Salario: " + jugador.balance.getSalario();
        mensaje += "\nIngreso Pasivo: " + jugador.balance.getIngresosPasivos();
        mensaje += "\nGastos pasivos: " + jugador.balance.getGastosPasivos();
        mensaje += "\nGastos fijos: " + jugador.balance.getGastosFijos();
        mensaje += "\nCashflow: " + jugador.balance.getCashflow();
        titulo = "Balance mensual: " + jugador.getNombre();
        Mensajes.show(mensaje, titulo);

        System.out.println("¡Día de pago!");
        System.out.println("Salario: " + jugador.balance.getSalario());
        System.out.println("Ingresos pasivos: " + jugador.balance.getIngresosPasivos());
        System.out.println("Gastos pasivos: " + jugador.balance.getGastosPasivos());
        System.out.println("Gastos fijos: " + jugador.balance.getGastosFijos());
        System.out.println("Cashflow: " + jugador.balance.getCashflow());

        // Ingresar Dinero
        jugador.billetera.ingresar(jugador.balance.getSalario() + jugador.balance.getIngresosPasivos());
        // Retirar Dinero
        jugador.billetera.retirar(jugador.balance.getGastosPasivos() + jugador.balance.getGastosFijos());
    }

    // Crear Jugador

    static Jugador crear_jugador(int i) {
        String titulo = "Creando jugador " + i;
        String nombre = Mensajes.input_string("¿Cuál es su nombre?", titulo);
        int edad = Mensajes.input_int("¿Cuántos años tienes", titulo);
        double salario = Mensajes.input_double("¿Cuál es tu salario?", titulo);
        double saldo = Mensajes.input_double("¿Cuanto dinero tienes en tu billetera?", titulo);

        return new Jugador(nombre, edad, saldo, salario);
    }

    // Crear jugadores

    static ArrayList<Jugador> crearJugadores() {

        int cantidad_jugadores = Mensajes.input_int("¡Ingrese el número de jugadores!", "Creando jugadores");

        ArrayList<Jugador> jugadores = new ArrayList<>();

        for (int i = 0; i < cantidad_jugadores; i++) {
            jugadores.add(Acciones.crear_jugador(i+1));
        }
        return jugadores;
    }

    // Turno

    static void turno(Jugador jugador){
        Boolean preguntarOtraVez;
        do {
            preguntarOtraVez = Acciones.menu(jugador);
        } while (preguntarOtraVez);
        System.out.println("");
    }
}
