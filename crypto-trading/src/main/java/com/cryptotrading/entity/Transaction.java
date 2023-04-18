package com.cryptotrading.entity;


import com.cryptotrading.enums.Symbol;
import com.cryptotrading.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "transaction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Transaction {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column(name = "account_id")
    private UUID accountId;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "transaction_type")
    private TransactionType transactionType;

    @Column(name = "transaction_date")
    private Date transactionDate;

    @Enumerated(EnumType.ORDINAL)
    @Column
    private Symbol symbol;

    @Column
    private String description;

    @Column
    private BigDecimal amount;
}
