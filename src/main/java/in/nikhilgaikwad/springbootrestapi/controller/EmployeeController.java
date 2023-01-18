package in.nikhilgaikwad.springbootrestapi.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.nikhilgaikwad.springbootrestapi.model.Employee;

//@Controller
@RestController
public class EmployeeController {
	
	//@RequestMapping(value="/employee",method=RequestMethod.GET)
	//@ResponseBody
	@GetMapping("/employee")
	public String getEmployee(){
		return "this is the controller";
	}
	
	@GetMapping("/employee/{id}")
	public String getEmployee(@PathVariable Long id) {
		
		return"fetching the employee details for the id "+id;
	}
	
	@PostMapping("/employee")
	public String saveEmployee(@RequestBody Employee employee) {
		return "saving the employee details to the database" + employee;
		
	}
	
	
	
	
	@DeleteMapping("/employee")
	public String deleteEmployee(@RequestParam Long id) {
		
		return "Delete the employee details for the id "+id;
	}
	
	
	
}
