package com.imd.exchange.repository;
import org.springframework.stereotype.Repository;
import java.util.Random;

@Repository
public class ExchangeRepository {
    public double fetchExchangeRate() {
        // Simula uma chamada para um serviço de câmbio
        Random random = new Random();
        double rawRate = 1.0 + (10.0 - 1.0) * random.nextDouble();
        return Math.round(rawRate * 10.0) / 10.0; // Retorna um número entre 1.0 e 10.0
    }
}