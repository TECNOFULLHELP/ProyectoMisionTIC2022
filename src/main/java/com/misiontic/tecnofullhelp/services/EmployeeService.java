package com.misiontic.tecnofullhelp.services;

import com.misiontic.tecnofullhelp.entities.Employee;
import com.misiontic.tecnofullhelp.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public List<Employee> getAllEmployee(){
        return this.employeeRepository.findAll();
    }
}
