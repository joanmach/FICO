package pe.fico.dao;

import java.util.List;
import pe.fico.entity.Horario;

public interface IHorarioDao {
	public void insertar(Horario horario);
	public List<Horario> listar();
	public void eliminar(int idHorario);
}
