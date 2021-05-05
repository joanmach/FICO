package pe.fico.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.fico.dao.IHorarioAsesoriaDao;
import pe.fico.entity.HorarioAsesoria;

public class HorarioAsesoriaDaoImpl implements IHorarioAsesoriaDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(HorarioAsesoria horarioasesoria) {
		em.persist(horarioasesoria);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HorarioAsesoria> listar() {
		List<HorarioAsesoria> lista = new ArrayList<HorarioAsesoria>();
		Query q =em.createQuery("select ha from HorarioAsesoria ha");
		lista = (List<HorarioAsesoria>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idHorarioAsesoria) {
		HorarioAsesoria horarioasesoria= new HorarioAsesoria();
		horarioasesoria = em.getReference(HorarioAsesoria.class, idHorarioAsesoria);
		em.remove(horarioasesoria);
	}

}
