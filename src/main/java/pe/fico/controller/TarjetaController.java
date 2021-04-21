package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.entity.TipoDeTarjeta; //TipoDeTarjeta
import pe.fico.entity.EntidadBancaria;
import pe.fico.entity.Tarjeta;
import pe.fico.service.IEntidadBancariaService;
import pe.fico.service.ITipoDeTarjetaService;
import pe.fico.service.ITarjetaService;

@Named
@RequestScoped
public class TarjetaController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITarjetaService tService;
	
	@Inject
	private ITipoDeTarjetaService mService;
	
	@Inject
	private IEntidadBancariaService eService;
	
	private Tarjeta tarjeta;
	List<Tarjeta> listaTarjetas;
	
	private EntidadBancaria entidad;
	List<EntidadBancaria> listaEntidades;
	
	private TipoDeTarjeta tipo;
	List<TipoDeTarjeta> listaTipos;
	
	@PostConstruct
	public void init() {
		this.listaTarjetas = new ArrayList<Tarjeta>();
		this.tarjeta = new Tarjeta();
		this.listaEntidades = new ArrayList<EntidadBancaria>();
		this.entidad = new EntidadBancaria();
		this.listaTipos = new ArrayList<TipoDeTarjeta>();
		this.tipo = new TipoDeTarjeta();
		this.listar();
		this.listaEntidades();
		this.listaTipos();
	}
	
	public String nuevoTarjeta() {
		this.setTarjeta(new Tarjeta());
		listaEntidades = eService.listar();
		listaTipos = mService.listar();
		return "tarjeta.xhtml";
	}
	
	public void insertar() {
		try {
			tService.insertar(tarjeta);
			limpiarTarjeta();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void listar() {
		try {
			listaTarjetas = tService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarTarjeta() {
		this.init();
	}

	public void listaEntidades() {
		try {
			listaEntidades = eService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listaTipos() {
		try {
			listaTipos = mService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void eliminar(Tarjeta ta) {
		try {
			tService.eliminar(ta.getCTarjeta());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public List<Tarjeta> getListaTarjetas() {
		return listaTarjetas;
	}

	public void setListaTarjetas(List<Tarjeta> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}

	public EntidadBancaria getEntidad() {
		return entidad;
	}

	public void setEntidad(EntidadBancaria entidad) {
		this.entidad = entidad;
	}

	public List<EntidadBancaria> getListaEntidades() {
		return listaEntidades;
	}

	public void setListaEntidades(List<EntidadBancaria> listaEntidades) {
		this.listaEntidades = listaEntidades;
	}

	public TipoDeTarjeta gettipo() {
		return tipo;
	}

	public void settipo(TipoDeTarjeta tipo) {
		this.tipo = tipo;
	}

	public List<TipoDeTarjeta> getListaTipos() {
		return listaTipos;
	}

	public void setListaTipos(List<TipoDeTarjeta> listaTipos) {
		this.listaTipos = listaTipos;
	}
	
	
}
