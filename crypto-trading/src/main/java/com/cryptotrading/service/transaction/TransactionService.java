package com.cryptotrading.service.transaction;

import com.cryptotrading.dto.TransactionCreateDTO;
import com.cryptotrading.dto.TransactionResponseDTO;
import com.cryptotrading.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionService implements ITransactionService{

    private final TransactionRepository transactionRepository;

    @Override
    public TransactionResponseDTO createTransaction(UUID accountId, TransactionCreateDTO createDTO) {
        return null;
    }

    @Override
    public List<TransactionResponseDTO> getTransactions(UUID accountId) {
        return null;
    }
}
