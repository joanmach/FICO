package pe.fico.service;

import java.util.List;

import pe.fico.entity.Ciudad;

public interface ICiudadService {
	public void insertar(Ciudad ciudad);
	public List<Ciudad> listar();
	public void eliminar(int idCiudad);
}
