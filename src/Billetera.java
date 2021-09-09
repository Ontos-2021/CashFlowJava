public class Billetera {
    String dueño;
    double saldo;

    public Billetera(String dueño, double saldo) {
        this.dueño = dueño;
        this.saldo = saldo;
        System.out.println("Se ha creado la billetera de " + this.dueño + " con " + this.saldo);
    }

    public Billetera () {
        this.saldo = 0;
    }

    public void vaciarbilletera() {
        this.saldo = 0;
        System.out.println("Se ha vaciado la billetera de " + this.dueño + ", el nuevo saldo es: " + this.saldo);
    }

    public void ingresardinero (double monto) {
        this.saldo += monto;
    }

    public void retirardinero (double monto) {
        this.saldo += monto;
    }


}
