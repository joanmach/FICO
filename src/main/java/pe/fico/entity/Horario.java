package pe.fico.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="horario")
public class Horario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idHorario;
	
	private Date DFechaInicio;
	
	private Date DFechaFin;
	
	//private Date DHoraInicio;
	
	//private Date DHoraFin;

	public Horario() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Horario(int idHorario, Date dFechaInicio, Date dFechaFin) {
		super();
		this.idHorario = idHorario;
		DFechaInicio = dFechaInicio;
		DFechaFin = dFechaFin;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DFechaFin == null) ? 0 : DFechaFin.hashCode());
		result = prime * result + ((DFechaInicio == null) ? 0 : DFechaInicio.hashCode());
		result = prime * result + idHorario;
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
		Horario other = (Horario) obj;
		if (DFechaFin == null) {
			if (other.DFechaFin != null)
				return false;
		} else if (!DFechaFin.equals(other.DFechaFin))
			return false;
		if (DFechaInicio == null) {
			if (other.DFechaInicio != null)
				return false;
		} else if (!DFechaInicio.equals(other.DFechaInicio))
			return false;
		if (idHorario != other.idHorario)
			return false;
		return true;
	}



	public int getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	public Date getDFechaInicio() {
		return DFechaInicio;
	}

	public void setDFechaInicio(Date dFechaInicio) {
		DFechaInicio = dFechaInicio;
	}

	public Date getDFechaFin() {
		return DFechaFin;
	}

	public void setDFechaFin(Date dFechaFin) {
		DFechaFin = dFechaFin;
	}

	
	
	
	
}
