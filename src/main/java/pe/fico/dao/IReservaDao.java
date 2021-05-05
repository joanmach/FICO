package pe.fico.dao;

import java.util.List;

import pe.fico.entity.Reserva;


public interface IReservaDao {
	public void insertar(Reserva reserva);
	public List<Reserva> listar();
	public void eliminar(int idReserva);
}
