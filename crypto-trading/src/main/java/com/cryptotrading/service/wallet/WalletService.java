package com.cryptotrading.service.wallet;

import com.cryptotrading.dto.WalletResponseDTO;
import com.cryptotrading.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WalletService implements IWalletService{
    private WalletRepository walletRepository;

    @Override
    public WalletResponseDTO getWalletBalance(UUID accountId) {
        return null;
    }
}
