package pe.fico.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Paises")
public class Pais implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idPais;
	
	@Column(name="nombrePais", nullable=false, length=30)
	private String nombrePais;

	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pais(int idPais, String nombrePais) {
		super();
		this.idPais = idPais;
		this.nombrePais = nombrePais;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPais;
		result = prime * result + ((nombrePais == null) ? 0 : nombrePais.hashCode());
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
		Pais other = (Pais) obj;
		if (idPais != other.idPais)
			return false;
		if (nombrePais == null) {
			if (other.nombrePais != null)
				return false;
		} else if (!nombrePais.equals(other.nombrePais))
			return false;
		return true;
	}
	
}
