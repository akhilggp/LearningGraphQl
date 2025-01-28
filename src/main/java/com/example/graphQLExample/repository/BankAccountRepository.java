package com.example.graphQLExample.repository;

import com.example.graphQLExample.model.BankAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BankAccountRepository extends MongoRepository<BankAccount, UUID> {

}
