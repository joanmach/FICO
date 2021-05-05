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
@Table(name="Clientess")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idCliente;

	@Column(name="nombreCliente", nullable=false, length=30)
	private String nombreCliente;
	
	@Column(name="apellidoCliente", nullable=false, length=30)
	private String apellidoCliente;
	
	private Date fechaNacCliente;
	
	@Column(name="numeroDNI", nullable=false, length=8)
	private int numeroDNI;
	
	@Column(name="correoCliente", nullable=false, length=30)
	private String correoCliente;

	@Column(name="contraseñaCliente", nullable=false, length=30)
	private String contraseñaCliente;

	
	@ManyToOne
	@JoinColumn(name="idCiudad",nullable=true)
	private Ciudad ciudad;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int idCliente, String nombreCliente, String apellidoCliente, Date fechaNacCliente, int numeroDNI,
			String correoCliente, String contraseñaCliente, Ciudad ciudad) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.fechaNacCliente = fechaNacCliente;
		this.numeroDNI = numeroDNI;
		this.correoCliente = correoCliente;
		this.contraseñaCliente = contraseñaCliente;
		this.ciudad = ciudad;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public Date getFechaNacCliente() {
		return fechaNacCliente;
	}

	public void setFechaNacCliente(Date fechaNacCliente) {
		this.fechaNacCliente = fechaNacCliente;
	}

	public int getNumeroDNI() {
		return numeroDNI;
	}

	public void setNumeroDNI(int numeroDNI) {
		this.numeroDNI = numeroDNI;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public String getContraseñaCliente() {
		return contraseñaCliente;
	}

	public void setContraseñaCliente(String contraseñaCliente) {
		this.contraseñaCliente = contraseñaCliente;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	
	
	
	
	
}
