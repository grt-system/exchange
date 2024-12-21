package com.imd.exchange.controller;
import com.imd.exchange.model.ExchangeRate;
import com.imd.exchange.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchange")
public class ExchangeController {
    @Autowired
    private ExchangeService exchangeService;

    @GetMapping
    public ExchangeRate getExchangeRate() {
        return exchangeService.getExchangeRate();
    }
}
