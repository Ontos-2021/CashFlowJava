public class Activo {

    String nombre;
    double precio;
    double ingreso_pasivo;

    public Activo(String nombre, double precio, double ingreso_pasivo) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingreso_pasivo = ingreso_pasivo;
        System.out.println("Se ha creado el activo " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Ingreso pasivo: " + this.ingreso_pasivo);
    }
}
