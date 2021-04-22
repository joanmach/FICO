package pe.fico.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.fico.dao.IAsesoria_ClienteDao;
import pe.fico.entity.Asesoria_Cliente;
import pe.fico.service.IAsesoria_ClienteService;

public class Asesoria_ClienteServiceImpl implements IAsesoria_ClienteService, Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private IAsesoria_ClienteDao mD;
	
	@Override
	public void insertar(Asesoria_Cliente asesoria_cliente) {
		mD.insertar(asesoria_cliente);
	}

	@Override
	public List<Asesoria_Cliente> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idAsesoria, int idCliente) {
		mD.eliminar(idAsesoria, idCliente);
		
	}
}
