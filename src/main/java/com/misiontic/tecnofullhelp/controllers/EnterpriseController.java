package com.misiontic.tecnofullhelp.controllers;

import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.services.EnterpriseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EnterpriseController {
    private EnterpriseService enterpriseService;

    public EnterpriseController(EnterpriseService enterpriseService){
        this.enterpriseService = enterpriseService;
    }

    @GetMapping("/listarEmpresas")
    public List<Enterprise> listEnterprise(){
        return this.enterpriseService.getAllEnterprise();
    }


}
