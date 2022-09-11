package com.misiontic.tecnofullhelp.services;

import com.misiontic.tecnofullhelp.entities.Transaction;
import com.misiontic.tecnofullhelp.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository){
        this.transactionRepository=transactionRepository;
    }

    //Metodo consulta todos los registros de entidad Transaction
    public List<Transaction> getAllTransaction(){
        return this.transactionRepository.findAll();
    }

    //Metodo crea un nuevo registro en entidad Transaction
    public Transaction createTransaction(Transaction newTransaction){
        return this.transactionRepository.save(newTransaction);
    }

    //Metodo valida si existe un registro por id en entidad Transaction
    public boolean existTransactionById(Long id){
       return this.transactionRepository.existsById(id);
    }

    //Metodo busca un registro por id en entidad Transaction
    public Optional<Transaction> getTransaction(Long id){
        return this.transactionRepository.findById(id);
    }

    //Metodo elimina un registro por id en entidad Transaction
    public void deleteTransaction(Long id){
        this.transactionRepository.deleteById(id);
    }

    //Metodo edita un registro por id en entidad Transaction
    public Transaction updateTransaction(Long id, Transaction transaction){
        Transaction auxTransaction = transactionRepository.findById(id).orElse(null);
        auxTransaction.setConcept(transaction.getConcept());
        auxTransaction.setAmount(transaction.getAmount());
        auxTransaction.setUpdatedAt(transaction.getUpdatedAt());
        transactionRepository.save(auxTransaction);
        return auxTransaction;
    }
}
