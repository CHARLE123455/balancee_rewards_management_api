package dev.charles.demobalancee_rewards_management_API.dto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class RewardsBalanceDTO {
    private Long customerId;
    private Double totalCashback;
    private Double currentBalance;

    public RewardsBalanceDTO(Long customerId, Double totalCashback, Double currentBalance) {
        this.customerId = customerId;
        this.totalCashback = totalCashback;
        this.currentBalance = currentBalance;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getTotalCashback() {
        return totalCashback;
    }

    public void setTotalCashback(Double totalCashback) {
        this.totalCashback = totalCashback;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }
}
