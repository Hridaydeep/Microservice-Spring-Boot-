package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.entity.Accounts;

public class AccountsMapper {

    /**
     * Maps the given {@link Accounts} entity to the given {@link AccountsDto} instance.
     * <p>
     * This method sets the account number, account type and branch address of the given
     * {@link AccountsDto} instance to the respective values of the given {@link Accounts}
     * entity.
     *
     * @param accounts the {@link Accounts} entity to map from
     * @param accountsDto the {@link AccountsDto} instance to map to
     * @return the given {@link AccountsDto} instance with the mapped values
     */
    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
