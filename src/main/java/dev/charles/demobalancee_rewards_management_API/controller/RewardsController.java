package dev.charles.demobalancee_rewards_management_API.controller;
import dev.charles.demobalancee_rewards_management_API.dto.CashbackTransactionDTO;
import dev.charles.demobalancee_rewards_management_API.dto.RewardsBalanceDTO;
import dev.charles.demobalancee_rewards_management_API.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/rewards")
public class RewardsController {
    private final RewardsService rewardsService;

    public RewardsController(RewardsService rewardsService) {
        this.rewardsService = rewardsService;
    }

    @GetMapping("/balance")
    public ResponseEntity<RewardsBalanceDTO>getRewardsBalance(@RequestParam Long customerId) {
        RewardsBalanceDTO balance = rewardsService.getRewardsBalance(customerId);
        return ResponseEntity.ok(balance);
    }

    @GetMapping("/history")
    public ResponseEntity<List<CashbackTransactionDTO>>getCashbackTransactions(@RequestParam Long customerId) {
        List<CashbackTransactionDTO> history =rewardsService.getCashbackHistory(customerId);
        return ResponseEntity.ok(history);
    }
}
