package com.cryptotrading.dto;

import com.cryptotrading.enums.Symbol;
import com.cryptotrading.enums.TransactionType;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionCreateDTO {
    @NotNull
    private TransactionType transactionType;
    @NotNull
    private Symbol symbol;
    private String description;
    @NotNull
    private BigDecimal amount;
}
