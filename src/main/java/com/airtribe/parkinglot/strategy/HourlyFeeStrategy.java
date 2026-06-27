package com.airtribe.parkinglot.strategy;

public class HourlyFeeStrategy implements FeeStrategy {

    private static final double RATE_PER_HOUR = 50.0;

    @Override
    public double calculateFee(long hours) {

        if (hours <= 0) {
            hours = 1;
        }

        return hours * RATE_PER_HOUR;
    }
}