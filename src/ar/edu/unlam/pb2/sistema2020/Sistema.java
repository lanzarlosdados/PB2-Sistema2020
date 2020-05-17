package ar.edu.unlam.pb2.sistema2020;

import java.util.ArrayList;

public class Sistema {
   
	private String nombre;
    private ArrayList<Usuario> listaDeUsuarios;
	private Integer puntosQueOtorga;
    
	public Sistema(String nombre) {
		super();
		this.nombre = nombre;
		listaDeUsuarios = new ArrayList<>();
		puntosQueOtorga=0;
	}

	public Boolean agregarUsuario(Usuario usuario){
	
		while(!listaDeUsuarios.isEmpty()){	
	 
		   for(Usuario u : listaDeUsuarios){
			if(!u.getEmail().equals(usuario.getEmail())){
		
		    return listaDeUsuarios.add(usuario);
		   }
	    }
	 return false;
	}
	 return listaDeUsuarios.add(usuario);
	}
	
	public Boolean ingresarAlSistema(String email,String contrasenia){
	
		for(Usuario u :listaDeUsuarios){
			if(u.getEmail().equals(email)){
				if(u.getContrasenia().equals(contrasenia)){
					return true;
				}
			}
		}
		return false;
	}
	
	public Boolean darDeBajaUsuario(Integer id){
		for(Usuario u: listaDeUsuarios){
			if(u.getId().equals(id)){
				 listaDeUsuarios.remove(u);
				 return true;
			}
		}
		return false;
	}
	
	public Integer obtenerPuntoDelUsuario(Usuario u){
		
		for(Producto p : u.getListaDeProductos()){
			puntosQueOtorga+= p.getPuntosQueOtorga();
					
				
			}
		 return puntosQueOtorga;
		}
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Usuario> getListaDeusuarios() {
		return listaDeUsuarios;
	}
	
	
	
	
}
