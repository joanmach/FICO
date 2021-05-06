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
@Table(name="Asesoressss")
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




}