package com.misiontic.tecnofullhelp.controllers;

import com.misiontic.tecnofullhelp.dto.EmployeeDto;
import com.misiontic.tecnofullhelp.entities.Employee;
import com.misiontic.tecnofullhelp.entities.Mensaje;
import com.misiontic.tecnofullhelp.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/empleado/listar")
    public List<Employee> getAllEmployee(){
        return this.employeeService.getAllEmployee();
    }

    @PostMapping("/empleado/crear")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDto newEmployee){
        this.employeeService.createEmployee(newEmployee);
        return new ResponseEntity(new Mensaje("Registro creado correctamente"),HttpStatus.OK);
    }

    @GetMapping("/empleado/buscar/{id}")
    public ResponseEntity<Employee> findEmployee(@PathVariable("id")Long id){
        if(!employeeService.existByIdEmployee(id)){
            return new ResponseEntity(new Mensaje("El Id del empleado No existe"), HttpStatus.NOT_FOUND);
        }else{
            Employee employee = employeeService.getEmployee(id).get();
            return new ResponseEntity(employee,HttpStatus.OK);
        }
    }

    @DeleteMapping("/empleado/eliminar/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable ("id") Long id){
        if(!employeeService.existByIdEmployee(id)){
            return new ResponseEntity(new Mensaje("El empleado no existe"),HttpStatus.NOT_FOUND );
        }else{
            employeeService.deleteEmployee(id);
            return new ResponseEntity(new Mensaje("Registro eliminado correctamente"),HttpStatus.OK);
        }

    }

    @PatchMapping("/empleado/editar/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable ("id") Long id, @RequestBody EmployeeDto employee) {
        if(!employeeService.existByIdEmployee(id)){
            return new ResponseEntity(new Mensaje("El empleado no existe"),HttpStatus.NOT_FOUND);
        }else{
            employeeService.updateEmployee(id,employee);
            return new ResponseEntity(new Mensaje("Registro actualizado correctamente"),HttpStatus.OK);
        }

    }



}
