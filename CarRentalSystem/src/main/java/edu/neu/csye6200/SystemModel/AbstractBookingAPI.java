/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

/**
 *
 * @author varad
 */
public abstract class AbstractBookingAPI {
    
    public abstract UUID getBookingId();
    public abstract void setBookingId(UUID bookingId);
    public abstract UUID getLesseeId();
    public abstract void setLesseeId(UUID lesseeId);
    public abstract UUID getCarId();
    public abstract void setCarId(UUID carId);
    public abstract LocalDate getDate();
    public abstract void setDate(LocalDate date);
    public abstract LocalTime getStartTime();
    public abstract void setStartTime(LocalTime startTime);
    public abstract LocalTime getEndTime();
    public abstract void setEndTime(LocalTime endTime);
    public abstract double getFee();
    public abstract void setFee(double fee);
    
    public abstract String toString();
    
    
}
