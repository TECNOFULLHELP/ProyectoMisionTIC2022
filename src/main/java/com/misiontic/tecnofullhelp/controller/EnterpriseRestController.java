package com.misiontic.tecnofullhelp.controller;

import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EnterpriseRestController {
    @Autowired
    private IEnterpriseService enterpriseService;

    @GetMapping("/enterprise/{id}")
    public Enterprise finById(@PathVariable int id){return enterpriseService.finByIdId(id); }
    @GetMapping("/enterprise")
    public List<Enterprise> findAll(){return this.enterpriseService.findAll();}

    @PostMapping("/enterprise")
    public Enterprise createEnterprise (@RequestBody Enterprise enterprise) {return this.enterpriseService.createEnterprise(enterprise);}

    @PutMapping("/enterprise")
    public Enterprise updateEnterprise (@RequestBody Enterprise enterprise) {return this.enterpriseService.updateEnterprise(enterprise);}

    @DeleteMapping("/enterprise/{id}")
    public void deleteEnterprise(@PathVariable long id) {this.enterpriseService.deleteEnterprise(id);}

}
