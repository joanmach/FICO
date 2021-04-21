package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.entity.Pais;
import pe.fico.service.iPaisService;

@Named
@RequestScoped

public class PaisController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private iPaisService pService;
	private Pais pais;
	List<Pais> listaPaises;
	
	@PostConstruct
	public void init() {
		this.listaPaises = new ArrayList<Pais>();
		this.pais= new Pais();
		this.listar();
	}
	
	public String nuevoPais() {
		this.setPais(new Pais());
		return "pais.xhtml";
	}
	
	public void insertar() {
		pService.insertar(pais);
		limpiarPais();
	}
	
	public void listar() {
		listaPaises = pService.listar();
	}
	
	public void limpiarPais() {
		this.init();
	}
	
	public void eliminar(Pais pais) {
		pService.eliminar(pais.getIdPais());
		this.listar();
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
