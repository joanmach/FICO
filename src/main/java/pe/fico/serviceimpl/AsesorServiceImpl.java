package pe.fico.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.fico.dao.IAsesorDao;
import pe.fico.entity.Asesor;
import pe.fico.service.IAsesorService;

public class AsesorServiceImpl implements IAsesorService, Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private IAsesorDao mD;
	
	@Override
	public void insertar(Asesor asesor) {
		mD.insertar(asesor);
	}

	@Override
	public List<Asesor> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idAsesor) {
		mD.eliminar(idAsesor);
	}
}
