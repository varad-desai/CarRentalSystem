/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author manish
 */
public class SystemAdmin extends Person {
    /**
     * Attributes
     */
    private UUID systemAdminId;

    /**
     * Getter and setters
     */
    
    public UUID getSystemAdminId() {
        return systemAdminId;
    }

    public void setSystemAdminId(UUID systemId) {
        this.systemAdminId = systemId;
    }


    /**
     * Constructor of System class
     * @param personId
     * @param name
     * @param dateOfBirth
     * @param emailId
     * @param password 
     */
    SystemAdmin(UUID personId, String name, LocalDate dateOfBirth, int phoneno, String emailId, String password, UUID lesseeId) {
        super(personId, name, null, dateOfBirth, phoneno, emailId, password, "System");
        this.systemAdminId = systemAdminId;
    }
    
    SystemAdmin(String lessee_data){
        Scanner sc_line = new Scanner(lessee_data);
		
	sc_line.useDelimiter(",");
        
        UUID personId = UUID.fromString(sc_line.next());
        UUID systemId = UUID.fromString(sc_line.next());
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
	String lessee_name = sc_line.next();
	String lessee_license_number = null;
	LocalDate lessee_dob = LocalDate.parse(sc_line.next(), dateFormatter);
	int lessee_phoneno = sc_line.nextInt();
	String lessee_emailid = sc_line.next();
	String lessee_password = sc_line.next();
		
	sc_line.close();
		
	super.setPersonId(personId);
        this.setSystemAdminId(systemId);
        super.setName(lessee_name);
        super.setLicenseNumber(lessee_license_number);
        super.setDateOfBirth(lessee_dob);
        super.setPhoneno(lessee_phoneno);
        super.setEmailId(lessee_emailid);
        super.setPassword(lessee_password);
        super.setType("System");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("System: ");
        
        sb.append("#").append(this.getPersonId());
	sb.append(" ").append(this.getSystemAdminId());
	sb.append(" ").append(this.getName());
	sb.append(" , dob ").append(this.getDateOfBirth().toString());
	sb.append(" , email id ").append(this.getEmailId());
        sb.append(" , license no ").append(this.getLicenseNumber());
	sb.append(" \n ");
        
        return sb.toString();
    }
}
