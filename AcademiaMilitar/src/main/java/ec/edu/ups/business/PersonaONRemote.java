package ec.edu.ups.business;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.model.Persona;

@Remote
public interface PersonaONRemote {

public void insertar(Persona p) throws Exception;
	
	public List<Persona> getPersonas();
	
}
