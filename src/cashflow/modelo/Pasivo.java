package cashflow.modelo;
public class Pasivo {

    private String nombre;
    private Double precio;
    private Double gastoPasivo;

    public Pasivo(String nombre, double precio, double gasto_pasivo) {
        this.nombre = nombre;
        this.precio = precio;
        this.gastoPasivo = gasto_pasivo;
        mostrar();
    }

	public void mostrar() {
		System.out.println("Se ha creado el pasivo: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Gasto pasivo: " + this.gastoPasivo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getGastoPasivo() {
		return gastoPasivo;
	}

	public void setGastoPasivo(Double gastoPasivo) {
		this.gastoPasivo = gastoPasivo;
	}

	@Override
	public String toString() {
		return "Pasivo [nombre=" + nombre + ", precio=" + precio + ", gastoPasivo=" + gastoPasivo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasivo other = (Pasivo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
