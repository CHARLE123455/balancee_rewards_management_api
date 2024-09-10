package dev.charles.demobalancee_rewards_management_API.entity;
import dev.charles.demobalancee_rewards_management_API.util.Auditable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cashback_transactions")
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

    public CashbackTransactions(long id, CustomerRewards customerRewards, LocalDate transactionDate,
                                Double amountEarned, String description) {
        this.id = id;
        this.customerRewards = customerRewards;
        this.transactionDate = transactionDate;
        this.amountEarned = amountEarned;
        this.description = description;
    }

    public CashbackTransactions() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CustomerRewards getCustomerRewards() {
        return customerRewards;
    }

    public void setCustomerRewards(CustomerRewards customerRewards) {
        this.customerRewards = customerRewards;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
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
