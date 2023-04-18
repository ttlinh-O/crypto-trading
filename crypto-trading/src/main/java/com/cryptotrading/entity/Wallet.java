package com.cryptotrading.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "wallet")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Wallet {
    @Id
    @Column(name = "account_id")
    private UUID accountId;

    @Column
    private BigDecimal amount;
}
