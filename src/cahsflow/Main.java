package cahsflow;
import java.util.ArrayList;

import cahsflow.juego.Acciones;
import cahsflow.juego.Mensajes;
import cahsflow.modelo.Jugador;

public class Main {
    public static void main(String[] args) {

        Mensajes.saludar();

        // Crear Jugadores

        ArrayList<Jugador> jugadores = Acciones.crearJugadores();

        // mainloop

        System.out.println("");

        boolean preguntarOtraVez, finalizar;
        int numeroJugada = 1;

        do {

            jugadores.forEach(jugador -> Acciones.turno(jugador));

            numeroJugada ++;
            System.out.println("Jugada número: " + numeroJugada);
            System.out.println("");

            finalizar = Mensajes.inputFinalizar("¿Desea finalizar el juego?\nIngrese 'Sí' o 'No'", "Finalizar");

        } while (!finalizar);

        Mensajes.finalizar();
    }
}
