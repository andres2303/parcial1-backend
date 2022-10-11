package upeu.edu.pe.Dao;

import java.util.List;
import java.util.Map;

public interface Operaciones {

	List<Map<String, Object>> readEmpleadosByRegion();
	List<Map<String, Object>> readClientesbyTerritorio();
	List<Map<String, Object>> readOrderByCiudad();
}
