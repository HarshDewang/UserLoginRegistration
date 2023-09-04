package com.example.RegisterLogin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RegisterLogin.Dto.EmployeeDto;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Reponse.LoginResponse;
import com.example.RegisterLogin.Service.EmployeeService;

@RestController
@CrossOrigin   //must for front end connection
@RequestMapping("api/v1/employee")  //implementation RetFul Api Rquest path
public class EmployeeController {
	 @Autowired
	 private EmployeeService employeeService;
	 
	@PostMapping(path="/save")
	public String saveEmployee(@RequestBody EmployeeDto employeeDTO) {
		String id = employeeService.addEmployee(employeeDTO);
		return id;
	}
	
	@PostMapping(path="/login")
	public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO){
		
		LoginResponse loginResponse =employeeService.loginEmployee(loginDTO);
		return ResponseEntity.ok(loginResponse);
	}
}