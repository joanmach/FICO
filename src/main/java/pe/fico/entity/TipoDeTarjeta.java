package pe.fico.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipodetarjeta")

public class TipoDeTarjeta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CTipo;
	
	@Column(name="NTipo", nullable=false, length=30)
	private String NTipo;


	public TipoDeTarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCTipo() {
		return CTipo;
	}

	public void setCTipo(int cTipo) {
		CTipo = cTipo;
	}

	public String getNTipo() {
		return NTipo;
	}

	public void setNTipo(String nTipo) {
		NTipo = nTipo;
	}



}
