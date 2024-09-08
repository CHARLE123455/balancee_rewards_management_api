package dev.charles.demobalancee_rewards_management_API.service;

import dev.charles.demobalancee_rewards_management_API.dto.CashbackTransactionDTO;
import dev.charles.demobalancee_rewards_management_API.dto.RewardsBalanceDTO;
import dev.charles.demobalancee_rewards_management_API.entity.CashbackTransactions;
import dev.charles.demobalancee_rewards_management_API.entity.CustomerRewards;
import dev.charles.demobalancee_rewards_management_API.mapper.RewardsMapper;
import dev.charles.demobalancee_rewards_management_API.repository.CashbackTransactionsRepository;
import dev.charles.demobalancee_rewards_management_API.repository.CustomerRewardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RewardsService {
    private final CustomerRewardsRepository customerRewardsRepository;
    private final CashbackTransactionsRepository cashbackTransactionsRepository;
    private final RewardsMapper rewardsMapper;

    public RewardsService(CustomerRewardsRepository customerRewardsRepository,
                          CashbackTransactionsRepository cashbackTransactionsRepository,
                          RewardsMapper rewardsMapper) {
        this.customerRewardsRepository = customerRewardsRepository;
        this.cashbackTransactionsRepository = cashbackTransactionsRepository;
        this.rewardsMapper = rewardsMapper;
    }

    public RewardsBalanceDTO getRewardsBalance(Long customerId){
        CustomerRewards customerRewards = customerRewardsRepository.findByCustomerId(customerId);
        return rewardsMapper.toRewardsBalanceDTO(customerRewards);
    }

    public List<CashbackTransactionDTO>getCashbackHistory(Long customerId){
        List<CashbackTransactions> transactions =cashbackTransactionsRepository.findByCustomerRewards_CustomerId(customerId);
        return transactions.stream()
                .map(rewardsMapper::toCashbackTransactionDTO)
                .collect(Collectors.toList());
    }
}
