public class Jugador {
    String nombre;
    int edad;
    double saldo;
    double salario;
    Billetera billetera;

    public Jugador(String nombre, int edad, double saldo, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.billetera = new Billetera(nombre, saldo);
        this.salario = salario;
        System.out.println("¡Hola!, soy " + nombre + " y tengo " + edad + " años");
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        System.out.println("¡Hola!, soy " + nombre);
        this.billetera = new Billetera(nombre);
    }
}
