package pe.fico.dao;

import java.util.List;
import pe.fico.entity.Ciudad;

public interface ICiudadDao {
	public void insertar(Ciudad ciudad);
	public List<Ciudad> listar();
	public void eliminar(int idCiudad);
}
