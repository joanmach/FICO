package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.poi.util.SystemOutLogger;

import pe.fico.entity.Ciudad;
import pe.fico.service.ICiudadService;
import pe.fico.entity.Pais;
import pe.fico.service.iPaisService;

@Named
@RequestScoped

public class CiudadController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICiudadService cService;
	@Inject
	private iPaisService pService;
	
	private Ciudad ciudad;
	private Pais pais;
	
	List<Ciudad> listaCiudades;
	List<Pais> listaPaises;
	
	@PostConstruct
	public void init() {
		this.listaPaises = new ArrayList<Pais>();
		this.pais = new Pais();
		this.listaCiudades = new ArrayList<Ciudad>();
		this.ciudad = new Ciudad();
		this.listar();
		this.listarCiudades();
	}
	
	public String nuevoCiudad() {
		this.setCiudad(new Ciudad());
		return "ciudad.xhtml";
	}
	
	public void insertar() {
		try {
		cService.insertar(ciudad);
		limpiarCiudad();
		this.listarCiudades();
		}
		catch(Exception ex ) {
			System.out.println(ex.getMessage());
			
		}
	}
	
	public void listarCiudades() {
		try{listaCiudades = cService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
	}
	
	public void listar() {
		try{listaPaises = pService.listar();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void limpiarCiudad() {
		this.init();
	}
	
	public void eliminar(Ciudad ciudad) {
		try{cService.eliminar(ciudad.getIdCiudad());
		this.listarCiudades();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			
		}
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
	
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Pais> getListaPaises() {
		return listaPaises;
	}

	public void setListaPaises(List<Pais> listaPaises) {
		this.listaPaises = listaPaises;
	}
	
}
