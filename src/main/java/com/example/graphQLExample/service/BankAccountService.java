package com.example.graphQLExample.service;

import com.example.graphQLExample.model.BankAccount;
import com.example.graphQLExample.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BankAccountService {

    private final BankAccountRepository bankRepo;

    public BankAccountService(BankAccountRepository bankRepo) {
        this.bankRepo = bankRepo;
    }

    public Optional<BankAccount> bankAccount(UUID id){
        return bankRepo.findById(id);
    }

    public List<BankAccount> bankAccounts(){
        return bankRepo.findAll();
    }

    public BankAccount createAccount(BankAccount account){
        return bankRepo.save(account);
    }
    public BankAccount updateAccount(BankAccount account){

        // check if the id is there in the db
        if(bankRepo.existsById(account.getId())){
            return bankRepo.save(account);
        }
        return null;
    }
    public String deleteAccount(UUID id){
        // check if the id is there in the db
        if(bankRepo.existsById(id)){
            bankRepo.deleteById(id);
            return "Account Deleted";
        }
        return "No Account with Such Id";
    }

}
