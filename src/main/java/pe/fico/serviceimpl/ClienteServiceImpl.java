package pe.fico.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.dao.IClienteDao;
import pe.fico.entity.Cliente;
import pe.fico.service.iClienteService;

@Named
@RequestScoped
public class ClienteServiceImpl implements iClienteService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private IClienteDao mD;
	
	@Override
	public void insertar(Cliente cliente) {
		mD.insertar(cliente);
	}

	@Override
	public List<Cliente> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idCliente) {
		mD.eliminar(idCliente);
	}

}
