/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author varad
 */
public class Driver {
    
    /**
     * MAIN for Back-end demo
     * @param args 
     */
    public static void main(String[] args) {
        
        try {
            CarRentalSystemBase.demo();
        } catch (IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
