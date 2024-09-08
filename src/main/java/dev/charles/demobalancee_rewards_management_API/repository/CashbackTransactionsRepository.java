package dev.charles.demobalancee_rewards_management_API.repository;

import dev.charles.demobalancee_rewards_management_API.entity.CashbackTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CashbackTransactionsRepository extends JpaRepository<CashbackTransactions, Long> {
    List<CashbackTransactions> findByCustomerRewards_CustomerId(Long customerId);
}
