import java.util.ArrayList;

public class BalanceFinanciero {
    Jugador titular;
    double ingresos_pasivos, gastos_pasivos, salario, gastos_fijos;
    Billetera billetera;
    ArrayList<Activo> activos;
    ArrayList<Pasivo> pasivos;

    public BalanceFinanciero(Jugador titular) {
        this.titular = titular;
        this.ingresos_pasivos = 0;
        this.gastos_pasivos = 0;
        this.salario = titular.salario_inicial;
        this.gastos_fijos = this.salario/2;
        this.billetera = new Billetera(this.titular.nombre, titular.saldo_inicial);
        this.activos = new ArrayList<Activo>();
        this.pasivos = new ArrayList<Pasivo>();
    }
}
