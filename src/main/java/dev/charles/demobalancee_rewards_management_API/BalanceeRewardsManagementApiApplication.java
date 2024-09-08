package dev.charles.demobalancee_rewards_management_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BalanceeRewardsManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalanceeRewardsManagementApiApplication.class, args);
	}

}
