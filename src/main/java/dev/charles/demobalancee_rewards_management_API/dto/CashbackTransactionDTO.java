package dev.charles.demobalancee_rewards_management_API.dto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


public class CashbackTransactionDTO {
    private Long transactionId;
    private LocalDateTime transactionDate;
    private Double amountEarned;
    private String description;

    public CashbackTransactionDTO(Long transactionId, LocalDateTime transactionDate, Double amountEarned, String description) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.amountEarned = amountEarned;
        this.description = description;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getAmountEarned() {
        return amountEarned;
    }

    public void setAmountEarned(Double amountEarned) {
        this.amountEarned = amountEarned;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
