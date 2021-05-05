package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.entity.Especialidad;
import pe.fico.service.IEspecialidadService;

@Named
@RequestScoped

public class EspecialidadController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEspecialidadService pService;
	private Especialidad especialidad;
	List<Especialidad> listaEspecialidades;
	
	@PostConstruct
	public void init() {
		this.listaEspecialidades = new ArrayList<Especialidad>();
		this.especialidad= new Especialidad();
		this.listar();
	}
	
	public String nuevoEspecialidad() {
		this.setEspecialidad(new Especialidad());
		return "especialidad.xhtml";
	}
	
	public void insertar() {
		pService.insertar(especialidad);
		limpiarEspecialidad();
	}
	
	public void listar() {
		listaEspecialidades = pService.listar();
	}
	
	public void limpiarEspecialidad() {
		this.init();
	}
	
	public void eliminar(Especialidad especialidad) {
		pService.eliminar(especialidad.getIdEspecialidad());
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

}