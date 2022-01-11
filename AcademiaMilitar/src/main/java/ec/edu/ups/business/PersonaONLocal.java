package ec.edu.ups.business;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.model.Persona;

@Local
public interface PersonaONLocal {
	
	public void insertar(Persona p);
	
	public List<Persona> getPersonas();

}

