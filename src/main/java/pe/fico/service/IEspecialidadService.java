package pe.fico.service;

import java.util.List;

import pe.fico.entity.Especialidad;

public interface IEspecialidadService {
	public void insertar(Especialidad especialidad);
	public List<Especialidad> listar();
	public void eliminar(int idEspecialidad);
}
