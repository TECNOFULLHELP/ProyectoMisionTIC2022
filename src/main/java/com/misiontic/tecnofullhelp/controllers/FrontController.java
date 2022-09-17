package com.misiontic.tecnofullhelp.controllers;

import com.misiontic.tecnofullhelp.dto.EnterpriseDto;
import com.misiontic.tecnofullhelp.entities.Employee;
import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.services.EmployeeService;
import com.misiontic.tecnofullhelp.services.EnterpriseService;
import com.misiontic.tecnofullhelp.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/empresas")
    public String empresas(Model model){
        List<Enterprise> enterpriseList = this.enterpriseService.getAllEnterprise();
        model.addAttribute("empresas", enterpriseList);
        return "empresas";
    }

    @GetMapping("/empleados")
    public String empleados(Model model){
        List<Employee> employeeList = this.employeeService.getAllEmployee();
        model.addAttribute("empleados", employeeList);
        return "empleados";
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


    //@RequestMapping(value="/", method = RequestMethod.GET)
}
