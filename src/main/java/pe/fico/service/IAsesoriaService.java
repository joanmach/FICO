package pe.fico.service;

import java.util.List;

import pe.fico.entity.Asesoria;

public interface IAsesoriaService {
	public void insertar(Asesoria asesoria);
	public List<Asesoria> listar();
	public void eliminar(int idAsesoria);
}
