package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.entity.HorarioAsesoria;
import pe.fico.service.IHorarioAsesoriaService;

import pe.fico.entity.Horario;
import pe.fico.service.IHorarioService;

import pe.fico.entity.Asesoria;
import pe.fico.service.IAsesoriaService;

@Named
@RequestScoped

public class HorarioAsesoriaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IHorarioAsesoriaService haService;
	
	@Inject
	private IHorarioService hService;
	
	@Inject
	private IAsesoriaService aService; 
	
	
	private HorarioAsesoria horarioasesoria;
	List<HorarioAsesoria> listaHorariosAsesorias;
	
	private Horario horario;
	List<Horario> listaHorarios;
	
	private Asesoria asesoria;
	List<Asesoria> listaAsesorias;
	
	
	@PostConstruct
	public void init() {
		this.listaHorariosAsesorias = new ArrayList<HorarioAsesoria>();
		this.horarioasesoria= new HorarioAsesoria();
		
		this.listaAsesorias = new ArrayList<Asesoria>();
		this.asesoria= new Asesoria();
		
		this.listaHorarios = new ArrayList<Horario>();
		this.horario= new Horario();
		
		this.listar();
		this.listaAsesorias();
		this.listaHorarios();
	}
	
	public String nuevoHorarioAsesoria() {
		this.setHorarioasesoria(new HorarioAsesoria());
		listaAsesorias=aService.listar();
		listaHorarios=hService.listar();
		return "horarioasesoria.xhtml";
	}
	
	public void insertar() {
		try {
			haService.insertar(horarioasesoria);
			limpiarHorarioAsesoria();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listar() {
		try {
			listaHorariosAsesorias = haService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarHorarioAsesoria() {
		this.init();
	}
	
	public void listaAsesorias() {
		try {
			listaAsesorias = aService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listaHorarios() {
		try {
			listaHorarios = hService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void eliminar(HorarioAsesoria horarioasesoria) {
		haService.eliminar(horarioasesoria.getIdHorarioAsesoria());
		this.listar();
	}

	public HorarioAsesoria getHorarioasesoria() {
		return horarioasesoria;
	}

	public void setHorarioasesoria(HorarioAsesoria horarioasesoria) {
		this.horarioasesoria = horarioasesoria;
	}

	public List<HorarioAsesoria> getListaHorariosAsesorias() {
		return listaHorariosAsesorias;
	}

	public void setListaHorariosAsesorias(List<HorarioAsesoria> listaHorariosAsesorias) {
		this.listaHorariosAsesorias = listaHorariosAsesorias;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public List<Horario> getListaHorarios() {
		return listaHorarios;
	}

	public void setListaHorarios(List<Horario> listaHorarios) {
		this.listaHorarios = listaHorarios;
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
