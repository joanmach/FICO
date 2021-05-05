package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.fico.entity.Asesor;
import pe.fico.entity.Especialidad;
import pe.fico.service.IAsesorService;
import pe.fico.service.IEspecialidadService;

public class AsesorController implements Serializable{
	
private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IAsesorService pService;
	
	@Inject
	private IEspecialidadService mService;	
				
	private Asesor asesor;
	List<Asesor> listaAsesores;
	
	private Especialidad especialidad;
	List<Especialidad> listaEspecialidades;
	
	@PostConstruct
	public void init() {
		this.listaAsesores = new ArrayList<Asesor>();
		this.asesor = new Asesor();
		this.listaEspecialidades = new ArrayList<Especialidad>();
		this.especialidad = new Especialidad();
		this.listarAsesor();
		this.listar();
	}
	
	public String nuevaAsesor() {
		this.setAsesor(new Asesor());
		return "asesor.xhtml";
	}
	
	public void insertar() {
		pService.insertar(asesor);
		limpiarAsesor();		
		this.listarAsesor();
	}
	
	public void listarAsesor() {
		listaAsesores = pService.listar();
	}
	
	public void listar() {
		listaEspecialidades = mService.listar();
	}
	
	public void limpiarAsesor() {
		this.init();
	}
	
	public void eliminar(Asesor asesor) {
		pService.eliminar(asesor.getIdAsesor());
		this.listarAsesor();
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
