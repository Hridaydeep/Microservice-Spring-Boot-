package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * This method will create a new account for the given customer
     * @param customerDto This is the customer information
     */
    public void createAccount(CustomerDto customerDto);
    public CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);;

    boolean deleteAccount(String mobileNumber);;
}
