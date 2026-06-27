package com.airtribe.parkinglot.service;

import com.airtribe.parkinglot.model.ParkingTicket;
import com.airtribe.parkinglot.strategy.FeeStrategy;
import com.airtribe.parkinglot.strategy.HourlyFeeStrategy;

import java.time.Duration;

public class FeeCalculator {

    private FeeStrategy feeStrategy = new HourlyFeeStrategy();

    public double calculateFee(ParkingTicket ticket) {

        long hours = Duration.between(
                ticket.getEntryTime(),
                ticket.getExitTime()).toHours();

        return feeStrategy.calculateFee(hours);
    }
}