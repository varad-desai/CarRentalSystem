/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.util.Comparator;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author varad
 */
public class Car extends AbstractCarAPI{
    
    /**
     * Attributes
     */
    
    private UUID carId;
    private UUID renterId;
    private String company;
    private String name;
    private int numberOfSeats;
    private String insuranceCompany;
    private int insuranceNumber;
    private int rentPerHour;

    public Car() {
        super();
    }
    
    /**
     * Constructor for Car.java
     */
    Car(UUID carId, UUID renterId, String company, String name, 
            int numberOfSeats, String insuranceCompany, int insuranceNumber,
            int rentPerHour){
        this.carId = carId;
        this.renterId = renterId;
        this.company = company;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.insuranceCompany = insuranceCompany;
        this.insuranceNumber = insuranceNumber;
        this.rentPerHour = rentPerHour;
    }
    
    Car(String car_data){
        
        UUID carId = null;
        UUID renterId = null;
        String car_name = null;
        String car_company = null;
        int number_of_seats = 0;
        String insurance_company = null;
        int insurance_number = 0;
        int rent_per_hour = 0;
        
        try (Scanner sc_line = new Scanner(car_data)) {
            
            sc_line.useDelimiter(",");
//        UUID carId = UUID.randomUUID();

            System.out.println("CarData: "+car_data);
            
            carId = UUID.fromString(sc_line.next());
//            System.out.println("A");
            renterId = UUID.fromString(sc_line.next());
//            System.out.println("B");
            car_name = sc_line.next();
//            System.out.println("C");
            car_company = sc_line.next();
//            System.out.println("D");
            number_of_seats = sc_line.nextInt();
//            System.out.println("E");
            insurance_company = sc_line.next();
//            System.out.println("F");
            insurance_number = sc_line.nextInt();
//            System.out.println("G");
            rent_per_hour = sc_line.nextInt();
        
        }catch(Exception e) {
            e.printStackTrace();
	}
		
        this.setCarId(carId);
        this.setRenterId(renterId);
        this.setName(car_name);
        this.setCompany(car_company);
        this.setNumberOfSeats(number_of_seats);
        this.setInsuranceCompany(insurance_company);
        this.setInsuranceNumber(insurance_number);
        this.setRentPerHour(rent_per_hour);
 
    }
    
    /**
    * Getter and Setters
    */
    
    @Override
    public UUID getCarId() {
        return carId;
    }
    
    @Override
    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    @Override
    public UUID getRenterId() {
        return renterId;
    }

    @Override
    public void setRenterId(UUID renterId) {
        this.renterId = renterId;
    }
    
    
    
    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
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
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    @Override
    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    @Override
    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    
    @Override
    public int getRentPerHour() {
        return rentPerHour;
    }

    @Override
    public void setRentPerHour(int rentPerHour) {
        this.rentPerHour = rentPerHour;
    }
    
    /**
     * To string of Car class
     * @return String 
     */

    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder("Car");
//		
//        sb.append(" CarId #").append(carId);
//	sb.append(" , ").append(company);
//	sb.append(" ").append(name);
//        sb.append(", Renter ").append(renterId);
//	sb.append(" , number of seats ").append(numberOfSeats);
//        sb.append(" , insurance company ").append(insuranceCompany);
//        sb.append(" , insurance number ").append(insuranceNumber);
//        sb.append(", rent per hour ").append(rentPerHour);
//	sb.append(" \n ");
//		
	// System.out.println(sb.toString()); 
        
//        return sb.toString();
        return this.getCompany(); //bro ... iska role samjha nai mujhe
                                  // UI mei table mei mai ek column mei 
                                  // car ka object chahta hu so that selected 
                                  // row k 0th column pr object miljaye -- for
                                  // getting all the details of that car
    }
    
    public static Comparator<AbstractCarAPI> compareCarByNumberOfSeats(){
		return new Comparator<AbstractCarAPI>() {

			@Override
			public int compare(AbstractCarAPI o1, AbstractCarAPI o2) {
				// TODO Auto-generated method stub
                                return Integer.compare(o1.getNumberOfSeats(), o2.getNumberOfSeats());
			}
			
		};
		
	}
    
    

}
