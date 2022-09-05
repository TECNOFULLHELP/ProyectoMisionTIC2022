package com.misiontic.tecnofullhelp.controllers;

import com.misiontic.tecnofullhelp.entities.Transaction;
import com.misiontic.tecnofullhelp.services.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService){
        this.transactionService=transactionService;
    }

    @GetMapping("/listarTransacciones")
    public List<Transaction> listTransaction(){
        return this.transactionService.getAllTransaction();
    }

}
