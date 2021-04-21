package pe.fico.service;

import java.util.List;

import pe.fico.entity.Asesoria_Cliente;

public interface IAsesoria_ClienteService {
	public void insertar(Asesoria_Cliente asesoria_cliente);
	public List<Asesoria_Cliente> listar();
	public void eliminar(int idAsesoria, int idCliente);
}
