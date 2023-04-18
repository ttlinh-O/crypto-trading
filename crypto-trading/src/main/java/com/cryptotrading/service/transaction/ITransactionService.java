package com.cryptotrading.service.transaction;

import com.cryptotrading.dto.TransactionCreateDTO;
import com.cryptotrading.dto.TransactionResponseDTO;

import java.util.List;
import java.util.UUID;

public interface ITransactionService {
    TransactionResponseDTO createTransaction(UUID accountId, TransactionCreateDTO createDTO);
    List<TransactionResponseDTO> getTransactions(UUID accountId);
}
