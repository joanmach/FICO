package pe.fico.dao;

import java.util.List;
import pe.fico.entity.HorarioAsesoria;

public interface IHorarioAsesoriaDao {
	public void insertar(HorarioAsesoria horarioasesoria);
	public List<HorarioAsesoria> listar();
	public void eliminar(int idHorarioAsesoria);
}
