import javax.swing.*;

public class diadepago {
    String nombre;
    double monto;
    public diadepago(Jugador jugador) {
        this.nombre = jugador.nombre;
        this.monto = jugador.salario;
        JOptionPane.showMessageDialog(null, "¡Felicitaciones " + this.nombre + "! ¡Has recibido tu salario de " + this.monto + "!");
        System.out.println("¡Día de pago!");
        jugador.billetera.ingresardinero(this.monto);
    }
}
