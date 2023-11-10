package in.ineuron.nitin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.nitin.model.Employee;
import in.ineuron.nitin.service.IEmployeeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	//GET ALL EMPLOYEES :: http://localhost:9999/api/v1/employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return service.findAllEmployees();
	}
	
	//CREATE AN EMPLOYEE :: http://localhost:9999/api/v1/employees
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody  Employee employee) {
		return service.saveEmployee(employee);
	}
}

