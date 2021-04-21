package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.fico.entity.Asesoria;
import pe.fico.entity.Asesor;
import pe.fico.service.IAsesoriaService;
import pe.fico.service.IAsesorService;

public class AsesoriaController implements Serializable{
	
private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IAsesoriaService pService;
	
	@Inject
	private IAsesorService mService;	
				
	private Asesoria asesoria;
	List<Asesoria> listaAsesorias;
	
	private Asesor asesor;
	List<Asesor> listaAsesores;
	
	@PostConstruct
	public void init() {
		this.listaAsesorias = new ArrayList<Asesoria>();
		this.asesoria = new Asesoria();
		this.listaAsesores = new ArrayList<Asesor>();
		this.asesor = new Asesor();
		this.listarAsesoria();
		this.listar();
	}
	
	public String nuevaAsesoria() {
		this.setAsesoria(new Asesoria());
		return "asesoria.xhtml";
	}
	
	public void insertar() {
		pService.insertar(asesoria);
		limpiarAsesoria();		
		this.listarAsesoria();
	}
	
	public void listarAsesoria() {
		listaAsesorias = pService.listar();
	}
	
	public void listar() {
		listaAsesores = mService.listar();
	}
	
	public void limpiarAsesoria() {
		this.init();
	}
	
	public void eliminar(Asesoria asesoria) {
		pService.eliminar(asesoria.getIdAsesoria());
		this.listarAsesoria();
	}

	public Asesor getAsesor() {
		return asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	public List<Asesor> getListaAsesores() {
		return listaAsesores;
	}

	public void setListaAsesores(List<Asesor> listaAsesores) {
		this.listaAsesores = listaAsesores;
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
