package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.entity.Cliente;
import pe.fico.service.iClienteService;
import pe.fico.entity.Ciudad;
import pe.fico.service.ICiudadService;

@Named
@RequestScoped

public class ClienteController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private iClienteService mService;
	@Inject
	private ICiudadService cService;
	private Cliente cliente;	
	private Ciudad ciudad;
	List<Cliente> listaClientes;
	List<Ciudad> listaCiudades;
	
	@PostConstruct
	public void init() {
		this.listaCiudades = new ArrayList<Ciudad>();
		this.ciudad = new Ciudad();
		this.listaClientes = new ArrayList<Cliente>();
		this.cliente = new Cliente();
		this.listar();
	}
	
	public String nuevoMotor() {
		this.setCliente(new Cliente());
		return "cliente.xml";
	}

	public void insertar() {
		mService.insertar(cliente);
		limpiarCliente();
	}
	
	
	public void listarCliente() {
		listaClientes = mService.listar();
	}
	public void listar() {
		listaCiudades = cService.listar();
	}
	
	public void limpiarCliente() {
		this.init();
	}
	
	public void eliminar(Cliente cliente) {
		mService.eliminar(cliente.getIdCliente());
		this.listar();
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

	public void setListaMotores(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public List<Ciudad> getListaCiudades() {
		return listaCiudades;
	}

	public void setListaCiudades(List<Ciudad> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}	
}
