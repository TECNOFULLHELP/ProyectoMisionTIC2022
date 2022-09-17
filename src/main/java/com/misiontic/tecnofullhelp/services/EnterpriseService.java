package com.misiontic.tecnofullhelp.services;

import com.misiontic.tecnofullhelp.dto.EnterpriseDto;
import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.repositories.EnterpriseRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {

    private final EnterpriseRepository enterpriseRepository;

    public EnterpriseService(EnterpriseRepository enterpriseRepository){
        this.enterpriseRepository=enterpriseRepository;
    }

    //Metodo consulta todos los registros de entidad Enterprise
    public List<Enterprise> getAllEnterprise(){
        return  this.enterpriseRepository.findAll();
    }

    //Metodo crea un nuevo registro en entidad Enterprise
    public Enterprise createEnterprise(EnterpriseDto enterprise){
        try{
            Enterprise newEnterprise = new Enterprise();
            if(enterprise.getName().isEmpty()){
                return null;
            }
            newEnterprise.setAddress(enterprise.getAddress());
            newEnterprise.setNit(enterprise.getNit());
            newEnterprise.setName(enterprise.getName());
            newEnterprise.setPhone(enterprise.getPhone());
            newEnterprise.setCreatedAT(LocalDate.now());
            return this.enterpriseRepository.save(newEnterprise);

        }catch (Exception e){
            System.out.println(e);
            return null;
        }
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
    public Enterprise updateEnterprise(Long id, EnterpriseDto enterprise){
        Enterprise auxEnterprise = enterpriseRepository.findById(id).orElse(null);
        auxEnterprise.setNit(enterprise.getNit());
        auxEnterprise.setName(enterprise.getName());
        auxEnterprise.setAddress(enterprise.getAddress());
        auxEnterprise.setPhone(enterprise.getPhone());
        auxEnterprise.setUpdatedAt(LocalDate.now());
        enterpriseRepository.save(auxEnterprise);
        return auxEnterprise;
    }
}
