package com.misiontic.tecnofullhelp.services;

import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.repositories.EnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseService {

    private EnterpriseRepository enterpriseRepository;

    public EnterpriseService(EnterpriseRepository enterpriseRepository){
        this.enterpriseRepository=enterpriseRepository;
    }

    public List<Enterprise> getAllEnterprise(){
        return  this.enterpriseRepository.findAll();

    }


}
