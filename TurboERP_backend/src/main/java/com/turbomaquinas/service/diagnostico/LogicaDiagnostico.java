package com.turbomaquinas.service.diagnostico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.diagnostico.DetalleDiagnosticoDAO;
import com.turbomaquinas.DAO.diagnostico.DiagnosticoDAO;
import com.turbomaquinas.DAO.diagnostico.EncabezadoDiagnosticoDAO;
import com.turbomaquinas.DAO.diagnostico.JDBCDiagnostico.ActividadProduccion;
import com.turbomaquinas.DAO.diagnostico.SubindiceDiagnosticoDAO;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnosticoVista;
import com.turbomaquinas.POJO.diagnostico.Diagnostico;
import com.turbomaquinas.POJO.diagnostico.DiagnosticoVista;
import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnosticoVista;
import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnosticoVista;

@Service
public class LogicaDiagnostico implements DiagnosticoService {
	
	@Autowired
	DiagnosticoDAO repDiag;
	
	@Autowired
	EncabezadoDiagnosticoDAO repoEncabezado;
	
	@Autowired
	DetalleDiagnosticoDAO repoDetalles;
	
	@Autowired
	SubindiceDiagnosticoDAO repoSubindices;

	@Override
	public DiagnosticoVista crear(Diagnostico d) throws DataAccessException {
		int id = repDiag.crear(d);
		return repDiag.buscar(id);
	}

	@Override
	public Diagnostico actualizar(Diagnostico d) throws DataAccessException {
		return repDiag.actualizar(d);
	}

	@Override
	public DiagnosticoVista buscar(int id) throws DataAccessException {
		return repDiag.buscar(id);
	}

	@Override
	public List<DiagnosticoVista> consultar() throws DataAccessException {
		return repDiag.consultar();
	}

	@Override
	public List<EncabezadoDiagnosticoVista> consultarEncabezados(int id) throws DataAccessException {
		return repoEncabezado.consultarPorDiagnostico(id);
	}

	@Override
	public List<DetalleDiagnosticoVista> consultarDetalles(int id) throws DataAccessException {
		return repoDetalles.consultarPorDiagnostico(id);
	}

	@Override
	public List<SubindiceDiagnosticoVista> consultarSubindices(int id) throws DataAccessException {
		return repoSubindices.consultarPorDiagnostico(id);
	}

	@Override
	public int consultarCantidadEncabezados(int id) throws DataAccessException {
		return repoEncabezado.consultarCantidadporDiagnostico(id);
	}

	@Override
	public DiagnosticoVista buscarDiagnostico(String numeroOrden) throws DataAccessException {
		return repDiag.buscarDiagnostico(numeroOrden);
	}

	@Override
	public List<Integer> aniosRecomendaciones() throws DataAccessException {
		return repDiag.aniosRecomendaciones();
	}

	@Override
	public List<DiagnosticoVista> recomendacionesAnio(int anio) throws DataAccessException {
		return repDiag.recomendacionesAnio(anio);
	}

	@Override
	public List<DiagnosticoVista> buscarDiagnosticoPorOrdenSinAutorizar(int id) throws DataAccessException {
		return repDiag.buscarDiagnosticoPorOrdenSinAutorizar(id);
	}

	@Override
	public List<DiagnosticoVista> buscarPorOrden(int id) throws DataAccessException {
		return repDiag.buscarPorOrden(id);
	}

	@Override
	public List<DetalleDiagnosticoVista> consultarActividadesPendientesAutorizar(int id) throws DataAccessException {
		return repDiag.consultarActividadesPendientesAutorizar(id);
	}

	@Override
	public List<ActividadProduccion> consultarActividadesProduccion(int id) throws DataAccessException {
		return repDiag.consultarActividadesProduccion(id);
	}

}
