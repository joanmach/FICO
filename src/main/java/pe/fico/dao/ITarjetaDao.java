package pe.fico.dao;

import java.util.List;
import pe.fico.entity.Tarjeta;

public interface ITarjetaDao {
	public void insertar(Tarjeta tarjeta);
	public List<Tarjeta> listar();
	public void eliminar(String CTarjeta);	
}
