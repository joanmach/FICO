package pe.fico.dao;

import java.util.List;
import pe.fico.entity.TipoDeTarjeta;

public interface ITipoDeTarjetaDao {
	public void insertar(TipoDeTarjeta tipo);
	public List<TipoDeTarjeta> listar();
	public void eliminar(int CTipo);
}
