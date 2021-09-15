import java.util.ArrayList;

public class BalanceFinanciero {
    Jugador titular;
    double ingresos_pasivos, ingresos_activos, salario, gastos_totales;
    ArrayList<Activo> activos = new ArrayList<Activo>();
    Billetera billetera;

    public BalanceFinanciero(double salario, Jugador titular) {
        this.titular = titular;
        this.ingresos_pasivos = 0;
        this.ingresos_activos = 0;
        this.salario = salario;
        this.billetera = new Billetera(this.titular.nombre, titular.saldo);
        this.gastos_totales = salario/2;
        System.out.println(this.gastos_totales);
        this.activos = new ArrayList<Activo>();
    }
}
