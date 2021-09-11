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
        this.billetera = new Billetera(nombre, saldo);
        this.salario = salario;
        this.balance = new BalanceFinanciero(salario);
        System.out.println("¡Hola!, soy " + nombre + " y tengo " + edad + " años");
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        System.out.println("¡Hola!, soy " + nombre);
        this.billetera = new Billetera(nombre);
    }
    public void comprar_activo(Activo activo) {
        this.balance.activos.add(activo);
        System.out.println("¡Felicitaciones " + this.nombre +"! Se ha agregado el siguiente activo a su portafolio: " + activo.nombre);
        this.billetera.retirardinero(activo.precio);
        ingresos_pasivos = 0;
        this.balance.activos.forEach(activo_en_lista -> this.ingresos_pasivos += activo_en_lista.ingreso_pasivo);
        System.out.println("Los ingresos pasivos totales son: " + ingresos_pasivos);
    }
}
