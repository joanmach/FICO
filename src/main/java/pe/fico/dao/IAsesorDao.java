package pe.fico.dao;

import java.util.List;

import pe.fico.entity.Asesor;

public interface IAsesorDao {
	public void insertar(Asesor asesor);
	public List<Asesor> listar();
	public void eliminar(int idAsesor);
}