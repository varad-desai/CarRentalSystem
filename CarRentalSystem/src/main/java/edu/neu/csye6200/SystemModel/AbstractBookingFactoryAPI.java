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
public abstract class AbstractBookingFactoryAPI {
    
    public abstract AbstractBookingAPI getObject(String s, double d);
    
    public abstract AbstractBookingAPI getStringObject(String bookingData);
    
}
