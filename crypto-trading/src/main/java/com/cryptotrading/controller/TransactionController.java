package com.cryptotrading.controller;

import com.cryptotrading.dto.TransactionCreateDTO;
import com.cryptotrading.dto.TransactionResponseDTO;
import com.cryptotrading.service.transaction.TransactionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;

    @GetMapping(value = "/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TransactionResponseDTO> getTransactions(@PathVariable(name = "accountId") UUID accountId) {
        return transactionService.getTransactions(accountId);
    }

    @PostMapping(value = "/{accountId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public TransactionResponseDTO createTransaction(@PathVariable(name = "accountId") UUID accountId,
        @Valid @RequestBody TransactionCreateDTO createDTO) {
        return  transactionService.createTransaction(accountId, createDTO);
    }
}
