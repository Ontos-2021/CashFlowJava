import java.util.ArrayList;

public class BalanceFinanciero {
    Jugador titular;
    double ingresos_pasivos, gastos_pasivos, ingresos_activos, salario, gastos_fijos;
    ArrayList<Activo> activos;
    ArrayList<Pasivo> pasivos;
    Billetera billetera;

    public BalanceFinanciero(double salario, Jugador titular) {
        this.titular = titular;
        this.ingresos_pasivos = 0;
        this.ingresos_activos = 0;
        this.gastos_pasivos = 0;
        this.salario = salario;
        this.billetera = new Billetera(this.titular.nombre, titular.saldo);
        this.gastos_fijos = salario/2;
        this.activos = new ArrayList<Activo>();
        this.pasivos = new ArrayList<Pasivo>();
        System.out.println("Gastos totales: " + this.gastos_fijos);
    }
}
