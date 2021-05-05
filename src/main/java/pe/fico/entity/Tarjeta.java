package pe.fico.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tarjetas")
public class Tarjeta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CTarjeta", nullable = false, length = 16)
	private String CTarjeta;

	@Column(name = "NTitular", nullable = false, length = 30)
	private String NTitular;

	private Date fechaCaducidad;
	
	@ManyToOne
	@JoinColumn(name = "CTipo", nullable = false)
	private TipoDeTarjeta tipo;
	
	@ManyToOne
	@JoinColumn(name = "CEntidad", nullable = false)
	private EntidadBancaria entidad;

	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tarjeta(String cTarjeta, String nTitular, Date fechaCaducidad, TipoDeTarjeta tipo, EntidadBancaria entidad) {
		super();
		CTarjeta = cTarjeta;
		NTitular = nTitular;
		this.fechaCaducidad = fechaCaducidad;
		this.tipo = tipo;
		this.entidad = entidad;
	}

	public String getCTarjeta() {
		return CTarjeta;
	}

	public void setCTarjeta(String cTarjeta) {
		CTarjeta = cTarjeta;
	}

	public String getNTitular() {
		return NTitular;
	}

	public void setNTitular(String nTitular) {
		NTitular = nTitular;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public TipoDeTarjeta getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeTarjeta tipo) {
		this.tipo = tipo;
	}

	public EntidadBancaria getEntidad() {
		return entidad;
	}

	public void setEntidad(EntidadBancaria entidad) {
		this.entidad = entidad;
	}
	
	
	
	
}
