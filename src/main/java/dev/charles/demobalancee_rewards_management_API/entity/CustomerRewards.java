package dev.charles.demobalancee_rewards_management_API.entity;
import dev.charles.demobalancee_rewards_management_API.util.Auditable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "customer_reward", schema = "rewardsAPI")
public class CustomerRewards extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private Long customerId;

    private Double totalCashback;

    private Double currentBalance;
}
