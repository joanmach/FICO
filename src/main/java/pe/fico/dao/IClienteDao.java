package pe.fico.dao;

import java.util.List;

import pe.fico.entity.Cliente;

public interface IClienteDao {
	public void insertar(Cliente cliente);
	public List<Cliente> listar();
	public void eliminar(int idCliente);
}
