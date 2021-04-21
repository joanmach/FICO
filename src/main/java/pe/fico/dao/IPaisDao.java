package pe.fico.dao;

import java.util.List;
import pe.fico.entity.Pais;

public interface IPaisDao {
	public void insertar(Pais Pais);
	public List<Pais> listar();
	public void eliminar(int idPais);
}
