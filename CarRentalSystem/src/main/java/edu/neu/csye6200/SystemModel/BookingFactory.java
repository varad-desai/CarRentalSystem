/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

/**
 *
 * @author varad
 */
public class BookingFactory extends AbstractBookingFactoryAPI{
    
    /**
    * Default constructor for LesseeFactory class
     */
    public BookingFactory() {
        super();
        // TODO Auto-generated constructor stub
    }
	
    @Override
    public AbstractBookingAPI getObject(String booking_data, double bookingFee) {
		
        AbstractBookingAPI booking_object = new Booking(booking_data, bookingFee);
		
        return booking_object;
    }
    
    @Override
    public AbstractBookingAPI getStringObject(String bookingData){
        AbstractBookingAPI booking_object = new Booking(bookingData);
        
        return booking_object;
    }
    
}
