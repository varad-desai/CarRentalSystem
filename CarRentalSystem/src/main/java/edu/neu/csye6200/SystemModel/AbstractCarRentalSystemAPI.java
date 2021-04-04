/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author varad
 */
public abstract class AbstractCarRentalSystemAPI {
    
    static CarRentalSystemBase crsbSingleton = null;
        
    public static CarRentalSystemBase getObject() {
        return crsbSingleton == null ? new CarRentalSystemBase() : crsbSingleton;
    }
    
    public abstract void addSystemAdmin(String systemData);
    public abstract List<AbstractPersonAPI> getAllSystemAdmins();
    public abstract SystemAdmin getSystemAdmin(String emailId, String password);
    public abstract void showAllSystemAdmins();
    
    public abstract void addLessee(String lesseeData);
    public abstract List<AbstractPersonAPI> getAllLessees();
    public abstract Lessee getLessee(String emailId, String password);
    public abstract void showAllLessees();
    public abstract void deleteLessee(UUID lesseeId);
    
    public abstract void addRenter(String renterData);
    public abstract List<AbstractPersonAPI> getAllRenters();
    public abstract Renter getRenter(String emailId, String password);
    public abstract void showAllRenters();
    public abstract void deleteRenter(UUID renterId);
    
    public abstract void addCar(String carData);
    public abstract void updateCar(String oldCarData, UUID oldCarId, String newCarData);
    public abstract void deleteCar(String oldCar, UUID carId);
    public abstract List<AbstractCarAPI> getAllCars();
    public abstract void showAllCars();
    public abstract AbstractCarAPI getCar(UUID carId);
    
    public abstract void addBooking(String bookingData);
    public abstract List<AbstractBookingAPI> getAllBookings();
    public abstract void showAllBookings();
    public abstract boolean checkIfBookingIsPossible(String bookingData);
    public abstract void updateBooking(String oldBooking, UUID oldBookingId, String newBooking);
    public abstract void deleteBooking(String oldBooking, UUID bookingId);
}
