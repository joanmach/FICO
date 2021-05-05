package pe.fico.service;

import java.util.List;

import pe.fico.entity.Reserva;

public interface IReservaService {
	public void insertar(Reserva reserva);
	public List<Reserva> listar();
	public void eliminar(int idReserva);
}
