package com.cryptotrading.service.wallet;

import com.cryptotrading.dto.WalletResponseDTO;
import com.cryptotrading.entity.Wallet;
import com.cryptotrading.exception.NotFoundException;
import com.cryptotrading.mapper.WalletMapper;
import com.cryptotrading.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WalletService implements IWalletService{
    private final WalletRepository walletRepository;
    private final WalletMapper walletMapper;

    @Override
    public WalletResponseDTO getWalletBalance(UUID accountId) {
        Wallet wallet = walletRepository.findById(accountId)
                .orElseThrow(() -> new NotFoundException(String.format("Count not found wallet of user %s", accountId)));
        return walletMapper.toResponseDTO(wallet);
    }
}
