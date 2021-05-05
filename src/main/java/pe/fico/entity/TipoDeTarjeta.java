package pe.fico.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipodetarjetas")

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CTipo;
		result = prime * result + ((NTipo == null) ? 0 : NTipo.hashCode());
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
		TipoDeTarjeta other = (TipoDeTarjeta) obj;
		if (CTipo != other.CTipo)
			return false;
		if (NTipo == null) {
			if (other.NTipo != null)
				return false;
		} else if (!NTipo.equals(other.NTipo))
			return false;
		return true;
	}



}
