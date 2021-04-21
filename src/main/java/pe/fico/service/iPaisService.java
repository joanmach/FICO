package pe.fico.service;

import java.util.List;

import pe.fico.entity.Pais;

public interface iPaisService {
	public void insertar(Pais pais);
	public List<Pais> listar();
	public void eliminar(int idPais);
}
