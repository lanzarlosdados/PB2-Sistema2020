package ar.edu.unlam.pb2.sistema2020;

public class Producto {

	private String descripcion;
	private Integer puntosQueOtorga;
	
	public Producto(String descripcion, Integer puntosQueOtorga) {
		super();
		this.descripcion = descripcion;
		this.puntosQueOtorga = puntosQueOtorga;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Integer getPuntosQueOtorga() {
		return puntosQueOtorga;
	}
	
	
}
