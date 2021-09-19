public class Pasivo {

    String nombre;
    double precio, gasto_pasivo;

    public Pasivo(String nombre, double precio, double gasto_pasivo) {
        this.nombre = nombre;
        this.precio = precio;
        this.gasto_pasivo = gasto_pasivo;
        System.out.println("Se ha creado el pasivo: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Gasto pasivo: " + this.gasto_pasivo);
    }
}
