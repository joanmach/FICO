package pe.fico.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.fico.dao.IReservaDao;
import pe.fico.entity.Reserva;
import pe.fico.service.IReservaService;

public class ReservaServiceImpl implements IReservaService, Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private IReservaDao mD;
	
	@Override
	public void insertar(Reserva reserva) {
		mD.insertar(reserva);
	}

	@Override
	public List<Reserva> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idReserva) {
		mD.eliminar(idReserva);
		
	}
}
