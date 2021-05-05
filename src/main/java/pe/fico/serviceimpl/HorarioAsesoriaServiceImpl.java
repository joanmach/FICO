package pe.fico.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.fico.dao.IHorarioAsesoriaDao;
import pe.fico.entity.HorarioAsesoria;
import pe.fico.service.IHorarioAsesoriaService;

@Named
@RequestScoped

public class HorarioAsesoriaServiceImpl implements IHorarioAsesoriaService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IHorarioAsesoriaDao mD;
	
	@Override
	public void insertar(HorarioAsesoria horarioasesoria) {
		mD.insertar(horarioasesoria);
	}

	@Override
	public List<HorarioAsesoria> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idHorarioAsesoria) {
		mD.eliminar(idHorarioAsesoria);
	}

}
