package dev.charles.demobalancee_rewards_management_API.entity;
import dev.charles.demobalancee_rewards_management_API.util.Auditable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "customer_reward")
public class CustomerRewards extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private Long customerId;

    private Double totalCashback;

    private Double currentBalance;


    public CustomerRewards() {
        super();

    }


    public CustomerRewards(Long id, Long customerId, Double totalCashback, Double currentBalance) {
        this.id = id;
        this.customerId = customerId;
        this.totalCashback = totalCashback;
        this.currentBalance = currentBalance;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
