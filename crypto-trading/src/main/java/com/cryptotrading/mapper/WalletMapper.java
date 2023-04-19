package com.cryptotrading.mapper;

import com.cryptotrading.dto.WalletResponseDTO;
import com.cryptotrading.entity.Wallet;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WalletMapper {
    WalletResponseDTO toResponseDTO(Wallet wallet);
}
