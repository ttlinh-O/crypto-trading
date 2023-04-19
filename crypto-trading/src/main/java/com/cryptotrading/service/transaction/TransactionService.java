package com.cryptotrading.service.transaction;

import com.cryptotrading.dto.TransactionCreateDTO;
import com.cryptotrading.dto.TransactionResponseDTO;
import com.cryptotrading.dto.WalletResponseDTO;
import com.cryptotrading.entity.Transaction;
import com.cryptotrading.mapper.TransactionMapper;
import com.cryptotrading.repository.TransactionRepository;
import com.cryptotrading.service.wallet.IWalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionService implements ITransactionService{

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;
    private final IWalletService walletService;

    @Override
    public TransactionResponseDTO createTransaction(UUID accountId, TransactionCreateDTO createDTO) {
        WalletResponseDTO walletBalance = walletService.getWalletBalance(accountId);
        // handle check capacity of amount here

        Transaction entity = transactionMapper.toEntity(createDTO);
        Transaction saved = transactionRepository.save(entity);
        return transactionMapper.toResponseDTO(saved);
    }

    @Override
    public List<TransactionResponseDTO> getTransactions(UUID accountId) {
        List<Transaction> allByAccountId = transactionRepository.findAllByAccountId(accountId);
        return transactionMapper.toResponseDTOS(allByAccountId);
    }
}
