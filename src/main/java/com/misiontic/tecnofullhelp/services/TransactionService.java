package com.misiontic.tecnofullhelp.services;

import com.misiontic.tecnofullhelp.entities.Transaction;
import com.misiontic.tecnofullhelp.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransaction(){
        return (List<Transaction>) this.transactionRepository.findAll();
    }
}
