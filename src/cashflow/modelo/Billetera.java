package cashflow.modelo;
public class Billetera {
    double saldo;

    public Billetera(double saldo) {
        this.saldo = saldo;
        System.out.println("Se ha creado la billetera de con un saldo inicial de " + this.saldo);
    }

    public void vaciar() {
        this.saldo = 0;
        System.out.println("Se ha vaciado la billetera.");
        mostrarsaldo();
    }

    public void ingresar (double monto) {
        this.saldo += monto;
        System.out.println("Se ha ingresado " + monto + " a la billetera.");
        mostrarsaldo();
    }

    public void retirar (double monto) {
        this.saldo -= monto;
        System.out.println("Se ha retirado " + monto + " de la billetera.");
        mostrarsaldo();
    }

    public void mostrarsaldo() {
        System.out.println("El saldo de la billetera es: " + this.saldo);
    }
}
