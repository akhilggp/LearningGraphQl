package com.example.graphQLExample.model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "bankAccounts")
@Builder
@Data
public class BankAccount {
    @Id
    UUID id;
    String name;
    Currency currency;
}
