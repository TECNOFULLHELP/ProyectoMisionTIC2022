package com.misiontic.tecnofullhelp.controllers;

import com.misiontic.tecnofullhelp.dto.TransactionDto;
import com.misiontic.tecnofullhelp.entities.Employee;
import com.misiontic.tecnofullhelp.entities.Mensaje;
import com.misiontic.tecnofullhelp.entities.Transaction;
import com.misiontic.tecnofullhelp.services.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService){
        this.transactionService=transactionService;
    }

    @GetMapping("/transaccion/listar")
    public List<Transaction> listTransaction(){
        return this.transactionService.getAllTransaction();
    }

    @PostMapping("/transaccion/crear")
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDto newTransaction){
        this.transactionService.createTransaction(newTransaction);
        return new ResponseEntity(new Mensaje("Registro creado correctamente"), HttpStatus.OK);
    }

    @GetMapping("/transaccion/buscar/{id}")
    public ResponseEntity<Transaction> findTransaction(@PathVariable("id")Long id){
        if(!transactionService.existTransactionById(id)){
            return new ResponseEntity(new Mensaje("La transacción No existe"), HttpStatus.NOT_FOUND);
        }else{
            Transaction transaction = transactionService.getTransaction(id).get();
            return new ResponseEntity(transaction,HttpStatus.OK);
        }
    }

    @DeleteMapping("/transaccion/eliminar/{id}")
    public ResponseEntity<Transaction> deleteTransaction(@PathVariable ("id") Long id){
        if(!transactionService.existTransactionById(id)){
            return new ResponseEntity(new Mensaje("La transacción no existe"),HttpStatus.NOT_FOUND );
        }else{
            transactionService.deleteTransaction(id);
            return new ResponseEntity(new Mensaje("Registro eliminado correctamente"),HttpStatus.OK);
        }

    }

    @PatchMapping("/transaccion/editar/{id}")
    public ResponseEntity<Transaction> updateTransaction(@PathVariable ("id") Long id, @RequestBody TransactionDto transaction) {
        if(!transactionService.existTransactionById(id)){
            return new ResponseEntity(new Mensaje("La transaccion no existe"),HttpStatus.NOT_FOUND);
        }else{
            transactionService.updateTransaction(id,transaction);
            return new ResponseEntity(new Mensaje("Registro actualizado correctamente"),HttpStatus.OK);
        }

    }

}
