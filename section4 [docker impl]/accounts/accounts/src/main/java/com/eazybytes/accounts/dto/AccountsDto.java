package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data   //will have the getter and setter . So directly we can annotate data
public class AccountsDto {
    @NotEmpty(message = "Account number should not be empty") //validation
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number should be 10 digits") //validation
    private Long accountNumber;
    @NotEmpty(message = "Account type should not be empty") //validation
    private String accountType;
    @NotEmpty(message = "Branch address should not be empty") //validation
    private String branchAddress;

}
