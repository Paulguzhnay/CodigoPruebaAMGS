package ec.edu.ups.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.model.Factura;

@Stateless
public class FacturaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Factura fact) {
		em.persist(fact);
	}
	
	public void update(Factura  fact) {
		em.merge(fact);
	}
	
	public Factura  read(int id) {
		Factura  fact=em.find(Factura.class, id);
		return(fact);
	}
	
	public void delete(int id) {
		Factura fact=em.find(Factura.class, id);
		em.remove(fact);
	}
	
	public List<Factura> getList(){
		
		List<Factura> listado= new ArrayList<Factura>();
		
		String jpql ="SELECT fact FROM Factura fact";
		Query query=em.createQuery(jpql, Factura.class);
		listado=query.getResultList();
		
		return listado;
		
	}

}
