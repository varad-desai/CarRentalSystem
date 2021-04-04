/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author varad
 */
public class Lessee extends Person{
    
    /**
     * Attributes
     */
    private UUID lesseeId;
    List<AbstractCarAPI> rentedCars = new ArrayList<AbstractCarAPI>();

    /**
     * Getter and setters
     */
    
    public UUID getLesseeId(  
                ) {
        return lesseeId;
    }

    public void setLesseeId(UUID lesseeId) {
        this.lesseeId = lesseeId;
    }

    public List<AbstractCarAPI> getRentedCars() {
        return rentedCars;
    }

    public void setRentedCars(List<AbstractCarAPI> rentedCars) {
        this.rentedCars = rentedCars;
    }

    /**
     * Constructor of Lessee class
     * @param personId
     * @param name
     * @param licenseNumber
     * @param dateOfBirth
     * @param emailId
     * @param password 
     */
    Lessee(UUID personId, String name, String licenseNumber, LocalDate dateOfBirth, int phoneno, String emailId, String password, UUID lesseeId) {
        super(personId, name, licenseNumber, dateOfBirth, phoneno, emailId, password, "Lessee");
        this.lesseeId = lesseeId;
    }
    
    Lessee(String lessee_data){
        Scanner sc_line = new Scanner(lessee_data);
		
	sc_line.useDelimiter(",");
        
//        UUID personId = UUID.randomUUID();
//        UUID lesseeId = UUID.randomUUID();

//        System.out.println("lessee_data: " + lessee_data);
        
        String personId_string = sc_line.next();
        
//        System.out.println("personId_string: " + personId_string);
        UUID personId = UUID.fromString(personId_string);
        UUID lesseeId = UUID.fromString(sc_line.next());
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
	String lessee_name = sc_line.next();
	String lessee_license_number = sc_line.next();
	LocalDate lessee_dob = LocalDate.parse(sc_line.next(), dateFormatter);
	int lessee_phoneno = sc_line.nextInt();
	String lessee_emailid = sc_line.next();
	String lessee_password = sc_line.next();
		
	sc_line.close();
		
	super.setPersonId(personId);
        this.setLesseeId(lesseeId);
        super.setName(lessee_name);
        super.setLicenseNumber(lessee_license_number);
        super.setDateOfBirth(lessee_dob);
        super.setPhoneno(lessee_phoneno);
        super.setEmailId(lessee_emailid);
        super.setPassword(lessee_password);
        super.setType("Lessee");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lessee: ");
        
        sb.append("#").append(this.getPersonId());
	sb.append(" , LesseeId: ").append(this.getLesseeId());
	sb.append(" ").append(this.getName());
	sb.append(" , dob ").append(this.getDateOfBirth().toString());
	sb.append(" , email id ").append(this.getEmailId());
        sb.append(" , license no ").append(this.getLicenseNumber());
	sb.append(" \n ");
        
        return sb.toString();
    }
    
    
    
    
}
