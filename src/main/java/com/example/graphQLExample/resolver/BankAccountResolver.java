package com.example.graphQLExample.resolver;

import com.example.graphQLExample.model.BankAccount;
import com.example.graphQLExample.model.Currency;
import com.example.graphQLExample.service.BankAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Slf4j
@Controller
public class BankAccountResolver{

    private final BankAccountService service;

    public BankAccountResolver(BankAccountService service) {
        this.service = service;
    }


    @QueryMapping
    public BankAccount bankAccount(@Argument UUID id){
        log.info("Bank Account Details: {}",id);

        return service.bankAccount(id).orElse(null);
    }

    @QueryMapping
    public List<BankAccount> bankAccounts(){
        return service.bankAccounts();
    }

    @MutationMapping
    public BankAccount createAccount(@Argument UUID id, @Argument String name, @Argument Currency currency){

        return service.createAccount(
                BankAccount.builder()
                        .id(id)
                        .name(name)
                        .currency(currency)
                        .build()
        );
    }

    @MutationMapping
    public String updateAccount(@Argument UUID id, @Argument String name, @Argument Currency currency){

        BankAccount account = service.updateAccount(
                BankAccount.builder()
                        .id(id)
                        .name(name)
                        .currency(currency)
                        .build()
        );
        if( account == null )
            return "Account cannot be Updated as an Id is not found";
        return "Account Updated Successfully";
    }

    @MutationMapping
    public String deleteAccount(@Argument UUID id){
        return service.deleteAccount(id);
    }
}
