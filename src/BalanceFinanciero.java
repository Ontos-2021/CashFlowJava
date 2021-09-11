import java.util.ArrayList;

public class BalanceFinanciero {
    Jugador propietario;
    double ingresos_pasivos, ingresos_activos, salario, gastos_totales;
    ArrayList<Activo> activos = new ArrayList<Activo>();

    public BalanceFinanciero(double salario) {
        this.ingresos_pasivos = 0;
        this.ingresos_activos = 0;
        this.salario = salario;
        this.gastos_totales = 0;
        this.activos = new ArrayList<Activo>();
    }
}
