package com.misiontic.tecnofullhelp.controllers;

import com.misiontic.tecnofullhelp.entities.Employee;
import com.misiontic.tecnofullhelp.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/listarEmpleados")
    public List<Employee> getAllEmployee(){
        return this.employeeService.getAllEmployee();
    }



}
