public class Jugador {
    String nombre;
    int edad;
    double saldo_inicial, salario_inicial;
    BalanceFinanciero balance;

    public Jugador(String nombre, int edad, double saldo_inicial, double salario_inicial) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo_inicial = saldo_inicial;
        this.salario_inicial = salario_inicial;
        System.out.println("¡Hola!, soy " + nombre + " y tengo " + edad + " años");
        this.balance = new BalanceFinanciero(this);
    }

    public void comprar_activo(Activo activo) {
        this.balance.activos.add(activo);
        System.out.println("¡Felicitaciones " + this.nombre +"! Se ha agregado el siguiente activo a su portafolio: " + activo.nombre);
        this.balance.billetera.retirardinero(activo.precio);

        // En estas líneas de calcula los ingresos pasivos iterando todos los activos.
        balance.ingresos_pasivos = 0;
        this.balance.activos.forEach(activo_en_lista -> this.balance.ingresos_pasivos += activo_en_lista.ingreso_pasivo);

        this.balance.cashflow += activo.ingreso_pasivo;
        System.out.println("Los ingresos pasivos totales son: " + balance.ingresos_pasivos);
    }

    public void comprar_pasivo (Pasivo pasivo) {
        this.balance.pasivos.add(pasivo);
        this.balance.billetera.retirardinero(pasivo.precio);

        // Y en estas líneas se calculan los gastos pasivos sumandole el gasto pasivo del pasivo que se acabo de comprar.
        this.balance.gastos_pasivos += pasivo.gasto_pasivo;
        this.balance.cashflow -= pasivo.gasto_pasivo;

        System.out.println("¡Felicitaciones " + this.nombre +"! Ha comprado el siguiente pasivo: " + pasivo.nombre);
        System.out.println("Sus gastos pasivos son de: " + this.balance.gastos_pasivos);
    }
}
