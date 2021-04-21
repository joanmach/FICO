package pe.fico.service;

import java.util.List;

import pe.fico.entity.Cliente;

public interface iClienteService {
	public void insertar(Cliente cliente);
	public List<Cliente> listar();
	public void eliminar(int idCliente);
}
