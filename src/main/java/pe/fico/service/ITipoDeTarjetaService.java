package pe.fico.service;

import java.util.List;

import pe.fico.entity.TipoDeTarjeta;

public interface ITipoDeTarjetaService {
	public void insertar(TipoDeTarjeta tipo);
	public List<TipoDeTarjeta> listar();
	public void eliminar(int CTipo);
}
