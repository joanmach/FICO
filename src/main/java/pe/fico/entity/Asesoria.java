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
@Table(name="Asesoria")

public class Asesoria implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idAsesoria;

	@Column(name="nombreAsesoria", nullable=false, length=20)
	private String nombreAsesoria;
	
	@Column(name="precioAsesoria", nullable=false, length=10)
	private int precioAsesoria;
	
	@Column(name="Descripcion", nullable=false, length=50)
	private String Descripcion;
	
	@ManyToOne
	@JoinColumn(name="idAsesor",nullable=true)
	private Asesor asesor;

	public Asesoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asesoria(int idAsesoria, String Descripcion, int precioAsesoria, Asesor asesor) {
		super();
		this.idAsesoria = idAsesoria;
		this.Descripcion = Descripcion;
		this.precioAsesoria = precioAsesoria;
		this.asesor = asesor;
	}

	public int getIdAsesoria() {
		return idAsesoria;
	}

	public void setIdAsesoria(int idAsesoria) {
		this.idAsesoria = idAsesoria;
	}

	public String getnombreAsesoria() {
		return nombreAsesoria;
	}

	public void setNombreAsesoria(String nombreAsesoria) {
		this.nombreAsesoria = nombreAsesoria;
	}
	
	public int getprecioAsesoria() {
		return precioAsesoria;
	}

	public void setprecioAsesoria(int precioAsesoria) {
		this.precioAsesoria = precioAsesoria;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}

	public Asesor getAsesor() {
		return asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}
}
