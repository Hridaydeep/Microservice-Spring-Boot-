package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface AccountsRepository extends JpaRepository<Accounts,Long> {

    /**
     * Finds an account by the given customer ID.
     *
     * @param customerId the ID of the customer
     * @return an {@link Optional} containing the account if found, or an empty optional otherwise
     */
    Optional<Accounts> findByCustomerId(Long customerId);
    /**
     * Deletes the accounts with the given customer id.
     *
     * @param customerId the customer id
     */
    @Transactional // to avoid race condition and if problem arise then rollback
    @Modifying  // to avoid lazy loading
    void deleteByCustomerId(Long customerId);
}
