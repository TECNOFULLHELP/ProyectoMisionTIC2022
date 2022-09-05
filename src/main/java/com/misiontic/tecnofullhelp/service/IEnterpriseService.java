package com.misiontic.tecnofullhelp.service;

import com.misiontic.tecnofullhelp.entities.Enterprise;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEnterpriseService {
    public Enterprise finByIdId(int id);

    public List<Enterprise> findAll();


    public Enterprise createEnterprise(Enterprise enterprise);

    public Enterprise updateEnterprise(Enterprise enterprise);

    public void deleteEnterprise(long id);
}
