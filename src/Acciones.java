public interface Acciones {

    // Menú

    static boolean menu(Jugador jugador, boolean preguntar_otra_vez) {
        String mensaje = "¿Qué quieres hacer?";

        mensaje += "\n";
        mensaje += "\n1- Ingresar Dinero";
        mensaje += "\n2- Retirar Dinero";
        mensaje += "\n3- Día de pago";
        mensaje += "\n4- Comprar Activo Financiero";
        mensaje += "\n5- Comprar Pasivo";
        mensaje += "\n";

        mensaje += "\nIngrese otro número para finalizar el juego";

        int respuesta = Mensajes.input_int(mensaje, "Menú");

        switch (respuesta) {
            case 1 -> ingresar_dinero(jugador);
            case 2 -> retirar_dinero(jugador);
            case 3 -> dia_de_pago(jugador);
            case 4 -> comprar_activo(jugador);
            case 5 -> comprar_pasivo(jugador);
            default -> {
                preguntar_otra_vez = false;
            }
        }
        return preguntar_otra_vez;
    }

    static void ingresar_dinero(Jugador jugador) {
        double monto = Mensajes.input_double("¿Cuánto quieres ingresar?", "Ingresar dinero");
        jugador.balance.billetera.ingresardinero(monto);
    }

    static void retirar_dinero(Jugador jugador) {
        double monto = Mensajes.input_double("¿Cuánto quieres retirar?", "Retirar dinero");
        jugador.balance.billetera.retirardinero(monto);
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
        String mensaje = "¡Felicitaciones " + jugador.nombre + "! ¡Ha llegado el día de pago!";
        String titulo = "¡Día de Pago!";
        Mensajes.show(mensaje, titulo);

        mensaje = "Salario: " + jugador.balance.salario;
        mensaje += "\nIngreso Pasivo: " + jugador.balance.ingresos_pasivos;
        mensaje += "\nGastos pasivos: " + jugador.balance.gastos_pasivos;
        mensaje += "\nGastos fijos: " + jugador.balance.gastos_fijos;
        mensaje += "\nCashflow: " + jugador.balance.cashflow;
        titulo = "Balance mensual: " + jugador.nombre;
        Mensajes.show(mensaje, titulo);

        System.out.println("¡Día de pago!");
        System.out.println("Salario: " + jugador.balance.salario);
        System.out.println("Ingresos pasivos: " + jugador.balance.ingresos_pasivos);
        System.out.println("Gastos pasivos: " + jugador.balance.gastos_pasivos);
        System.out.println("Gastos fijos: " + jugador.balance.gastos_fijos);
        System.out.println("Cashflow: " + jugador.balance.cashflow);

        jugador.balance.billetera.ingresardinero(jugador.balance.salario + jugador.balance.ingresos_pasivos);
        jugador.balance.billetera.retirardinero(jugador.balance.gastos_pasivos + jugador.balance.gastos_fijos);
    }

    // Crear Jugador

    static Jugador crear_jugador() {
        String titulo = "Crear jugador";
        String nombre = Mensajes.input_string("¿Cuál es su nombre?", titulo);
        int edad = Mensajes.input_int("¿Cuántos años tienes", titulo);
        double salario = Mensajes.input_double("¿Cuál es tu salario?", titulo);
        double saldo = Mensajes.input_double("¿Cuanto dinero tienes en tu billetera?", titulo);

        return new Jugador(nombre, edad, saldo, salario);
    }
}
