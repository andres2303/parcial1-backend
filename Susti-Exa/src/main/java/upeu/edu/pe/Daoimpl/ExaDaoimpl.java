package upeu.edu.pe.Daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import upeu.edu.pe.Dao.Operaciones;

@Component

public class ExaDaoimpl implements Operaciones{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> readEmpleadosByRegion() {
		String sql="select reg.RegionDescription 'Región',count(*) 'Cantidad de Empleados' from northwind.employeeterritories et \r\n"
				+ "inner join northwind.employees emp on emp.EmployeeID=et.EmployeeID\r\n"
				+ "inner join northwind.territories terri on terri.TerritoryID=et.TerritoryID\r\n"
				+ "inner join northwind.region reg on reg.RegionID=terri.RegionID\r\n"
				+ "group by reg.RegionDescription;";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public List<Map<String, Object>> readClientesbyTerritorio() {
		String sql="select ter.TerritoryDescription 'Territorio', count(*) 'Cantidad Clientes' from northwind.orders ord\r\n"
				+ "inner join northwind.customers cus on cus.CustomerID=ord.CustomerID\r\n"
				+ "inner join northwind.employees emp on emp.EmployeeID=ord.EmployeeID\r\n"
				+ "inner join northwind.employeeterritories terriemp on terriemp.EmployeeID=emp.EmployeeID\r\n"
				+ "inner join northwind.territories ter on ter.TerritoryID=terriemp.TerritoryID\r\n"
				+ "group by ter.TerritoryDescription;";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public List<Map<String, Object>> readOrderByCiudad() {
		String sql="select ShipCity 'Ciudades',count(*) 'Cantidad de Ordenes' from northwind.orders\r\n"
				+ "group by ShipCity;";
		return jdbcTemplate.queryForList(sql);
	}

}


