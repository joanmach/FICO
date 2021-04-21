package pe.fico.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.dao.ITipoDeTarjetaDao;
import pe.fico.entity.TipoDeTarjeta;
import pe.fico.service.ITipoDeTarjetaService;

@Named
@RequestScoped
public class TipoDeTarjetaServiceImpl implements ITipoDeTarjetaService, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITipoDeTarjetaDao mD;

	@Override
	public void insertar(TipoDeTarjeta tipo) {
		mD.insertar(tipo);		
	}

	@Override
	public List<TipoDeTarjeta> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CTipo) {
		mD.eliminar(CTipo);		
	}

	
}
