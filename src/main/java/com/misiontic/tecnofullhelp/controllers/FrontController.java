package com.misiontic.tecnofullhelp.controllers;

import com.misiontic.tecnofullhelp.dto.EmployeeDto;
import com.misiontic.tecnofullhelp.dto.EnterpriseDto;
import com.misiontic.tecnofullhelp.dto.TransactionDto;
import com.misiontic.tecnofullhelp.entities.Employee;
import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.entities.Transaction;
import com.misiontic.tecnofullhelp.services.EmployeeService;
import com.misiontic.tecnofullhelp.services.EnterpriseService;
import com.misiontic.tecnofullhelp.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class FrontController {

    @Autowired
    private EnterpriseService enterpriseService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    /*METODOS CONTROLLER EMPRESA*/

    @GetMapping("/empresas")
    public String empresas(Model model){
        List<Enterprise> enterpriseList = this.enterpriseService.getAllEnterprise();
        model.addAttribute("empresas", enterpriseList);
        return "empresas";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute EnterpriseDto enterprise, Model model){
        model.addAttribute("enterprise",new Enterprise() );
        return "agregar-empresa";
    }

    @PostMapping("/add")
    public String addEmpresa(@ModelAttribute EnterpriseDto enterprise, Model model){
        this.enterpriseService.createEnterprise(enterprise);
        return "redirect:/empresas";
    }

    @GetMapping("empresa/borrar/{id}")
    private String eliminarEmpresa(@PathVariable("id") Long id){
        enterpriseService.deleteEnterprise(id);
        return "redirect:/empresas";
    }

    @GetMapping("empresa/editar/{id}")
    private String verEmpresaPorId(@PathVariable("id") Long id, Model model){
       Enterprise enterprise = enterpriseService.getEnterprise(id).get();
        model.addAttribute("enterprise", enterprise);
        return "actualizar-empresa";
    }

   @PostMapping("/empresa/{id}")
    private String editarEmpresa(@PathVariable("id") Long id, EnterpriseDto enterprise){
        enterpriseService.updateEnterprise(id,enterprise);
        return "redirect:/empresas";
    }

    /*METODOS CONTROLLER EMPLEADO*/
    @GetMapping("/empleados")
    public String empleados(Model model){
        List<Employee> employeeList = this.employeeService.getAllEmployee();
        model.addAttribute("empleados", employeeList);
        return "empleados";
    }

    @GetMapping("/addEmpleado")
    public String addEmpleado(@ModelAttribute EmployeeDto employee, Model model){
        model.addAttribute("employee",new Employee() );
        List<Enterprise> enterpriseList = this.enterpriseService.getAllEnterprise();
        model.addAttribute("enterprise",enterpriseList);
        return "agregar-empleado";
    }

    @PostMapping("/addEmpleado")
    public String crearEmpleado(@ModelAttribute EmployeeDto employee, Model model){
        this.employeeService.createEmployee(employee);
        return "redirect:/empleados";
    }

    @GetMapping("empleado/borrar/{id}")
    private String eliminarEmpleado(@PathVariable("id") Long id){
        this.employeeService.deleteEmployee(id);
        return "redirect:/empleados";
    }

    @GetMapping("empleado/editar/{id}")
    private String verEmpleadoPorId(@PathVariable("id") Long id, Model model){
        Employee employee = employeeService.getEmployee(id).get();
        model.addAttribute("employee", employee);
        return "actualizar-empleado";
    }

    @PostMapping("/empleado/{id}")
    private String editarEmpleado(@PathVariable("id") Long id, EmployeeDto employee){
        this.employeeService.updateEmployee(id,employee);
        return "redirect:/empleados";
    }


    /*METODOS CONTROLLER TRANSACCION*/
    @GetMapping("/transacciones")
    public String transacciones(Model model){
        List<Transaction> transactionList = this.transactionService.getAllTransaction();
        model.addAttribute("transacciones", transactionList);
        return "transacciones";
    }

    @GetMapping("/addTransaccion")
    public String addTransaccion(@ModelAttribute TransactionDto employee, Model model){
        model.addAttribute("transaction",new Transaction() );
        List<Employee> employeeList = this.employeeService.getAllEmployee();
        model.addAttribute("employee",employeeList);
        return "agregar-transaccion";
    }

    @PostMapping("/addTransaccion")
    public String crearTransaccion(@ModelAttribute TransactionDto transaction, Model model){
        this.transactionService.createTransaction(transaction);
        return "redirect:/transacciones";
    }

    @GetMapping("transaccion/borrar/{id}")
    private String eliminarTransaccion(@PathVariable("id") Long id){
        this.transactionService.deleteTransaction(id);
        return "redirect:/transacciones";
    }

    @GetMapping("transaccion/editar/{id}")
    private String verTransaccionPorId(@PathVariable("id") Long id, Model model){
        Transaction transaction = transactionService.getTransaction(id).get();
        model.addAttribute("transaction", transaction);
        return "actualizar-transaccion";
    }

    @PostMapping("/transaccion/{id}")
    private String editarTransaccion(@PathVariable("id") Long id, TransactionDto transaction){
        this.transactionService.updateTransaction(id,transaction);
        return "redirect:/transacciones";
    }



}
