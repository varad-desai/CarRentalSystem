/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.util.UUID;

/**
 *
 * @author varad
 */
public abstract class AbstractCarAPI {
    
    /**
     * APIs
     */
    
    public abstract UUID getCarId();
    public abstract void setCarId(UUID carId);
    public abstract UUID getRenterId();
    public abstract void setRenterId(UUID carId);
    public abstract String getCompany();
    public abstract void setCompany(String company);
    public abstract String getName();
    public abstract void setName(String name);
    public abstract int getNumberOfSeats();
    public abstract void setNumberOfSeats(int numberOfSeats);
    public abstract String getInsuranceCompany();
    public abstract void setInsuranceCompany(String insuranceCompany);
    public abstract int getInsuranceNumber();
    public abstract void setInsuranceNumber(int insuranceNumber);
    public abstract int getRentPerHour();
    public abstract void setRentPerHour(int rentPerHour);
    
    public abstract String toString();
    
}
