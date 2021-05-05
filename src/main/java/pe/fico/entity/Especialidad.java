package pe.fico.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Especialidad")

public class Especialidad implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idEspecialidad;

	@Column(name="nombreEspecialidad", nullable=false, length=20)
	private String nombreEspecialidad;
	
	@Column(name="Descripcion", nullable=false, length=50)
	private String Descripcion;
	
	public Especialidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Especialidad(int idEspecialidad, String nombreEspecialidad, String descripcion) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.nombreEspecialidad = nombreEspecialidad;
		Descripcion = descripcion;
	}
	
	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getnombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result + idEspecialidad;
		result = prime * result + ((nombreEspecialidad == null) ? 0 : nombreEspecialidad.hashCode());
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
		Especialidad other = (Especialidad) obj;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		if (idEspecialidad != other.idEspecialidad)
			return false;
		if (nombreEspecialidad == null) {
			if (other.nombreEspecialidad != null)
				return false;
		} else if (!nombreEspecialidad.equals(other.nombreEspecialidad))
			return false;
		return true;
	}
	
	
}