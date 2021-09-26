public class Main {
    public static void main(String[] args) {

        Mensajes.saludar();

        // Crear jugador

        Jugador jugador_1 = Acciones.crear_jugador();

        // mainloop

        System.out.println("");

        boolean preguntar_otra_vez;
        int numero_jugada = 1;

        do {
            preguntar_otra_vez = Acciones.menu(jugador_1, true);
            numero_jugada ++;
            System.out.println("Jugada número: " + numero_jugada);
            System.out.println("");

        } while (preguntar_otra_vez);

        Mensajes.finalizar();
    }
}
