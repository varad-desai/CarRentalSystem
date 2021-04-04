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
 * @author varad
 */
public class Renter extends Person {
    
    /**
     * Attributes
     */
    private UUID renterId;
//    List<AbstractCarAPI> listedCars = new ArrayList<AbstractCarAPI>();

    /**
     * Getter and setters
     */
    
    public UUID getRenterId() {
        return renterId;
    }

    public void setRenterId(UUID renterId) {
        this.renterId = renterId;
    }

//    public List<AbstractCarAPI> getListedCars() {
//        return listedCars;
//    }
//
//    public void setListedCars(List<AbstractCarAPI> listedCars) {
//        this.listedCars = listedCars;
//    }
    
    /**
     * Constructor of Renter class
     * @param personId
     * @param name
     * @param licenseNumber
     * @param dateOfBirth
     * @param emailId
     * @param password 
     */
    Renter(  UUID personId, String name, String licenseNumber, 
                    LocalDate dateOfBirth, int phoneno, String emailId, String password, 
                    UUID renterId) {
        super(personId, name, licenseNumber, dateOfBirth, phoneno, emailId, password, "Renter");
        this.renterId = renterId;
    }
    
    Renter(String renter_data){
        Scanner sc_line = new Scanner(renter_data);
		
	sc_line.useDelimiter(",");
        
//        UUID personId = UUID.randomUUID();
//        UUID renterId = UUID.randomUUID();

        UUID personId = UUID.fromString(sc_line.next());
        UUID renterId = UUID.fromString(sc_line.next());
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
//        System.out.println("A");
	String renter_name = sc_line.next();
//        System.out.println("B");
	String renter_license_number = sc_line.next();
//        System.out.println("C");
	LocalDate renter_dob = LocalDate.parse(sc_line.next(), dateFormatter);
//        System.out.println("D");
	int renter_phoneno = sc_line.nextInt();
//        System.out.println("E");
	String renter_emailid = sc_line.next();
//        System.out.println("F");
	String renter_password = sc_line.next();
//        System.out.println("G");
		
	sc_line.close();
		
	super.setPersonId(personId);
        this.setRenterId(renterId);
        super.setName(renter_name);
        super.setLicenseNumber(renter_license_number);
        super.setDateOfBirth(renter_dob);
        super.setPhoneno(renter_phoneno);
        super.setEmailId(renter_emailid);
        super.setPassword(renter_password);
        super.setType("Renter");
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Renter: ");
        
        sb.append("#").append(this.getPersonId());
	sb.append(" , RenterId: ").append(this.getRenterId());
	sb.append(" ").append(this.getName());
	sb.append(" , dob ").append(this.getDateOfBirth().toString());
	sb.append(" , email id ").append(this.getEmailId());
        sb.append(" , license no ").append(this.getLicenseNumber());
	sb.append(" \n ");
        
        return sb.toString();
    }
    
}
