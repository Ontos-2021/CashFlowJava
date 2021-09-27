import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mensajes.saludar();

        // Crear jugadores

        int cantidad_jugadores = Mensajes.input_int("¡Ingrese el número de jugadores!", "Creando jugadores");

        ArrayList<Jugador> jugadores = new ArrayList<>();

        for (int i = 0; i < cantidad_jugadores; i++) {
            jugadores.add(Acciones.crear_jugador(i+1));
        }

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
