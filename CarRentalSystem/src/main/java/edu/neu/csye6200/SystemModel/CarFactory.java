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
public class CarFactory extends AbstractCarFactoryAPI{

    /**
    * Default constructor for LesseeFactory class
     */
    public CarFactory() {
        super();
        // TODO Auto-generated constructor stub
    }
	
    @Override
    public AbstractCarAPI getObject(String car_data) {
		
        AbstractCarAPI car_object = new Car(car_data);
		
        return car_object;
    }
    
    
}
