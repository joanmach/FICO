package pe.fico.service;

import java.util.List;

import pe.fico.entity.HorarioAsesoria;

public interface IHorarioAsesoriaService {
	public void insertar(HorarioAsesoria horarioasesoria);
	public List<HorarioAsesoria> listar();
	public void eliminar(int idHorarioAsesoria);
}
