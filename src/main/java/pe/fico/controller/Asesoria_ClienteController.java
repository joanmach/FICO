package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.fico.service.IAsesoria_ClienteService;
import pe.fico.entity.Asesoria_Cliente;

import pe.fico.service.IAsesoriaService;
import pe.fico.entity.Asesoria;

import pe.fico.service.iClienteService;
import pe.fico.entity.Cliente;
import pe.fico.entity.EntidadBancaria;
import pe.fico.entity.Tarjeta;
import pe.fico.entity.TipoDeTarjeta;


public class Asesoria_ClienteController implements Serializable{
	
private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IAsesoria_ClienteService acService;

	@Inject
	private IAsesoriaService pService;
	
	@Inject
	private iClienteService mService;	
				
	private Asesoria_Cliente asesoria_cliente;
	List<Asesoria_Cliente> listaAsesorias_Clientes;
	
	private Asesoria asesoria;
	List<Asesoria> listaAsesorias;
	
	private Cliente cliente;
	List<Cliente> listaClientes;
	
	@PostConstruct
	public void init() {
		this.listaAsesorias_Clientes = new ArrayList<Asesoria_Cliente>();
		this.asesoria_cliente = new Asesoria_Cliente();
		this.listaAsesorias = new ArrayList<Asesoria>();
		this.asesoria = new Asesoria();
		this.listaClientes = new ArrayList<Cliente>();
		this.cliente = new Cliente();
		this.listaAsesoria_Cliente();
		this.listaAsesorias();
		this.listaClientes();
	}
	
	public String nuevaAsesoria_Cliente() {
		this.setAsesoria_Cliente(new Asesoria_Cliente());
		listaAsesorias = pService.listar();
		listaClientes = mService.listar();
		return "asesoria_cliente.xhtml";
	}
	
	public void insertar() {
		try {
			acService.insertar(asesoria_cliente);
			limpiarAsesoria_Cliente();
			this.listaAsesoria_Cliente();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void listaAsesoria_Cliente() {
		try {
			listaAsesorias_Clientes = acService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarAsesoria_Cliente() {
		this.init();
	}

	public void listaAsesorias() {
		try {
			listaAsesorias = pService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listaClientes() {
		try {
			listaClientes = mService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void eliminarAsesoria(Asesoria a) {
		try {
			pService.eliminar(a.getIdAsesoria());
			this.listaAsesoria_Cliente();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}

	
	public void eliminarCliente(Cliente c) {
		try {
			mService.eliminar(c.getIdCliente());
			this.listaAsesoria_Cliente();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	
	public Asesoria_Cliente Asesoria_Cliente() {
		return asesoria_cliente;
	}

	public void setAsesoria_Cliente(Asesoria_Cliente asesoria_cliente) {
		this.asesoria_cliente = asesoria_cliente;
	}

	public List<Asesoria_Cliente> getListaAsesorias_Clientes() {
		return listaAsesorias_Clientes;
	}

	public void setListaAsesorias_Clientes(List<Asesoria_Cliente> listaAsesorias_Clientes) {
		this.listaAsesorias_Clientes = listaAsesorias_Clientes;
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

	public Cliente getcliente() {
		return cliente;
	}

	public void setcliente(Cliente cliente) {
		this.cliente =cliente;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
}
