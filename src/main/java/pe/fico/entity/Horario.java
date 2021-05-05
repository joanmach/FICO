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
	
	private Date DHoraInicio;
	
	private Date DHoraFin;

	public Horario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Horario(int idHorario, Date dFechaInicio, Date dFechaFin, Date dHoraInicio, Date dHoraFin) {
		super();
		this.idHorario = idHorario;
		DFechaInicio = dFechaInicio;
		DFechaFin = dFechaFin;
		DHoraInicio = dHoraInicio;
		DHoraFin = dHoraFin;
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

	public Date getDHoraInicio() {
		return DHoraInicio;
	}

	public void setDHoraInicio(Date dHoraInicio) {
		DHoraInicio = dHoraInicio;
	}

	public Date getDHoraFin() {
		return DHoraFin;
	}

	public void setDHoraFin(Date dHoraFin) {
		DHoraFin = dHoraFin;
	}

	
	
	
}
