import javax.swing.*;

public class diadepago {
    String nombre;
    double ingreso_pasivo, gastos_pasivos, salario, gastos_fijos, cashflow;

    // Eventualmente esta clase se podría convertir en una función pública o algo similar.

    public diadepago(Jugador jugador) {
        this.nombre = jugador.nombre;
        this.salario = jugador.balance.salario;
        this.ingreso_pasivo = jugador.balance.ingresos_pasivos;
        this.gastos_pasivos = jugador.balance.gastos_pasivos;
        this.gastos_fijos = jugador.balance.gastos_fijos;
        this.cashflow = this.salario + this.ingreso_pasivo - this.gastos_fijos - this.gastos_pasivos;
        JOptionPane.showMessageDialog(null, "¡Felicitaciones " + this.nombre + "! ¡Ha llegado el día de pago!");
        JOptionPane.showMessageDialog(null, "Salario: " + this.salario + "\nIngreso Pasivo: " + this.ingreso_pasivo + "\nGastos pasivos: " + this.gastos_pasivos + "\nGastos fijos: " + this.gastos_fijos + "\nCashflow: " + this.cashflow);
        System.out.println("¡Día de pago!");
        System.out.println("Salario: " + this.salario);
        System.out.println("Ingresos pasivos: " + this.ingreso_pasivo);
        System.out.println("Gastos pasivos: " + this.gastos_pasivos);
        System.out.println("Gastos fijos: " + this.gastos_fijos);
        System.out.println("Cashflow: " + this.cashflow);
        jugador.balance.billetera.ingresardinero(this.salario + this.ingreso_pasivo);
        jugador.balance.billetera.retirardinero(this.gastos_pasivos + this.gastos_fijos);
    }
}
