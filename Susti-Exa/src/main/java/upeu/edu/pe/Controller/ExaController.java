package upeu.edu.pe.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.Service.ExaService;

@RestController
@RequestMapping("/apis/parcial1")
@CrossOrigin({"*"})
public class ExaController {
	
	@Autowired
	private ExaService exaService;
	
	@GetMapping("/empregi")
	public List<Map<String, Object>> readEmpleadosByRegion(){
		return exaService.readEmpleadosByRegion();
	};
	
	@GetMapping("/cliterri")
	public List<Map<String, Object>> readClientesbyTerritorio(){
		return exaService.readClientesbyTerritorio();
	};
	
	@GetMapping("/orcity")
	public List<Map<String, Object>> readOrderByCiudad(){
		return exaService.readOrderByCiudad();
	};

}
