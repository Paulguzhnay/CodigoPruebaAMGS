package ec.edu.ups.business;
import ec.edu.ups.model.*;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.dao.*;

@Stateless
public class DocenteON implements DocenteONRemote{
	
	@Inject
	private DocenteDAO daoDocente;

	public void insertar(Docente  doc) throws Exception  {
		daoDocente.insert(doc);
	}
	
	public List <Docente> getDocente(){
		return daoDocente.getList();
	}
	
}
