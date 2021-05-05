package pe.fico.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.entity.TipoDeTarjeta;
import pe.fico.service.ITipoDeTarjetaService;

@Named
@RequestScoped
public class TipoDeTarjetaController implements Serializable {
		
	private static final long serialVersionUID = 1L;
		
	@Inject
	private ITipoDeTarjetaService tService;
	private TipoDeTarjeta tipodetarjeta;
	List<TipoDeTarjeta> listaTipos;
	
	@PostConstruct
	public void init() {
		this.listaTipos = new ArrayList<TipoDeTarjeta>();
		this.tipodetarjeta = new TipoDeTarjeta();
		this.listar();
	}
	
	public String nuevoTipoDeTarjeta() {
		this.setTipodetarjeta(new TipoDeTarjeta());
		return "tipodetarjeta.xhtml";
	}

	public void insertar() {
		try {
			tService.insertar(tipodetarjeta);
			limpiarMedio();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	public void listar() {
		try {
			listaTipos = tService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarMedio() {
		this.init();
	}
	
	public void eliminar(TipoDeTarjeta ti) {
		try {
			tService.eliminar(ti.getCTipo());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}

	public TipoDeTarjeta getTipodetarjeta() {
		return tipodetarjeta;
	}

	public void setTipodetarjeta(TipoDeTarjeta tipodetarjeta) {
		this.tipodetarjeta = tipodetarjeta;
	}

	public List<TipoDeTarjeta> getListaTipos() {
		return listaTipos;
	}

	public void setListaTipos(List<TipoDeTarjeta> listaTipos) {
		this.listaTipos = listaTipos;
	}
	

}
