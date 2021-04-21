package pe.fico.service;

import java.util.List;

import pe.fico.entity.Asesor;

public interface IAsesorService {
	public void insertar(Asesor asesor);
	public List<Asesor> listar();
	public void eliminar(int idAsesor);
}
