package com.example.RegisterLogin.Service;

import org.springframework.stereotype.Service;

import com.example.RegisterLogin.Dto.EmployeeDto;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Reponse.LoginResponse;

//to get methods in controller  we need add autowire annotation in controller from JPA Repo 
@Service
public interface EmployeeService {

	String addEmployee(EmployeeDto employeeDTO);
	LoginResponse loginEmployee(LoginDTO loginDTO);

}
