package pe.fico.dao;

import java.util.List;

import pe.fico.entity.Especialidad;

public interface IEspecialidadDao {
	public void insertar(Especialidad especialidad);
	public List<Especialidad> listar();
	public void eliminar(int idEspecialidad);
}
