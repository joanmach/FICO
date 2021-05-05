package pe.fico.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="horarioasesoria")

public class HorarioAsesoria implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idHorarioAsesoria;
	
	@ManyToOne
	@JoinColumn(name="idHorario",nullable=true)
	private Horario horario;
	
	@ManyToOne
	@JoinColumn(name="idAsesoria",nullable=true)
	private Asesoria asesoria;

	public HorarioAsesoria() {
		super();
	
	}

	
	public HorarioAsesoria(int idHorarioAsesoria, Horario horario, Asesoria asesoria) {
		super();
		this.idHorarioAsesoria = idHorarioAsesoria;
		this.horario = horario;
		this.asesoria = asesoria;
	}


	public int getIdHorarioAsesoria() {
		return idHorarioAsesoria;
	}

	public void setIdHorarioAsesoria(int idHorarioAsesoria) {
		this.idHorarioAsesoria = idHorarioAsesoria;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Asesoria getAsesoria() {
		return asesoria;
	}

	public void setAsesoria(Asesoria asesoria) {
		this.asesoria = asesoria;
	}

	

	
}
