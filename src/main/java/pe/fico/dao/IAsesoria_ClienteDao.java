package pe.fico.dao;

import java.util.List;

import pe.fico.entity.Asesoria_Cliente;


public interface IAsesoria_ClienteDao {
	public void insertar(Asesoria_Cliente asesoria_cliente);
	public List<Asesoria_Cliente> listar();
	public void eliminar(int idCliente, int idAsesoria);
}
