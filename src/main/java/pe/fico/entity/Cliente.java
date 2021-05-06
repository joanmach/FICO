package pe.fico.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Clientesss")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int CCliente;

	@Column(name="ClientenombreCliente", nullable=false, length=30)
	private String clientenombreCliente;
	
	@Column(name="ClientenombreapellidoCliente", nullable=false, length=30)
	private String clientenombreapellidoCliente;
	
	private Date ClientefechaNacCliente;
	
	@Column(name="ClientenumeroDNI", nullable=false, length=8)
	private int clientenumeroDNI;
	
	@Column(name="ClientecorreoCliente", nullable=false, length=30)
	private String ClientecorreoCliente;

	@Column(name="ClientecontraseñaCliente", nullable=false, length=30)
	private String clientecontraseñaCliente;

	
	@ManyToOne
	@JoinColumn(name="idCiudad",nullable=true)
	private Ciudad ciudad;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int cCliente, String clientenombreCliente, String clientenombreapellidoCliente,
			Date clientefechaNacCliente, int clientenumeroDNI, String clientecorreoCliente,
			String clientecontraseñaCliente, Ciudad ciudad) {
		super();
		CCliente = cCliente;
		this.clientenombreCliente = clientenombreCliente;
		this.clientenombreapellidoCliente = clientenombreapellidoCliente;
		ClientefechaNacCliente = clientefechaNacCliente;
		this.clientenumeroDNI = clientenumeroDNI;
		ClientecorreoCliente = clientecorreoCliente;
		this.clientecontraseñaCliente = clientecontraseñaCliente;
		this.ciudad = ciudad;
	}

	public int getCCliente() {
		return CCliente;
	}

	public void setCCliente(int cCliente) {
		CCliente = cCliente;
	}

	public String getClientenombreCliente() {
		return clientenombreCliente;
	}

	public void setClientenombreCliente(String clientenombreCliente) {
		this.clientenombreCliente = clientenombreCliente;
	}

	public String getClientenombreapellidoCliente() {
		return clientenombreapellidoCliente;
	}

	public void setClientenombreapellidoCliente(String clientenombreapellidoCliente) {
		this.clientenombreapellidoCliente = clientenombreapellidoCliente;
	}

	public Date getClientefechaNacCliente() {
		return ClientefechaNacCliente;
	}

	public void setClientefechaNacCliente(Date clientefechaNacCliente) {
		ClientefechaNacCliente = clientefechaNacCliente;
	}

	public int getClientenumeroDNI() {
		return clientenumeroDNI;
	}

	public void setClientenumeroDNI(int clientenumeroDNI) {
		this.clientenumeroDNI = clientenumeroDNI;
	}

	public String getClientecorreoCliente() {
		return ClientecorreoCliente;
	}

	public void setClientecorreoCliente(String clientecorreoCliente) {
		ClientecorreoCliente = clientecorreoCliente;
	}

	public String getClientecontraseñaCliente() {
		return clientecontraseñaCliente;
	}

	public void setClientecontraseñaCliente(String clientecontraseñaCliente) {
		this.clientecontraseñaCliente = clientecontraseñaCliente;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CCliente;
		result = prime * result + ((ClientecorreoCliente == null) ? 0 : ClientecorreoCliente.hashCode());
		result = prime * result + ((ClientefechaNacCliente == null) ? 0 : ClientefechaNacCliente.hashCode());
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((clientecontraseñaCliente == null) ? 0 : clientecontraseñaCliente.hashCode());
		result = prime * result + ((clientenombreCliente == null) ? 0 : clientenombreCliente.hashCode());
		result = prime * result
				+ ((clientenombreapellidoCliente == null) ? 0 : clientenombreapellidoCliente.hashCode());
		result = prime * result + clientenumeroDNI;
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
		Cliente other = (Cliente) obj;
		if (CCliente != other.CCliente)
			return false;
		if (ClientecorreoCliente == null) {
			if (other.ClientecorreoCliente != null)
				return false;
		} else if (!ClientecorreoCliente.equals(other.ClientecorreoCliente))
			return false;
		if (ClientefechaNacCliente == null) {
			if (other.ClientefechaNacCliente != null)
				return false;
		} else if (!ClientefechaNacCliente.equals(other.ClientefechaNacCliente))
			return false;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (clientecontraseñaCliente == null) {
			if (other.clientecontraseñaCliente != null)
				return false;
		} else if (!clientecontraseñaCliente.equals(other.clientecontraseñaCliente))
			return false;
		if (clientenombreCliente == null) {
			if (other.clientenombreCliente != null)
				return false;
		} else if (!clientenombreCliente.equals(other.clientenombreCliente))
			return false;
		if (clientenombreapellidoCliente == null) {
			if (other.clientenombreapellidoCliente != null)
				return false;
		} else if (!clientenombreapellidoCliente.equals(other.clientenombreapellidoCliente))
			return false;
		if (clientenumeroDNI != other.clientenumeroDNI)
			return false;
		return true;
	}



	
	
	
	
	
}
