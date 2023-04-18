package com.cryptotrading.service.wallet;

import com.cryptotrading.dto.WalletResponseDTO;

import java.util.UUID;

public interface IWalletService {
    WalletResponseDTO getWalletBalance(UUID accountId);
}
