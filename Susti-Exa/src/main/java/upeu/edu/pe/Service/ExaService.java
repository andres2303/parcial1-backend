package upeu.edu.pe.Service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.Daoimpl.ExaDaoimpl;


@Service
public class ExaService implements Operaciones{
	
	@Autowired
	private ExaDaoimpl examensitodaoimpl;

	@Override
	public List<Map<String, Object>> readEmpleadosByRegion() {
		// TODO Auto-generated method stub
		return examensitodaoimpl.readEmpleadosByRegion();
	}

	@Override
	public List<Map<String, Object>> readClientesbyTerritorio() {
		// TODO Auto-generated method stub
		return examensitodaoimpl.readClientesbyTerritorio();
	}

	@Override
	public List<Map<String, Object>> readOrderByCiudad() {
		// TODO Auto-generated method stub
		return examensitodaoimpl.readOrderByCiudad();
	}

}
