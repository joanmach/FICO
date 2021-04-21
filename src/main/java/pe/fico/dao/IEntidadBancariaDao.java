package pe.fico.dao;

import java.util.List;
import pe.fico.entity.EntidadBancaria;

public interface IEntidadBancariaDao {
	public void insertar(EntidadBancaria entidad);
	public List<EntidadBancaria> listar();
	public void eliminar(int CEntidad);	
}
