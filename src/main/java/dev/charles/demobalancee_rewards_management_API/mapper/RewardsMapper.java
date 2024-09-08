package dev.charles.demobalancee_rewards_management_API.mapper;

import dev.charles.demobalancee_rewards_management_API.dto.CashbackTransactionDTO;
import dev.charles.demobalancee_rewards_management_API.dto.RewardsBalanceDTO;
import dev.charles.demobalancee_rewards_management_API.entity.CashbackTransactions;
import dev.charles.demobalancee_rewards_management_API.entity.CustomerRewards;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RewardsMapper {
    @Mapping(source = "id", target = "customerId")
    RewardsBalanceDTO toRewardsBalanceDTO(CustomerRewards customerRewards);

    @Mapping(source = "id",target = "transactionId")
    CashbackTransactionDTO toCashbackTransactionDTO(CashbackTransactions cashbackTransactions);
}
