package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity        //allocated for the entity table
@Table(name = "customer")       // will create the table of the name customer  if doesnt exist
@Getter     //will have the getter
@Setter     //will have the getter and setter
@ToString   // will print the object
@AllArgsConstructor //will have the default constructor
@NoArgsConstructor //will have the default constructor
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id") // here SQL: customer_id is equal to java: customerId
    // BUT as  ref I am mentioning it
    private Long customerId;
    private String name;
    private String email;
    @Column(name="mobile_number")
    private String mobileNumber;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
