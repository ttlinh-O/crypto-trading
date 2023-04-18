package com.cryptotrading.dto;

import com.cryptotrading.enums.Symbol;
import com.cryptotrading.enums.TransactionType;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionResponseDTO {
    private UUID id;
    private TransactionType transactionType;
    private Date transactionDate;
    private Symbol symbol;
    private String description;
    private BigDecimal amount;
}
