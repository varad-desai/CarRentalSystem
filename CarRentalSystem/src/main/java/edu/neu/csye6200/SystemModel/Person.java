/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.UUID;

/**
 * Person Class
 * @author varad
 */
public class Person extends AbstractPersonAPI{
    
    /**
     * Attributes
     */
    
    private UUID personId;
    private String name;
    private String licenseNumber;
    private LocalDate dateOfBirth;
    private int phoneno;
    private String emailId;
    private String password;
    private String type;
//    enum type{
//    LESSEE, RENTER, SYSTEM
//    }
    
    
    /**
     * Constructor for Person.java
     */
    Person( UUID personId, String name, String licenseNumber, 
            LocalDate dateOfBirth, int phoneno, String emailId, String password, String type){
        this.personId = personId;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.dateOfBirth = dateOfBirth;
        this.phoneno = phoneno;
        this.emailId = emailId;
        this.password = password;
        this.type = type;
    }
   
    public Person() {
	// TODO Auto-generated constructor stub
	super();
    }

    /**
     * Getter and Setters
     */
    
    @Override
    public UUID getPersonId() {
        return personId;
    }

    @Override
    public void setPersonId(UUID personId) {
        this.personId = personId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getEmailId() {
        return emailId;
    }

    @Override
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    /**
     * To String for Person class
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Person");
		
        sb.append(" #").append(personId);
	sb.append(" ").append(name);
	sb.append(" ").append(licenseNumber);
	sb.append(" , dob ").append(dateOfBirth.toString());
        sb.append(" , emailId ").append(emailId);
        sb.append(" , phoneno ").append(phoneno);
	sb.append(" \n ");
		
	// System.out.println(sb.toString()); 
        
        return sb.toString();
    }
    
    public static Comparator<AbstractPersonAPI> comparePersonByName(){
		return new Comparator<AbstractPersonAPI>() {

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		};
	}

}
