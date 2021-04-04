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
public class LesseeFactory extends AbstractFactory{
    /**
    * Default constructor for LesseeFactory class
     */
    public LesseeFactory() {
        super();
        // TODO Auto-generated constructor stub
    }
	
    @Override
    public AbstractPersonAPI getObject(String lessee_data) {
		
        AbstractPersonAPI lessee_object = new Lessee(lessee_data);
		
        return lessee_object;
    }
}
