import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mensajes.saludar();

        // Crear Jugadores

        ArrayList<Jugador> jugadores = Acciones.crear_jugadores();

        // mainloop

        System.out.println("");

        boolean preguntar_otra_vez, finalizar;
        int numero_jugada = 1;

        do {

            jugadores.forEach(jugador -> Acciones.turno(jugador));

            numero_jugada ++;
            System.out.println("Jugada número: " + numero_jugada);
            System.out.println("");

            finalizar = Mensajes.input_finalizar("¿Desea finalizar el juego?\nIngrese 'Sí' o 'No'", "Finalizar");

        } while (!finalizar);

        Mensajes.finalizar();
    }
}
