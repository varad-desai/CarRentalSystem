/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author varad
 */
public class Booking extends AbstractBookingAPI{
    
    /**
     * Attributes
     */
    
    private UUID bookingId;
    private UUID lesseeId;
    private UUID carId;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private double fee;
    
    /**
     * Constructors
     */
    
    public Booking(UUID bookingId, UUID lesseeId, UUID carId, 
                LocalDate date, LocalTime startTime, LocalTime endTime,
                float fee) {    
        this.bookingId = bookingId;
        this.lesseeId = lesseeId;
        this.carId = carId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.fee = fee;
    }
    
    /**
     * This constructor takes in String as well as booking fee as inputs
     * this constructor will set the booking fee according as passed to it
     * @param bookingData
     * @param fee_ 
     */
    Booking(String bookingData, double fee_){
        
        UUID booking_id = null;
        UUID lessee_id = null;
        UUID car_id = null;
        LocalDate date_ = null;
        LocalTime start_time = null;
        LocalTime end_time = null;
//        double fee_ = 0.0;
        
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        try (Scanner scLine = new Scanner(bookingData)) {
        
            scLine.useDelimiter(",");

            booking_id = UUID.fromString(scLine.next());
            lessee_id = UUID.fromString(scLine.next());
            car_id = UUID.fromString(scLine.next());
            date_ = LocalDate.parse(scLine.next(), dateFormatter);
            start_time = LocalTime.parse(scLine.next(), timeFormatter);
            end_time = LocalTime.parse(scLine.next(), timeFormatter);
//            fee_ = scLine.nextDouble();
        } catch(Exception e) {
            e.printStackTrace();
	}
        
        this.setBookingId(booking_id);
        this.setLesseeId(lessee_id);
        this.setCarId(car_id);
        this.setDate(date_);
        this.setStartTime(start_time);
        this.setEndTime(end_time);
        this.setFee(fee_);
    }
    
    /**
     * This constructor takes just string input
     * it will consider booking fee as 0.0 by default
     * @param bookingData 
     */
    Booking(String bookingData){
        
        UUID booking_id = null;
        UUID lessee_id = null;
        UUID car_id = null;
        LocalDate date_ = null;
        LocalTime start_time = null;
        LocalTime end_time = null;
        double fee_ = 0.0;
        
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        try (Scanner scLine = new Scanner(bookingData)) {
        
            scLine.useDelimiter(",");
//            System.out.println("A");
            booking_id = UUID.fromString(scLine.next());
//            System.out.println("B");
            lessee_id = UUID.fromString(scLine.next());
//            System.out.println("C");
            car_id = UUID.fromString(scLine.next());
//            System.out.println("D");
            date_ = LocalDate.parse(scLine.next(), dateFormatter);
//            System.out.println("E");
            start_time = LocalTime.parse(scLine.next(), timeFormatter);
//            System.out.println("F");
            end_time = LocalTime.parse(scLine.next(), timeFormatter);
//            System.out.println("G");
            fee_ = scLine.nextDouble();
//            System.out.println("G");
//            fee_ = Double.parseDouble(scLine.next());
        }catch(Exception e) {
            e.printStackTrace();
	}
        
//        System.out.println("....");
        this.setBookingId(booking_id);
//        System.out.println("G");
        this.setLesseeId(lessee_id);
//        System.out.println("G");
        this.setCarId(car_id);
//        System.out.println("G");
        this.setDate(date_);
//        System.out.println("G");
        this.setStartTime(start_time);
//        System.out.println("G");
        this.setEndTime(end_time);
//        System.out.println("G");
        this.setFee(fee_);
//        System.out.println("G");
    }

    /**
     * Getter and Setters
     */
    @Override
    public UUID getBookingId() {
        return bookingId;
    }
    
    @Override
    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public UUID getLesseeId() {
        return lesseeId;
    }

    @Override
    public void setLesseeId(UUID lesseeId) {
        this.lesseeId = lesseeId;
    }

    @Override
    public UUID getCarId() {
        return carId;
    }

    @Override
    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public LocalTime getStartTime() {
        return startTime;
    }

    @Override
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public double getFee() {
        return fee;
    }

    @Override
    public void setFee(double fee) {
        this.fee = fee;
    }
    
    

    /**
     * toString() method of Booking.java class
     * @return 
     */
    @Override
    public String toString() {
        
//        StringBuilder sb = new StringBuilder("Booking: ");
//        
//        sb.append("BookingId: #").append(bookingId.toString());
//        sb.append("LesseeId: #").append(lesseeId.toString());
//        sb.append("CarId: #").append(carId.toString());
//        sb.append("Date: ").append(date.toString());
//        sb.append("start time: ").append(startTime.toString());
//        sb.append("end time: ").append(endTime.toString());
//        sb.append("fee: ").append(String.valueOf(fee));
//        
//        return sb.toString();

        return this.getFee()+ "";
    }
    
    
    
}
