public class Billetera {
    String dueño;
    double saldo;

    public Billetera(String dueño, double saldo) {
        this.dueño = dueño;
        this.saldo = saldo;
        System.out.println("Se ha creado la billetera de " + this.dueño + " con " + this.saldo);
    }

    public void vaciarbilletera() {
        this.saldo = 0;
        System.out.println("Se ha vaciado la billetera de " + this.dueño);
        mostrarsaldo();
    }

    public void ingresardinero (double monto) {

        this.saldo += monto;
        System.out.println("Se ha ingresado " + monto + " a la billetera de " + this.dueño);
        mostrarsaldo();
    }

    public void retirardinero (double monto) {

        this.saldo -= monto;
        System.out.println("Se ha retirado " + monto + " a la billetera de " + this.dueño);
        mostrarsaldo();
    }

    public void mostrarsaldo() {
        System.out.println("El saldo de la billetera de " + this.dueño + " es: " + this.saldo);
    }


}
