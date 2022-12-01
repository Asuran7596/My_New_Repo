package com.venkydemo.spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.sym.Name;
import com.venkydemo.spring.Service.Employee;
@RestController
public class Test2App {
	
	@GetMapping("/Test_two/")
	public void Employee() {
		Employee employe=new Employee();
		employe.setId(1);
		employe.setName("venky");
		employe.setSal(2000);
		System.out.println("employee details"+ employe);
		return;
	}

}
