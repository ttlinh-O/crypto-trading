package com.cryptotrading.enums;

import javax.swing.*;

public enum Symbol {
    ETHUSDT("Ethereum"),
    BTCUSDT("Botcoin");

    private String name;

    Symbol(String name) {
        this.name = name;
    }
}
