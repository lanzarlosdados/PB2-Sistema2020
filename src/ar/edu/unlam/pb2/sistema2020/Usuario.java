package ar.edu.unlam.pb2.sistema2020;


import java.util.HashSet;
import java.util.LinkedList;

public class Usuario {
     
	private Integer id;
	private String email;
	private String contrasenia;
	private HashSet<Direccion> listaDireccion;
	private LinkedList<Producto> listaDeProductos;
	
	public Usuario(Integer id, String email, String contrasenia) {
		super();
		this.id = id;
		this.email = email;
		this.contrasenia = contrasenia;
		listaDireccion = new HashSet<>();
		listaDeProductos= new LinkedList<>();
	}
	
	public Boolean agregarProducto(Producto p){
		return listaDeProductos.add(p);
	}
	
	public LinkedList<Producto> getListaDeProductos() {
		return listaDeProductos;
	}

	public Boolean ingresarDireccion(Direccion d){
		
		return listaDireccion.add(d);
		
	}
	
	public  HashSet<Direccion> getDireccion(){
		return listaDireccion;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	
}
