package dev.charles.demobalancee_rewards_management_API.entity;
import dev.charles.demobalancee_rewards_management_API.util.Auditable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "cashback_transactions", schema = "rewardsAPI")
public class CashbackTransactions extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerRewards customerRewards;

    private LocalDate transactionDate;
    private Double amountEarned;
    private String description;
}
