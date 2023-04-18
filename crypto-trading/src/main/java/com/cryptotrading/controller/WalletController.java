package com.cryptotrading.controller;

import com.cryptotrading.dto.WalletResponseDTO;
import com.cryptotrading.service.wallet.IWalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/wallets")
@RequiredArgsConstructor
public class WalletController {

    private final IWalletService walletService;

    @GetMapping(value = "/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public WalletResponseDTO getWalletBalance(@PathVariable(value = "accountId") UUID accountId) {
        return walletService.getWalletBalance(accountId);
    }
}
