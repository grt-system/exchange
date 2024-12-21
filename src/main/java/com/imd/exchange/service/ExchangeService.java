package com.imd.exchange.service;

import com.imd.exchange.model.ExchangeRate;
import com.imd.exchange.repository.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeService {
    @Autowired
    private ExchangeRepository exchangeRepository;

    public ExchangeRate getExchangeRate() {
        double rate = exchangeRepository.fetchExchangeRate();
        return new ExchangeRate(rate);
    }
}