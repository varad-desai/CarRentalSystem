/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

/**
 *
 * @author manish
 */
public class SystemFactory extends AbstractFactory {

    public SystemFactory() {
        super();
    }

    
    @Override
    public AbstractPersonAPI getObject(String system_data) {
        AbstractPersonAPI system_object = new SystemAdmin(system_data);
		
	return system_object;
    }
    
}
