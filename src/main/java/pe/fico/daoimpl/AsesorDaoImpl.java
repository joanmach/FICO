package pe.fico.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.fico.dao.IAsesorDao;
import pe.fico.entity.Asesor;

public class AsesorDaoImpl implements IAsesorDao, Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Asesor asesor) {
		em.persist(asesor);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Asesor> listar() {
		List<Asesor> lista = new ArrayList<Asesor>();
		Query q = em.createQuery("select cl from Asesor cl");
		lista = (List<Asesor>) q.getResultList();
		return lista;
	}
	@Transactional
	@Override
	public void eliminar(int idAsesor) {
		Asesor asesor = new Asesor();
		asesor = em.getReference(Asesor.class, idAsesor);
		em.remove(asesor);
	}

}