package pe.fico.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tarjeta")
public class Tarjeta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CTarjeta", nullable = false, length = 16)
	private String CTarjeta;

	@Column(name = "NTitular", nullable = false, length = 30)
	private String NTitular;

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
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CTarjeta == null) ? 0 : CTarjeta.hashCode());
		result = prime * result + ((NTitular == null) ? 0 : NTitular.hashCode());
		result = prime * result + ((entidad == null) ? 0 : entidad.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		if (CTarjeta == null) {
			if (other.CTarjeta != null)
				return false;
		} else if (!CTarjeta.equals(other.CTarjeta))
			return false;
		if (NTitular == null) {
			if (other.NTitular != null)
				return false;
		} else if (!NTitular.equals(other.NTitular))
			return false;
		if (entidad == null) {
			if (other.entidad != null)
				return false;
		} else if (!entidad.equals(other.entidad))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}



	public Tarjeta(String cTarjeta, String nTitular, TipoDeTarjeta tipo, EntidadBancaria entidad) {
		super();
		CTarjeta = cTarjeta;
		NTitular = nTitular;
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

	public void setNTitular(String nNacionalidad) {
		NTitular = nNacionalidad;
	}

	public TipoDeTarjeta gettipo() {
		return tipo;
	}

	public void settipo(TipoDeTarjeta tipo) {
		this.tipo = tipo;
	}

	public EntidadBancaria getEntidad() {
		return entidad;
	}

	public void setEntidad(EntidadBancaria entidad) {
		this.entidad = entidad;
	}
}
