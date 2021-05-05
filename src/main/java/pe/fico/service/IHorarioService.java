package pe.fico.service;

import java.util.List;

import pe.fico.entity.Horario;

public interface IHorarioService {
	public void insertar(Horario horario);
	public List<Horario> listar();
	public void eliminar(int idHorario);
}
