package com.misiontic.tecnofullhelp.services;

import com.misiontic.tecnofullhelp.dto.EmployeeDto;
import com.misiontic.tecnofullhelp.entities.Employee;
import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    //Metodo consulta todos los registros de entidad Employee
    public List<Employee> getAllEmployee(){
        return this.employeeRepository.findAll();
    }

    //Metodo crea un nuevo registro en entidad Employee
    public Employee createEmployee(EmployeeDto employee){
        try{
            Employee newEmployee = new Employee();
            if(employee.getName().isEmpty()){
                return null;
            }
            newEmployee.setName(employee.getName());
            newEmployee.setEmail(employee.getEmail());
            newEmployee.setEnterprise(employee.getEnterprise());
            newEmployee.setRole(employee.getRole());
            newEmployee.setCreatedAT(LocalDateTime.now());
            return this.employeeRepository.save(newEmployee);

        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    //Metodo valida si existe un registro por id en entidad Employee
    public boolean existByIdEmployee(Long id){
        return this.employeeRepository.existsById(id);
    }

    //Metodo busca un registro por id en entidad Employee
    public Optional<Employee> getEmployee(Long id){
        return this.employeeRepository.findById(id);
    }

    //Metodo elimina un registro por id en entidad Employee
    public void deleteEmployee(Long id){
        this.employeeRepository.deleteById(id);
    }

    //Metodo edita un registro por id en entidad Employee
    public Employee updateEmployee(Long id, EmployeeDto employee){
        Employee auxEmployee= employeeRepository.findById(id).orElse(null);
        auxEmployee.setName(employee.getName());
        auxEmployee.setEmail(employee.getEmail());
        auxEmployee.setRole(employee.getRole());
        auxEmployee.setUpdatedAt(LocalDateTime.now());
        employeeRepository.save(auxEmployee);
        return auxEmployee;
    }
}
