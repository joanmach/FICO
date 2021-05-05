package pe.fico.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.fico.dao.IReservaDao;
import pe.fico.entity.Reserva;

public class ReservaDaoImpl implements IReservaDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Reserva reserva) {
		em.persist(reserva);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> listar() {
		List<Reserva> lista = new ArrayList<Reserva>();
		try {
			Query q = em.createQuery("select r from Reserva r");
			lista = (List<Reserva>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idReserva) {
		Reserva reserva = new Reserva();
		reserva = em.getReference(Reserva.class, idReserva);
		em.remove(reserva);
	}
}
