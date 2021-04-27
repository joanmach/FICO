package pe.fico.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ciudadess")
public class Ciudad implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idCiudad;
	
	@Column(name="nombreCiudad", nullable=false, length=30)
	private String nombreCiudad;
	
	@ManyToOne
	@JoinColumn(name="idPais",nullable=false)
	private Pais pais;

	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ciudad(int idCiudad, String nombreCiudad, Pais pais) {
		super();
		this.idCiudad = idCiudad;
		this.nombreCiudad = nombreCiudad;
		this.pais = pais;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCiudad;
		result = prime * result + ((nombreCiudad == null) ? 0 : nombreCiudad.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
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
		Ciudad other = (Ciudad) obj;
		if (idCiudad != other.idCiudad)
			return false;
		if (nombreCiudad == null) {
			if (other.nombreCiudad != null)
				return false;
		} else if (!nombreCiudad.equals(other.nombreCiudad))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		return true;
	}


	
}
