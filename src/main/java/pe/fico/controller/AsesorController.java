package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.entity.Asesor;
import pe.fico.service.IAsesorService;

@Named
@RequestScoped

public class AsesorController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAsesorService cService;
	private Asesor asesor;
	List<Asesor> listaAsesores;
	
	@PostConstruct
	public void init() {
		this.listaAsesores = new ArrayList<Asesor>();
		this.asesor = new Asesor();
		this.listar();
	}
	
	public String nuevoCiudad() {
		this.setAsesor(new Asesor());
		return "asesor.xhtml";
	}
	
	public void insertar() {
		cService.insertar(asesor);
		limpiarAsesor();
	}
	
	public void listar() {
		listaAsesores = cService.listar();
	}
	
	public void limpiarAsesor() {
		this.init();
	}
	
	public void eliminar(Asesor asesor) {
		cService.eliminar(asesor.getIdAsesor());
		this.listar();
	}

	public Asesor getAsesor() {
		return asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	public List<Asesor> getListaAsesor() {
		return listaAsesores;
	}

	public void setListaAsesores(List<Asesor> listaAsesores) {
		this.listaAsesores = listaAsesores;
	}	
	
}