package com.misiontic.tecnofullhelp.services;

import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.repositories.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {
    @Autowired
    private EnterpriseRepository enterpriseRepository;

    public EnterpriseService(EnterpriseRepository enterpriseRepository){
        this.enterpriseRepository=enterpriseRepository;
    }

    //Metodo consulta todos los registros de entidad Enterprise
    public List<Enterprise> getAllEnterprise(){
        return  this.enterpriseRepository.findAll();
    }

    //Metodo crea un nuevo registro en entidad Enterprise
    public Enterprise createEnterprise(Enterprise newEnterprise){
        return this.enterpriseRepository.save(newEnterprise);
    }

    //Metodo valida si existe un registro por id en entidad Enterprise
    public boolean existByIdEnterprise (Long id){
        return enterpriseRepository.existsById(id);
    }

    //Metodo busca un registro por id en entidad Enterprise
    public Optional<Enterprise> getEnterprise(Long id){
        return this.enterpriseRepository.findById(id);
    }

    //Metodo elimina un registro por id en entidad Enterprise
    public void deleteEnterprise(Long id){
        this.enterpriseRepository.deleteById(id);
    }

    //Metodo edita un registro por id en entidad Enterprise
    public Enterprise updateEnterprise(Long id, Enterprise enterprise){
        Enterprise auxEnterprise = enterpriseRepository.findById(id).orElse(null);
        auxEnterprise.setNit(enterprise.getNit());
        auxEnterprise.setName(enterprise.getName());
        auxEnterprise.setAddress(enterprise.getAddress());
        auxEnterprise.setPhone(enterprise.getPhone());
        auxEnterprise.setUpdatedAt(enterprise.getUpdatedAt());
        enterpriseRepository.save(auxEnterprise);
        return auxEnterprise;
    }
}
