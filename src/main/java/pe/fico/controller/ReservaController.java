package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.service.IReservaService;
import pe.fico.entity.Reserva;

import pe.fico.service.iClienteService;
import pe.fico.entity.Cliente;

import pe.fico.service.IAsesoriaService;
import pe.fico.entity.Asesoria;

@Named
@RequestScoped
public class ReservaController implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Inject
	private IReservaService mService;
	
	@Inject
	private IAsesoriaService aService;
	
	@Inject
	private iClienteService cService;

			
	private Reserva reserva;
	List<Reserva> listaReservas;
	
	private Cliente cliente;
	List<Cliente> listaClientes;
	
	private Asesoria asesoria;
	List<Asesoria> listaAsesorias;
	
	
	@PostConstruct
	public void init() {
		this.listaReservas = new ArrayList<Reserva>();
		this.reserva = new Reserva();
		
		this.listaAsesorias = new ArrayList<Asesoria>();
		this.asesoria= new Asesoria();
		
		this.listaClientes = new ArrayList<Cliente>();
		this.cliente= new Cliente();
		
		this.listar();
		this.listaAsesorias();
		this.listaClientes();
	}
	
	public String nuevaReserva() {
		this.setReserva(new Reserva());
		listaAsesorias=aService.listar();
		listaClientes=cService.listar();
		return "reservaasesoria.xhtml";
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
	
	public void listaAsesorias() {
		try {
			listaAsesorias = aService.listar();
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listaClientes() {
		try {
			listaClientes= cService.listar();
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public Asesoria getAsesoria() {
		return asesoria;
	}

	public void setAsesoria(Asesoria asesoria) {
		this.asesoria = asesoria;
	}

	public List<Asesoria> getListaAsesorias() {
		return listaAsesorias;
	}

	public void setListaAsesorias(List<Asesoria> listaAsesorias) {
		this.listaAsesorias = listaAsesorias;
	}
	
	
	

	
}
