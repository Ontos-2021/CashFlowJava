import java.util.ArrayList;

public class Jugador {
    String nombre;
    int edad;
    double saldo;
    double salario;
    Billetera billetera;
    double ingresos_pasivos;
    BalanceFinanciero balance;

    public Jugador(String nombre, int edad, double saldo, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.saldo = saldo;
        this.balance = new BalanceFinanciero(salario, this);
        System.out.println("¡Hola!, soy " + nombre + " y tengo " + edad + " años");
    }

    public void comprar_activo(Activo activo) {
        this.balance.activos.add(activo);
        System.out.println("¡Felicitaciones " + this.nombre +"! Se ha agregado el siguiente activo a su portafolio: " + activo.nombre);
        this.balance.billetera.retirardinero(activo.precio);
        balance.ingresos_pasivos = 0;
        this.balance.activos.forEach(activo_en_lista -> this.balance.ingresos_pasivos += activo_en_lista.ingreso_pasivo);
        System.out.println("Los ingresos pasivos totales son: " + balance.ingresos_pasivos);
    }
}
