package cashflow.modelo;
public class Activo {

    private String nombre;
    private Double precio;
    private Double ingresoPasivo;

    public Activo(String nombre, Double precio, Double ingreso_pasivo) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingresoPasivo = ingreso_pasivo;
        mostrar();
    }

	public void mostrar() {
		System.out.println("Se ha creado el activo " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Ingreso pasivo: " + this.ingresoPasivo);
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

	public Double getIngresoPasivo() {
		return ingresoPasivo;
	}

	public void setIngresoPasivo(Double ingresoPasivo) {
		this.ingresoPasivo = ingresoPasivo;
	}

	@Override
	public String toString() {
		return "Activo [nombre=" + nombre + ", precio=" + precio + ", ingresoPasivo=" + ingresoPasivo + "]";
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
		Activo other = (Activo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
    
    
}
