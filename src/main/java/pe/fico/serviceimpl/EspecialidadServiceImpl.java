package pe.fico.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.fico.dao.IEspecialidadDao;
import pe.fico.entity.Especialidad;
import pe.fico.service.IEspecialidadService;

public class EspecialidadServiceImpl implements IEspecialidadService, Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private IEspecialidadDao mD;
	
	@Override
	public void insertar(Especialidad especialidad) {
		mD.insertar(especialidad);
	}

	@Override
	public List<Especialidad> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idEspecialidad) {
		mD.eliminar(idEspecialidad);
	}
}