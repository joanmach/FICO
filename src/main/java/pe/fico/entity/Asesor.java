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
@Table(name="Asesor")
public class Asesor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idAsesor;

	@Column(name="Asesornombre", nullable=false, length=30)
	private String asesornombre;
	
	@Column(name="Asesornombreapellido", nullable=false, length=30)
	private String asesornombreapellido;
	
	@Column(name="AsesornumeroDNI", nullable=false, length=8)
	private int asesornumeroDNI;
	
	@Column(name="AsesorncorreoAsesor", nullable=false, length=30)
	private String asesorncorreoAsesor;
	
	@Column(name="AsesorncontraseñaAsesor", nullable=false, length=30)
	private String asesorncontraseñaAsesor;
	
	@ManyToOne
	@JoinColumn(name="idEspecialidad",nullable=true)
	private Especialidad especialidad;

	public Asesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	public Asesor(int idAsesor, String asesornombre, String asesornombreapellido, int asesornumeroDNI,
			String asesorncorreoAsesor, String asesorncontraseñaAsesor, Especialidad especialidad) {
		super();
		this.idAsesor = idAsesor;
		this.asesornombre = asesornombre;
		this.asesornombreapellido = asesornombreapellido;
		this.asesornumeroDNI = asesornumeroDNI;
		this.asesorncorreoAsesor = asesorncorreoAsesor;
		this.asesorncontraseñaAsesor = asesorncontraseñaAsesor;
		this.especialidad = especialidad;
	}




	public int getIdAsesor() {
		return idAsesor;
	}




	public void setIdAsesor(int idAsesor) {
		this.idAsesor = idAsesor;
	}




	public String getAsesornombre() {
		return asesornombre;
	}




	public void setAsesornombre(String asesornombre) {
		this.asesornombre = asesornombre;
	}




	public String getAsesornombreapellido() {
		return asesornombreapellido;
	}




	public void setAsesornombreapellido(String asesornombreapellido) {
		this.asesornombreapellido = asesornombreapellido;
	}




	public int getAsesornumeroDNI() {
		return asesornumeroDNI;
	}




	public void setAsesornumeroDNI(int asesornumeroDNI) {
		this.asesornumeroDNI = asesornumeroDNI;
	}




	public String getAsesorncorreoAsesor() {
		return asesorncorreoAsesor;
	}




	public void setAsesorncorreoAsesor(String asesorncorreoAsesor) {
		this.asesorncorreoAsesor = asesorncorreoAsesor;
	}




	public String getAsesorncontraseñaAsesor() {
		return asesorncontraseñaAsesor;
	}




	public void setAsesorncontraseñaAsesor(String asesorncontraseñaAsesor) {
		this.asesorncontraseñaAsesor = asesorncontraseñaAsesor;
	}




	public Especialidad getEspecialidad() {
		return especialidad;
	}




	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asesorncontraseñaAsesor == null) ? 0 : asesorncontraseñaAsesor.hashCode());
		result = prime * result + ((asesorncorreoAsesor == null) ? 0 : asesorncorreoAsesor.hashCode());
		result = prime * result + ((asesornombre == null) ? 0 : asesornombre.hashCode());
		result = prime * result + ((asesornombreapellido == null) ? 0 : asesornombreapellido.hashCode());
		result = prime * result + asesornumeroDNI;
		result = prime * result + ((especialidad == null) ? 0 : especialidad.hashCode());
		result = prime * result + idAsesor;
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
		Asesor other = (Asesor) obj;
		if (asesorncontraseñaAsesor == null) {
			if (other.asesorncontraseñaAsesor != null)
				return false;
		} else if (!asesorncontraseñaAsesor.equals(other.asesorncontraseñaAsesor))
			return false;
		if (asesorncorreoAsesor == null) {
			if (other.asesorncorreoAsesor != null)
				return false;
		} else if (!asesorncorreoAsesor.equals(other.asesorncorreoAsesor))
			return false;
		if (asesornombre == null) {
			if (other.asesornombre != null)
				return false;
		} else if (!asesornombre.equals(other.asesornombre))
			return false;
		if (asesornombreapellido == null) {
			if (other.asesornombreapellido != null)
				return false;
		} else if (!asesornombreapellido.equals(other.asesornombreapellido))
			return false;
		if (asesornumeroDNI != other.asesornumeroDNI)
			return false;
		if (especialidad == null) {
			if (other.especialidad != null)
				return false;
		} else if (!especialidad.equals(other.especialidad))
			return false;
		if (idAsesor != other.idAsesor)
			return false;
		return true;
	}




}