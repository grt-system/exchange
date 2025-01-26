package com.imd.exchange.service;

import com.imd.exchange.exception.FailureException;
import org.springframework.stereotype.Service;
import com.imd.exchange.model.Failure;

import java.util.Random;

@Service
public class FailureService {

    private final Failure failure;
    private boolean isCrashed = false;

    public FailureService() {
        this.failure = new Failure("Crash", 0.1, 0);
    }

    /**
     * Simula a falha com base na probabilidade definida.
     */
    public void simulateFailure() {
        if (isCrashed) {
            throw new FailureException("Falha de Crash ocorreu.");
        }

        Random random = new Random();
        if (random.nextDouble() < failure.getProbability()) {
            isCrashed = true;
            throw new FailureException("Falha de Crash ocorreu.");
        }
    }

    /**
     * Reseta o estado de falha.
     */
    public void resetFailure() {
        isCrashed = false;
    }
}
