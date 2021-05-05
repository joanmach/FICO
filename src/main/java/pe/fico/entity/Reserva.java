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
@Table(name="reserva")

public class Reserva implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idReserva;
	
	@ManyToOne
	@JoinColumn(name="idCliente",nullable=true)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="idAsesoria",nullable=true)
	private Asesoria asesoria;

	public Reserva() {
		super();
	
	}

	public Reserva(int idReserva, Cliente cliente, Asesoria asesoria) {
		super();
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.asesoria = asesoria;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Asesoria getAsesoria() {
		return asesoria;
	}

	public void setAsesoria(Asesoria asesoria) {
		this.asesoria = asesoria;
	}

	
}
