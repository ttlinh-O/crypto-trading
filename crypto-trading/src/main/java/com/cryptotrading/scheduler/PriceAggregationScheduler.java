package com.cryptotrading.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class PriceAggregationScheduler {

    /**
     * deplay in miliseconds
     */
    @Scheduled(fixedDelay = 10000)
    public void priceAggregation() {

    }
}
