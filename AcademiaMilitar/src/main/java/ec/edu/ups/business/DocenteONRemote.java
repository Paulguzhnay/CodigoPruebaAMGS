package ec.edu.ups.business;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.model.Docente;
@Remote
public interface DocenteONRemote {

	public void insertar(Docente  doc) throws Exception;
	public List <Docente> getDocente();

}
