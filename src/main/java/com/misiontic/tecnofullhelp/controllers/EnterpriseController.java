package com.misiontic.tecnofullhelp.controllers;

import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.entities.Mensaje;
import com.misiontic.tecnofullhelp.services.EnterpriseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/crearEmpresa")
    public ResponseEntity<Enterprise> createEnterprise(@RequestBody Enterprise enterprise){
        this.enterpriseService.createEnterprise(enterprise);
        return new ResponseEntity(new Mensaje("Registro creado correctamente"), HttpStatus.OK);
    }

    @GetMapping ("/empresa/{id}")
    public ResponseEntity<Enterprise> findEnterprise(@PathVariable("id")Long id){
        if (!enterpriseService.existByIdEnterprise(id)){
            return new ResponseEntity(new Mensaje("La Empresa no existe"), HttpStatus.NOT_FOUND);
        }else{
            Enterprise enterprise = enterpriseService.getEnterprise(id).get();
            return new ResponseEntity(enterprise, HttpStatus.OK);
        }
    }

    @DeleteMapping("/eliminarEmpresa/{id}")
    public ResponseEntity<Enterprise> deleteEnterprise(@PathVariable("id") Long id) {
        if (!enterpriseService.existByIdEnterprise(id)) {
            return new ResponseEntity(new Mensaje("La Empresa no existe"), HttpStatus.NOT_FOUND);
        } else {
                enterpriseService.deleteEnterprise(id);
                return new ResponseEntity(new Mensaje("Registro Eliminado correctamente"), HttpStatus.OK);
        }
    }

    @PatchMapping("/editarEmpresa/{id}")
    public ResponseEntity<Enterprise> updateEnterprise(@PathVariable("id") Long id, @RequestBody Enterprise enterprise){
        if (!enterpriseService.existByIdEnterprise(id)) {
            return new ResponseEntity(new Mensaje("La Empresa no existe"), HttpStatus.NOT_FOUND);
        } else {
            enterpriseService.updateEnterprise(id, enterprise);
            return new ResponseEntity(new Mensaje("Registro Actualizado correctamente"), HttpStatus.OK);
        }
    }

}
