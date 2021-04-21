package pe.fico.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.fico.dao.IAsesoriaDao;
import pe.fico.entity.Asesoria;

public class AsesoriaDaoImpl implements IAsesoriaDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Asesoria asesoria) {
		em.persist(asesoria);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Asesoria> listar() {
		List<Asesoria> lista = new ArrayList<Asesoria>();
		Query q = em.createQuery("select as from Asesoria as");
		lista = (List<Asesoria>) q.getResultList();
		return lista;
	}
	@Transactional
	@Override
	public void eliminar(int idAsesoria) {
		Asesoria asesoria = new Asesoria();
		asesoria = em.getReference(Asesoria.class, idAsesoria);
		em.remove(asesoria);
	}
}
