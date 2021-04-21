package pe.fico.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.fico.dao.IAsesoriaDao;
import pe.fico.entity.Asesoria;
import pe.fico.service.IAsesoriaService;

public class AsesoriaServiceImpl implements IAsesoriaService, Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private IAsesoriaDao mD;
	
	@Override
	public void insertar(Asesoria asesoria) {
		mD.insertar(asesoria);
	}

	@Override
	public List<Asesoria> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idAsesoria) {
		mD.eliminar(idAsesoria);
	}
}
