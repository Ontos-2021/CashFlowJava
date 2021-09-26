import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Mensajes.saludar();

        // Crear jugador

        Jugador jugador_1 = Acciones.crear_jugador();

        // mainloop

        System.out.println("");

        boolean preguntar_otra_vez = true;
        int numero_jugada = 1;

        do {
            int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Qué quieres hacer?\n1- Ingresar Dinero\n2- Retirar Dinero\n3- Día de pago\n4- Comprar Activo Financiero\n5- Comprar Pasivo\nIngrese otro número para salir"));
            double monto;
            switch (respuesta){
                case 1:
                    Acciones.ingresar_dinero(jugador_1);
                    break;
                case 2:
                    Acciones.retirar_dinero(jugador_1);
                    break;
                case 3:
                    //diadepago dia_de_pago = new diadepago(jugador_1);
                    Acciones.dia_de_pago(jugador_1);
                    break;
                case 4:
                    Acciones.comprar_activo(jugador_1);
                    break;
                case 5:
                    Acciones.comprar_pasivo(jugador_1);
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
}
