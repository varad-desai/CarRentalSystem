/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author varad
 */
public abstract class AbstractPersonAPI {
    
    /**
     * APIs
     */
        
    public abstract UUID getPersonId();
    public abstract void setPersonId(UUID personId);
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getLicenseNumber();
    public abstract void setLicenseNumber(String licenseNumber);
    public abstract LocalDate getDateOfBirth();
    public abstract void setDateOfBirth(LocalDate dateOfBirth);
    public abstract String getEmailId();
    public abstract void setEmailId(String emailId);
    public abstract String getPassword();
    public abstract void setPassword(String password);
    public abstract String getType();
    public abstract void setType(String type);
    
    public abstract String toString();
    
}
