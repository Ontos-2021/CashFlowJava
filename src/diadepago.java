import javax.swing.*;

public class diadepago {
    String nombre;
    double salario;
    double ingreso_pasivo, gastos_pasivos;
    public diadepago(Jugador jugador) {
        this.nombre = jugador.nombre;
        this.salario = jugador.balance.salario;
        this.ingreso_pasivo = jugador.balance.ingresos_pasivos;
        this.gastos_pasivos = jugador.balance.gastos_pasivos;
        JOptionPane.showMessageDialog(null, "¡Felicitaciones " + this.nombre + "! ¡Has recibido tu salario de " + this.salario + "!\n También haz recibido ingresos pasivos por: " + this.ingreso_pasivo);
        System.out.println("¡Día de pago!");
        System.out.println("Has recibido un salario de " + this.salario + " e ingresos pasivos por " + this.ingreso_pasivo);
        System.out.println("Gastos pasivos: " + jugador.balance.gastos_pasivos);
        jugador.balance.billetera.ingresardinero(this.salario + this.ingreso_pasivo);
        jugador.balance.billetera.retirardinero(this.gastos_pasivos);
    }
}
