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
		this.listarCliente();
	}
	
	public String nuevoCliente() {
		this.setCliente(new Cliente());
		listaCiudades= cService.listar();
		return "cliente.xml";
	}

	public void insertar() {
		try {
		mService.insertar(cliente);
		limpiarCliente();
		this.listarCliente();
		}
		catch(Exception ex) {
		System.out.println(ex.getMessage());
	          }
	}
	
	
	public void listarCliente() {
		try {
		listaClientes = mService.listar();
			}
			catch(Exception ex) {
					System.out.println(ex.getMessage());
								}
	}
	public void listar() {
		try {
		listaCiudades = cService.listar();
	}
	catch(Exception ex) {
			System.out.println(ex.getMessage());
						}
	}
	
	public void limpiarCliente() {
		this.init();
	}
	
	public void eliminar(Cliente cliente) {
		
		try {
		mService.eliminar(cliente.getIdCliente());
		this.listarCliente();
			}
			catch(Exception ex) {
					System.out.println(ex.getMessage());
								}	
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Ciudad> getListaCiudades() {
		return listaCiudades;
	}

	public void setListaCiudades(List<Ciudad> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}
	

}
