package pe.fico.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Asesoria_Cliente")

public class Asesoria_Cliente implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idAsesoria;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idCliente;

	private Date fechaAC;
	
	
	@ManyToOne
	@JoinColumn(name="idCliente",nullable=true)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="idAsesoria",nullable=true)
	private Asesoria asesoria;

	public Asesoria_Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asesoria_Cliente(int idAsesoria,int idCliente, Date fechaAC, Cliente cliente, Asesoria asesoria) {
		super();
		this.idAsesoria = idAsesoria;
		this.idCliente=idCliente;
		this.fechaAC= fechaAC;
		this.cliente=cliente;
		this.asesoria=asesoria;
	}

	
	

	public int getIdAsesoria() {
		return idAsesoria;
	}

	public void setIdAsesoria(int idAsesoria) {
		this.idAsesoria = idAsesoria;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public Date getFechaAC() {
		return fechaAC;
	}

	public void setFechaAC(Date fechaAC) {
		this.fechaAC = fechaAC;
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
