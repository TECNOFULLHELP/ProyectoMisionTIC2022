package com.misiontic.tecnofullhelp.repositories;

import com.misiontic.tecnofullhelp.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {

}
