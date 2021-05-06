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
@Table(name="Asesorias")

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result + ((asesor == null) ? 0 : asesor.hashCode());
		result = prime * result + idAsesoria;
		result = prime * result + ((nombreAsesoria == null) ? 0 : nombreAsesoria.hashCode());
		result = prime * result + precioAsesoria;
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
		Asesoria other = (Asesoria) obj;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		if (asesor == null) {
			if (other.asesor != null)
				return false;
		} else if (!asesor.equals(other.asesor))
			return false;
		if (idAsesoria != other.idAsesoria)
			return false;
		if (nombreAsesoria == null) {
			if (other.nombreAsesoria != null)
				return false;
		} else if (!nombreAsesoria.equals(other.nombreAsesoria))
			return false;
		if (precioAsesoria != other.precioAsesoria)
			return false;
		return true;
	}
}
