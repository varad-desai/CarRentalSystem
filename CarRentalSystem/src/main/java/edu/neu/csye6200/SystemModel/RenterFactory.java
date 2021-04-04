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
public class RenterFactory extends AbstractFactory{
    /**
     * Default constructor for LesseeFactory class
     */
    public RenterFactory() {
	super();
	// TODO Auto-generated constructor stub
    }
	
    @Override
    public AbstractPersonAPI getObject(String renter_data) {
		
	AbstractPersonAPI renter_object = new Renter(renter_data);
		
	return renter_object;
    }
}
