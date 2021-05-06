package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.entity.Especialidad;
import pe.fico.entity.Asesor;
import pe.fico.service.IEspecialidadService;
import pe.fico.service.IAsesorService;

@Named
@RequestScoped

public class AsesorController implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Inject
	private IEspecialidadService pService;
	
	@Inject
	private IAsesorService mService;	
				
	private Especialidad especialidad;
	List<Especialidad> listaEspecialidades;
	
	private Asesor asesor;
	List<Asesor> listaAsesores;
	
	@PostConstruct
	public void init() {
		this.listaEspecialidades = new ArrayList<Especialidad>();
		this.especialidad = new Especialidad();
		this.listaAsesores = new ArrayList<Asesor>();
		this.asesor = new Asesor();
		this.listarEspecialidad();
		this.listar();
	}
	
	public String nuevaAsesor() {
		this.setAsesor(new Asesor());
		return "asesor.xhtml";
	}
	
	public void insertar() {
		mService.insertar(asesor);
		limpiarAsesor();		
		this.listar();
	}
	
	public void listarEspecialidad() {
		listaEspecialidades = pService.listar();
	}
	
	public void listar() {
		listaAsesores = mService.listar();
	}
	
	public void limpiarAsesor() {
		this.init();
	}
	
	public void eliminar(Asesor asesor) {
		pService.eliminar(asesor.getIdAsesor());
		this.listar();
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public List<Especialidad> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(List<Especialidad> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
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

	
}
