public class Jugador {
    String nombre;
    int edad;
    double saldo;
    Billetera billetera;

    public Jugador(String nombre, int edad, double saldo) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("¡Hola!, soy " + nombre + " y tengo " + edad + " años");
        this.billetera = new Billetera(nombre, saldo);
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        System.out.println("¡Hola!, soy " + nombre);
        this.billetera = new Billetera(nombre);
    }
}
