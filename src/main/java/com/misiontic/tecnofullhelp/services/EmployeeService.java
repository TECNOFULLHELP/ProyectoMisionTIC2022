package com.misiontic.tecnofullhelp.services;

import com.misiontic.tecnofullhelp.entities.Employee;
import com.misiontic.tecnofullhelp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return (List<Employee>) this.employeeRepository.findAll();
    }
}
