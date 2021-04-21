package pe.fico.service;

import java.util.List;

import pe.fico.entity.EntidadBancaria;

public interface IEntidadBancariaService {
	public void insertar(EntidadBancaria entidad);
	public List<EntidadBancaria> listar();
	public void eliminar(int CEntidad);
}
