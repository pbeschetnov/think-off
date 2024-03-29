package com.geomslayer.models;

import java.util.Locale;

public class ApiResponse {
    private String base;
    private String date;
    private Rate rates;
    private String message;

    public ApiResponse(String base, String date, Rate rates) {
        this.base = base;
        this.date = date;
        this.rates = rates;
    }

    public ApiResponse(String message) {
        this.message = message;
    }

    public String getBase() {
        return base;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public Rate getRates() {
        return rates;
    }

    public void setRates(Rate rates) {
        this.rates = rates;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "{ base: %s, date: %s, rates: %s }", base, date, rates);
    }
}
