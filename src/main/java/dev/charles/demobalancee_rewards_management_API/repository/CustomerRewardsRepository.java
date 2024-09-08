package dev.charles.demobalancee_rewards_management_API.repository;

import dev.charles.demobalancee_rewards_management_API.entity.CustomerRewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRewardsRepository extends JpaRepository<CustomerRewards, Long> {
    CustomerRewards findByCustomerId(Long customerId);
}
