package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity        //allocated for the entity table
@Table(name = "accounts")       // will create the table of the name customer  if doesnt exist
@Getter     //will have the getter
@Setter     //will have the getter and setter
@ToString   // will print the object
@AllArgsConstructor //will have the default constructor
@NoArgsConstructor //will have the default constructor
public class Accounts extends BaseEntity{

    @Column(name="customer_id")
    private Long customerId;
    @Id
    @Column(name="account_number")
    private Long accountNumber;
    @Column(name="account_type")
    private String accountType;
    @Column(name="branch_address")
    private String branchAddress;

}
