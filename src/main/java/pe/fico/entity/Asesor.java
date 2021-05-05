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

	@Column(name="nombreAsesor", nullable=false, length=30)
	private String nombreAsesor;
	
	@Column(name="apellidoAsesor", nullable=false, length=30)
	private String apellidoAsesor;
	
	@Column(name="numeroDNI", nullable=false, length=8)
	private int numeroDNI;
	
	@Column(name="correoAsesor", nullable=false, length=30)
	private String correoAsesor;
	
	@Column(name="contraseñaAsesor", nullable=false, length=30)
	private String contraseñaAsesor;
	
	@ManyToOne
	@JoinColumn(name="idEspecialidad",nullable=true)
	private Especialidad especialidad;

	public Asesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Asesor(int idAsesor, String nombreAsesor, String apellidoAsesor, int numeroDNI, String correoAsesor,
			String contraseñaAsesor, Especialidad especialidad) {
		super();
		this.idAsesor = idAsesor;
		this.nombreAsesor = nombreAsesor;
		this.apellidoAsesor = apellidoAsesor;
		this.numeroDNI = numeroDNI;
		this.correoAsesor = correoAsesor;
		this.contraseñaAsesor = contraseñaAsesor;
		this.especialidad = especialidad;
	}

	public int getIdAsesor() {
		return idAsesor;
	}

	public void setIdAsesor(int idAsesor) {
		this.idAsesor = idAsesor;
	}

	public String getNombreAsesor() {
		return nombreAsesor;
	}

	public void setNombreAsesor(String nombreAsesor) {
		this.nombreAsesor = nombreAsesor;
	}

	public String getApellidoAsesor() {
		return apellidoAsesor;
	}

	public void setApellidoAsesor(String apellidoAsesor) {
		this.apellidoAsesor = apellidoAsesor;
	}
	
	public int getNumeroDNI() {
		return numeroDNI;
	}

	public void setNumeroDNI(int numeroDNI) {
		this.numeroDNI = numeroDNI;
	}

	public String getCorreoAsesor() {
		return correoAsesor;
	}

	public void setCorreoAsesor(String correoAsesor) {
		this.correoAsesor = correoAsesor;
	}
	
	public String getContraseñaAsesor() {
		return contraseñaAsesor;
	}

	public void setContraseñaAsesor(String contraseñaAsesor) {
		this.correoAsesor = contraseñaAsesor;
	}
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
}