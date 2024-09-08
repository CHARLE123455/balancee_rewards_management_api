package dev.charles.demobalancee_rewards_management_API.dto;
import lombok.Data;

@Data
public class RewardsBalanceDTO {
    private Long customerId;
    private Double totalCashback;
    private Double currentBalance;
}
