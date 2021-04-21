package pe.fico.service;

import java.util.List;

import pe.fico.entity.Tarjeta;

public interface ITarjetaService {
	public void insertar(Tarjeta tarjeta);
	public List<Tarjeta> listar();
	public void eliminar(String CTarjeta);
}
