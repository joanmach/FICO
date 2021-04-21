package pe.fico.dao;

import java.util.List;

import pe.fico.entity.Asesoria;

public interface IAsesoriaDao {
	public void insertar(Asesoria asesoria);
	public List<Asesoria> listar();
	public void eliminar(int idAsesoria);
}
