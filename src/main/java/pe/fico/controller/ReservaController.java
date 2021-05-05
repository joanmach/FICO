package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.fico.service.IReservaService;
import pe.fico.entity.Reserva;


public class ReservaController implements Serializable{
	
private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IReservaService mService;

			
	private Reserva reserva;
	List<Reserva> listaReservas;
	
	
	@PostConstruct
	public void init() {
		this.listaReservas = new ArrayList<Reserva>();
		this.reserva = new Reserva();
	}
	
	public String nuevaReserva() {
		this.setReserva(new Reserva());
		return "reserva.xhtml";
	}
	
	public void insertar() {
		try {
			mService.insertar(reserva);
			limpiarReserva();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
			
	}

	public void listar() {
		try {
			listaReservas = mService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarReserva() {
		this.init();
	}

	
	public void eliminarReserva(Reserva r) {
		try {
			mService.eliminar(r.getIdReserva());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	
	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
	

	
}
