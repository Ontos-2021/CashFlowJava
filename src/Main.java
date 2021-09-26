public class Main {
    public static void main(String[] args) {

        Mensajes.saludar();

        // Crear jugador

        Jugador jugador_1 = Acciones.crear_jugador();

        // mainloop

        System.out.println("");

        boolean preguntar_otra_vez, finalizar;
        int numero_jugada = 1;

        do {

            do {
                preguntar_otra_vez = Acciones.menu(jugador_1, true);
            } while (preguntar_otra_vez);

            numero_jugada ++;
            System.out.println("Jugada número: " + numero_jugada);
            System.out.println("");

            finalizar = Mensajes.input_finalizar("¿Desea finalizar el juego?\nIngrese 'Sí' o 'No'", "Finalizar");

        } while (!finalizar);

        Mensajes.finalizar();
    }
}
