package pe.fico.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Especialidadessss")

public class Especialidad implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idEspecialidad;

	@Column(name="nombreEspecialidad", nullable=false, length=20)
	private String nombreEspecialidad;
	
	@Column(name="TDescripcion", nullable=false, length=50)
	private String TDescripcion;
	
	public Especialidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Especialidad(int idEspecialidad, String nombreEspecialidad, String tDescripcion) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.nombreEspecialidad = nombreEspecialidad;
		TDescripcion = tDescripcion;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public String getTDescripcion() {
		return TDescripcion;
	}

	public void setTDescripcion(String tDescripcion) {
		TDescripcion = tDescripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TDescripcion == null) ? 0 : TDescripcion.hashCode());
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
		if (TDescripcion == null) {
			if (other.TDescripcion != null)
				return false;
		} else if (!TDescripcion.equals(other.TDescripcion))
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