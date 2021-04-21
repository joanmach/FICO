package pe.fico.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.fico.entity.TipoDeTarjeta;
import pe.fico.dao.ITipoDeTarjetaDao;

public class TipoDeTarjetaDaoImpl implements ITipoDeTarjetaDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(TipoDeTarjeta tipo) {
		// TODO Auto-generated method stub
		try {
			em.persist(tipo);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoDeTarjeta> listar() {
		// TODO Auto-generated method stub
		List<TipoDeTarjeta> lista = new ArrayList<TipoDeTarjeta>();
		try {
			Query q = em.createQuery("select tdp from TipoDeTarjeta tdp");
			lista = (List<TipoDeTarjeta>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int CTipo) {
		// TODO Auto-generated method stub
		TipoDeTarjeta tip = new TipoDeTarjeta();
		try {
			tip = em.getReference(TipoDeTarjeta.class,CTipo);
			em.remove(tip);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}				
	}
	
	
	
}
