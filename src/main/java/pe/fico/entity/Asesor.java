package pe.fico.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name="numeroDNI", nullable=false, length=8)
	private int numeroDNI;
	
	@Column(name="correoAsesor", nullable=false, length=30)
	private String correoAsesor;


	public Asesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asesor(int idAsesor, int numeroDNI, String correoAsesor) {
		super();
		this.idAsesor = idAsesor;
		this.numeroDNI = numeroDNI;
		this.correoAsesor = correoAsesor;
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
	
}