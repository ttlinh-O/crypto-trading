package com.cryptotrading.mapper;

import com.cryptotrading.dto.TransactionCreateDTO;
import com.cryptotrading.dto.TransactionResponseDTO;
import com.cryptotrading.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TransactionMapper {

    Transaction toEntity(TransactionCreateDTO createDTO);
    TransactionResponseDTO toResponseDTO(Transaction transaction);
    List<TransactionResponseDTO> toResponseDTOS(List<Transaction> transactions);
}
