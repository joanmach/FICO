package pe.fico.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.fico.dao.IAsesoria_ClienteDao;
import pe.fico.entity.Asesoria_Cliente;

public class Asesoria_ClienteDaoImpl implements IAsesoria_ClienteDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Asesoria_Cliente asesoria_cliente) {
		em.persist(asesoria_cliente);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Asesoria_Cliente> listar() {
		List<Asesoria_Cliente> lista = new ArrayList<Asesoria_Cliente>();
		Query q = em.createQuery("select ac from Asesoria ac");
		lista = (List<Asesoria_Cliente>) q.getResultList();
		return lista;
	}
	@Transactional
	@Override
	public void eliminar(int idAsesoria, int idCliente) {
		Asesoria_Cliente asesoria_cliente = new Asesoria_Cliente();
		asesoria_cliente = em.getReference(Asesoria_Cliente.class, idAsesoria);
		em.remove(asesoria_cliente);
		asesoria_cliente = em.getReference(Asesoria_Cliente.class, idCliente);
		em.remove(asesoria_cliente);
	}
}
