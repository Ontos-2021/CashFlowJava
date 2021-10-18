package cashflow.modelo;

public class Jugador {
    private String nombre;
    private Integer edad;
    private Double saldoInicial;
    private Double salarioInicial;
    private BalanceFinanciero balance;
    private Billetera billetera;


    public Jugador(String nombre, Integer edad, Double saldoInicial, Double salarioInicial) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldoInicial = saldoInicial;
        this.salarioInicial = salarioInicial;
        this.balance = new BalanceFinanciero(salarioInicial);
        mostrar();
    }

	public void mostrar() {
		System.out.println("¡Hola!, soy " + nombre + " y tengo " + edad + " años");
	}

    public void comprar_activo(Activo activo) {
        this.balance.addActivo(activo);
        System.out.println("¡Felicitaciones " + this.nombre +"! Se ha agregado el siguiente activo a su portafolio: " + activo.getNombre());
        this.balance.billetera.retirar(activo.getPrecio());

        // En estas líneas de calcula los ingresos pasivos iterando todos los activos.
        balance.ingresos_pasivos = 0;
        this.balance.activos.forEach(activo_en_lista -> this.balance.ingresos_pasivos += activo_en_lista.getIngresoPasivo());

        this.balance.cashflow += activo.getIngresoPasivo();
        System.out.println("Los ingresos pasivos totales son: " + balance.ingresos_pasivos);
    }

    public void comprar_pasivo (Pasivo pasivo) {
        this.balance.addPasivo(pasivo);
        this.balance.billetera.retirar(pasivo.getPrecio());

        // Y en estas líneas se calculan los gastos pasivos sumandole el gasto pasivo del pasivo que se acabo de comprar.
        this.balance.gastos_pasivos += pasivo.getGastoPasivo();
        this.balance.cashflow -= pasivo.getGastoPasivo();

        System.out.println("¡Felicitaciones " + this.nombre +"! Ha comprado el siguiente pasivo: " + pasivo.getNombre());
        System.out.println("Sus gastos pasivos son de: " + this.balance.gastos_pasivos);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public Double getSalarioInicial() {
		return salarioInicial;
	}

	public void setSalarioInicial(Double salarioInicial) {
		this.salarioInicial = salarioInicial;
	}

	public BalanceFinanciero getBalance() {
		return balance;
	}

	public void setBalance(BalanceFinanciero balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", saldoInicial=" + saldoInicial + ", salarioInicial="
				+ salarioInicial + ", balance=" + balance + "]";
	}
    
    
    
}
