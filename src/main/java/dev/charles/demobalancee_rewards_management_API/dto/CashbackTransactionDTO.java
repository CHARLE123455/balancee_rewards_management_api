package dev.charles.demobalancee_rewards_management_API.dto;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CashbackTransactionDTO {
    private Long transactionId;
    private LocalDateTime transactionDate;
    private Double amountEarned;
    private String description;
}
