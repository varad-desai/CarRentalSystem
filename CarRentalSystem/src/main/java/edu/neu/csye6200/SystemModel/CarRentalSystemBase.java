/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.SystemModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.HOURS;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;



/**
 *
 * @author varad
 */
public class CarRentalSystemBase extends AbstractCarRentalSystemAPI{
    
    List<AbstractPersonAPI> lessees = new ArrayList<AbstractPersonAPI>();
    List<AbstractCarAPI> cars = new ArrayList<AbstractCarAPI>();
    List<AbstractPersonAPI> renters = new ArrayList<AbstractPersonAPI>();
    List<AbstractPersonAPI> systemAdmins = new ArrayList<AbstractPersonAPI>();
    List<AbstractBookingAPI> bookings = new ArrayList<AbstractBookingAPI>();
    
    AbstractFactory lesseeFactory = new LesseeFactory();
    AbstractFactory renterFactory = new RenterFactory();
    AbstractFactory systemAdminFactory = new SystemFactory();
    AbstractCarFactoryAPI carFactory = new CarFactory();
    AbstractBookingFactoryAPI bookingFactory = new BookingFactory();
    
    @Override
    public void addLessee(String lesseeData) { 
        
        UUID personId = UUID.randomUUID();
        UUID lesseeId = UUID.randomUUID();
        
        StringBuilder newLesseeData = new StringBuilder();
        newLesseeData.append(personId.toString()).append(",");
        newLesseeData.append(lesseeId.toString()).append(",");
        newLesseeData.append(lesseeData);
      
        System.out.println("LesseeString "+ newLesseeData.toString());

        String file_name = "data\\Lessee.csv";
        
        try{ // Add Lessee to Array List
            AbstractPersonAPI l = lesseeFactory.getObject(newLesseeData.toString());
            Lessee l1 = (Lessee)l;
            lessees.add(l1);
            java.lang.System.out.println("Lessee #" + l1.getLesseeId() + " added to arraylist");
        }
        catch (Exception e) {
            e.printStackTrace();
	}
        
        try(	// Add lessee to file
                FileWriter fw = new FileWriter(file_name, true);
		BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(newLesseeData + "\n");
            bw.close();
            java.lang.System.out.println("Lessee #" + lesseeId + " added to file");
	}
	catch (Exception e) {
            e.printStackTrace();
	}
        
        lessees = getAllLessees();
        lessees.sort(Person.comparePersonByName());
    }
    
    @Override
    public List<AbstractPersonAPI> getAllLessees() {
        List<AbstractPersonAPI> lesseesList = new ArrayList<AbstractPersonAPI>();
        try {
            File file = new File("data\\Lessee.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine()) != null) {
                AbstractPersonAPI l = lesseeFactory.getObject(line);
                lesseesList.add(l);
            }
        } catch (IOException e) {
                e.printStackTrace();
        }
        return lesseesList;
    }
    
    @Override
    public Lessee getLessee(String emailId, String password) {
        lessees = getAllLessees();
        for(AbstractPersonAPI l: lessees){
            Lessee l1 = (Lessee)l;
            if(l1.getEmailId().equals(emailId) && l1.getPassword().equals(password)) {
                return l1;
            }
        }
        Lessee nullLessee = null;
        return nullLessee;
    }
    
    @Override
    public void showAllLessees(){
        lessees = getAllLessees();
        for(AbstractPersonAPI l: lessees){
            Lessee l1 = (Lessee)l;
            java.lang.System.out.println(l1.toString());
        }
    }
    
    public void sortLessees(Comparator<AbstractPersonAPI> c){
        Collections.sort(lessees, c);
    }
    
    @Override
    public void addRenter(String renterData){
        
        UUID personId = UUID.randomUUID();
        UUID renterId = UUID.randomUUID();
        
        StringBuilder newRenterData = new StringBuilder();
        newRenterData.append(personId.toString()).append(",");
        newRenterData.append(renterId.toString()).append(",");
        newRenterData.append(renterData);

        String file_name = "data\\Renter.csv";
        
        try{ // Add renter to Array list
            AbstractPersonAPI r = renterFactory.getObject(newRenterData.toString());
            renters.add(r);
            Renter r1 = (Renter)r;
            java.lang.System.out.println("Renter #" + r1.getRenterId() + " added to arraylist");
        }
        catch (Exception e) {
            e.printStackTrace();
	}
        
        try(	// Add renter to File
                FileWriter fw = new FileWriter(file_name, true);
		BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(newRenterData + "\n");
            bw.close();
            java.lang.System.out.println("Renter #" + renterId+ " added to file");
	}
	catch (Exception e) {
            e.printStackTrace();
	}
        
        System.out.println("abc");
        
        renters = getAllRenters();
        renters.sort(Person.comparePersonByName());
        
    }
    
    @Override
    public List<AbstractPersonAPI> getAllRenters(){
        List<AbstractPersonAPI> rentersList = new ArrayList<AbstractPersonAPI>();
        try {
            File file = new File("data\\Renter.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine()) != null) {
                AbstractPersonAPI l = renterFactory.getObject(line);
                rentersList.add(l);
            }
        } catch (IOException e) {
                e.printStackTrace();
        }
        return rentersList;
    }
    
    @Override
    public Renter getRenter(String emailId, String password){
        renters = getAllRenters();
        for(AbstractPersonAPI r: renters){
            Renter r1 = (Renter)r;
            if(r1.getEmailId().equals(emailId) && r1.getPassword().equals(password)){
                return r1;
            }
        }
        Renter nullRenter = null;
        return nullRenter;
    }
    
    @Override
    public void showAllRenters(){
        renters = getAllRenters();
        for(AbstractPersonAPI r: renters){
            Renter r1 = (Renter)r;
            java.lang.System.out.println(r1.toString());
        }
    }
    
    public void sortRenters(Comparator<AbstractPersonAPI> c){
        Collections.sort(renters, c);
    }

    @Override
    public void addSystemAdmin(String systemAdminData) {

        UUID personId = UUID.randomUUID();
        UUID systemAdminId = UUID.randomUUID();
        
        StringBuilder newSystemAdminData = new StringBuilder();
        newSystemAdminData.append(personId.toString()).append(",");
        newSystemAdminData.append(systemAdminId.toString()).append(",");
        newSystemAdminData.append(systemAdminData);    
        
        String file_name = "data\\SystemAdmin.csv";
        
        try(	// Add System admin to file
                FileWriter fw = new FileWriter(file_name, true);
		BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(newSystemAdminData.toString() + "\n");
            bw.close();
            java.lang.System.out.println("SystemAdmin #" + systemAdminId + " added to file");
	}
	catch (Exception e) {
            e.printStackTrace();
	}
        
        try{ // Add system admin to Array list
            AbstractPersonAPI sa = systemAdminFactory.getObject(newSystemAdminData.toString());
            systemAdmins.add(sa);
            SystemAdmin sa1 = (SystemAdmin)sa;
            java.lang.System.out.println("SystemAdmin #" + sa1.getSystemAdminId() + " added to ArrayList");
        }
        catch (Exception e) {
            e.printStackTrace();
	}
        
        systemAdmins = getAllSystemAdmins(); 
        systemAdmins.sort(Person.comparePersonByName());
    }

    @Override
    public List<AbstractPersonAPI> getAllSystemAdmins() {
        List<AbstractPersonAPI> systemsList = new ArrayList<AbstractPersonAPI>();
        try {
            File file = new File("data\\SystemAdmin.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine()) != null) {
                AbstractPersonAPI l = systemAdminFactory.getObject(line);
                systemsList.add(l);
            }
        } catch (IOException e) {
                e.printStackTrace();
        }
        return systemsList;    
    }

    @Override
    public SystemAdmin getSystemAdmin(String emailId, String password) {
        systemAdmins = getAllSystemAdmins();
        for(AbstractPersonAPI l: systemAdmins){
            SystemAdmin s1 = (SystemAdmin)l;
            if(s1.getEmailId().equals(emailId) && s1.getPassword().equals(password)) {
                return s1;
            }
        }
        return null;    
    }

    @Override
    public void showAllSystemAdmins() {
        systemAdmins = getAllSystemAdmins();
        for(AbstractPersonAPI s: systemAdmins){
            SystemAdmin s1 = (SystemAdmin)s;
            java.lang.System.out.println(s1.toString());
        }    
    }
    
    public void sortSystemAdmins(Comparator<AbstractPersonAPI> c){
        Collections.sort(systemAdmins, c);
    }
    
    @Override
    public void addCar(String carData) { 
        
        UUID newCarId = UUID.randomUUID();
        
        StringBuilder newCarData = new StringBuilder();
        newCarData.append(newCarId.toString()).append(",");
        newCarData.append(carData);
        
        String file_name = "data\\Car.csv";
        
        try{ // Add car to Array list
            AbstractCarAPI c = carFactory.getObject(newCarData.toString());
            cars.add(c);
            Car c1 = (Car)c;
            java.lang.System.out.println("Car #" + c1.getCarId() + " added to ArrayList");
        }
        catch (Exception e) {
            e.printStackTrace();
	}
        
        try(	// Add car to file
                FileWriter fw = new FileWriter(file_name, true);
		BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(newCarData.toString() + "\n");
            bw.close();
            java.lang.System.out.println("Car #" + newCarId + " added to file");
	}
	catch (Exception e) {
            e.printStackTrace();
	}
        
    }
    
    @Override
    public List<AbstractCarAPI> getAllCars() {
        List<AbstractCarAPI> carsList = new ArrayList<AbstractCarAPI>();
        try {
            File file = new File("data\\Car.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine()) != null) {
                AbstractCarAPI c = carFactory.getObject(line);
                carsList.add(c);
            }
            cars = carsList;
        } catch (IOException e) {
                e.printStackTrace();
        }
        return carsList;    
    }
    
    @Override
    public void showAllCars() {
        cars = getAllCars();
        for(AbstractCarAPI c: cars){
            java.lang.System.out.println(c.toString());
        }    
    }
    
    public AbstractCarAPI getCarById(UUID carId){
        
        System.out.println("In AbstractCarAPI CarId: "+ carId);
        
        cars = getAllCars();
        AbstractCarAPI car = null;
        
        System.out.println("In AbstractCarAPI CarId: "+ carId);
        
        for(AbstractCarAPI carInList : cars){
        
            System.out.println("Inside for loop");
            UUID carIdToFind = carInList.getCarId();
            System.out.println(carIdToFind);
            System.out.println(carId);
            
            if(carIdToFind.equals(carId)){
            
                System.out.println("Got the car");
                
                UUID carID = carInList.getCarId();
                String name = carInList.getName();
                String company = carInList.getCompany();
                int noOfSeats = carInList.getNumberOfSeats();
                int rentPerHour = carInList.getRentPerHour();
                String insuranceCompany = carInList.getInsuranceCompany();
                int insuranceNumber = carInList.getInsuranceNumber();
                UUID renterId = carInList.getRenterId();
                
                System.out.println(carID + " " + name + " " + company);
                
                System.out.println("Got all variables");
                
                car = new Car(carID, renterId, company, name, noOfSeats, insuranceCompany, insuranceNumber, rentPerHour);

                System.out.println("Car object creation complete");
            }   

        }
        
        System.out.println(car.getCarId().toString());
        
        return car;
    }
       
    
    public double getBookingFee(String bookingData){
        
        StringBuilder newBookingData = new StringBuilder(bookingData);
        newBookingData.append(",").append("0");
        
        AbstractBookingAPI booking = bookingFactory.getStringObject(newBookingData.toString());
        LocalDate dateToCheck = booking.getDate();
        LocalTime startTime = booking.getStartTime();
        LocalTime endTime = booking.getEndTime();
        UUID carId = booking.getCarId();
        
        System.out.println("carId: "+carId);
        
        AbstractCarAPI car = getCarById(carId);

        if(car.getCarId() == null){
            System.out.println("did not get car by id");
        }
        else{
            System.out.println(car.getCarId().toString());
        }
        
        System.out.println(bookingData);
        System.out.println(booking.getStartTime() + "-" + booking.getEndTime() + "-" + car);

        double carRentPerHour = car.getRentPerHour();
        
        // Calculate duration in terms of hours
        long duration = startTime.until(endTime, HOURS);
        
        // booking fee = duration * carRentPerHour;
        double bookingFee = carRentPerHour*(double)duration;
        
        return bookingFee;
        
    }
    
    public double getBookingFeeByInstances(LocalTime startTime, LocalTime endTime, AbstractCarAPI car) {
        
        double carRentPerHour = car.getRentPerHour();
        
        // Calculate duration in terms of hours
        long duration = startTime.until(endTime, HOURS);
        
        return carRentPerHour * (double) duration;
    }
    
    public void sortCars(Comparator<AbstractCarAPI> c){
        Collections.sort(cars, c); 
    }
    
    
    public void addBooking(String bookingData){
        
        // bookingData: lesseeId,carId,date,startTime,endTime
        // bookingId,lesseeId,carId,date,startTime,endTime
        UUID newBookingId = UUID.randomUUID();

        StringBuilder newBookingData = new StringBuilder();
        newBookingData.append(newBookingId).append(",");
        newBookingData.append(bookingData);
//        newBookingData.append(",").append("0");
        
        double bookingFee = getBookingFee(newBookingData.toString());
        
        if(checkIfBookingIsAllowed(newBookingData.toString()) && checkIfBookingIsPossible(newBookingData.toString())){
            
            String file_name = "data\\Booking.csv";

            try{ // Add Booking to Array list
                AbstractBookingAPI b = bookingFactory.getObject(newBookingData.toString(), bookingFee);
//                b.setFee(bookingFee);
                bookings.add(b);
                Booking b1 = (Booking)b;
                java.lang.System.out.println("Booking #" + b1.getBookingId() + " added to ArrayList");
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            try(	// Add booking to file
                    FileWriter fw = new FileWriter(file_name, true);
                    BufferedWriter bw = new BufferedWriter(fw);)
            {
                newBookingData.append(",");
                newBookingData.append(Double.toString(bookingFee));
                bw.write(newBookingData.toString() + "\n");
                bw.close();
                java.lang.System.out.println("Booking #" + newBookingId + " added to file");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(checkIfBookingIsAllowed(newBookingData.toString()) == false){
            System.out.println("Booking Not Allowed! ... you already have 3 bookings");
            
        }else if(checkIfBookingIsPossible(newBookingData.toString()) == false){
            System.out.println("Booking time overlap!");
        }
        
        cars = getAllCars();
        cars.sort(Car.compareCarByNumberOfSeats());
        
    }
    
    @Override
    public List<AbstractBookingAPI> getAllBookings() {
        List<AbstractBookingAPI> bookingsList = new ArrayList<AbstractBookingAPI>();
        try {
            File file = new File("data\\Booking.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine()) != null) {
                AbstractBookingAPI b = bookingFactory.getStringObject(line);
                bookingsList.add(b);
            }
        } catch (IOException e) {
                e.printStackTrace();
        }
        return bookingsList;    
    }
    
    @Override
    public void showAllBookings() {
        bookings = getAllBookings();
        for(AbstractBookingAPI b: bookings){
            java.lang.System.out.println(b.toString());
        }    
    }
    
    public boolean checkIfBookingIsAllowed(String bookingData){
        boolean bookingAllowance = true;
        
        StringBuilder newBookingData = new StringBuilder(bookingData);
        newBookingData.append(",").append("0");
        
        AbstractBookingAPI bookingToCheck = bookingFactory.getStringObject(newBookingData.toString());
        UUID lesseeId = bookingToCheck.getLesseeId();
        int count = 0;
        
        for(AbstractBookingAPI b : bookings){
            if(b.getLesseeId() == lesseeId){
                count++;
            }
        }
        
        if(count > 3){
            bookingAllowance = false;
        }
        
        return bookingAllowance;
    }
    
    /**
     * Checks whether booking is possible according to selected time frame 
     * @param bookingData
     * @return 
     */
    public boolean checkIfBookingIsPossible(String bookingData){
        
        boolean bookingPossibility = true;
        
        StringBuilder newBookingData = new StringBuilder(bookingData);
        newBookingData.append(",").append("0");
        
        AbstractBookingAPI bookingToCheck = bookingFactory.getStringObject(newBookingData.toString());
        LocalDate dateToCheck = bookingToCheck.getDate();
        LocalTime startTimeToCheck = bookingToCheck.getStartTime();
        LocalTime endTimeToCheck = bookingToCheck.getEndTime();
        UUID carIdToCheck = bookingToCheck.getCarId();
        UUID lesseeId = bookingToCheck.getLesseeId();
        
        for(AbstractBookingAPI booking : bookings){
            if(booking.getCarId() == carIdToCheck && booking.getDate() == dateToCheck){
                if(booking.getStartTime().equals(startTimeToCheck) ||
                    booking.getEndTime().equals(endTimeToCheck)){
                    bookingPossibility = false;
                }
                else if(booking.getStartTime().isBefore(startTimeToCheck) &&
                        booking.getEndTime().isAfter(startTimeToCheck)){
                    bookingPossibility = false;
                }
                else if(booking.getEndTime().isAfter(endTimeToCheck) &&
                        booking.getStartTime().isBefore(endTimeToCheck)){
                    bookingPossibility = false;
                }
                else if(booking.getStartTime().isBefore(startTimeToCheck) &&
                        booking.getEndTime().isAfter(endTimeToCheck)){
                    bookingPossibility = false;
                }
                else if(booking.getStartTime().isAfter(startTimeToCheck) &&
                        booking.getEndTime().isBefore(endTimeToCheck)){
                    bookingPossibility = false;
                }        
            }
        }
        
        return bookingPossibility;
    }
    
    @Override
    public void deleteCar(String oldCar, UUID carId) {
        
        String file_name = "data\\Car.csv";
        
        try{ // Delete car from Array list
            boolean isRemoved = this.cars.removeIf(car -> car.getCarId().toString().equals(carId.toString()));
            
            java.lang.System.out.println("Car #" + carId + " deleted from ArrayList: " + isRemoved);
        }
        catch (Exception e) {
            e.printStackTrace();
	}
        
        String row;
        StringBuilder sb = new StringBuilder();
        try(	// make a copy of file and delete car
        FileReader fr = new FileReader(file_name);
        BufferedReader bw = new BufferedReader(fr);)
        {
            while ((row = bw.readLine()) != null) {
                if(row.equals(oldCar))
                    continue;
                sb.append(row).append("\n");
            }
	}
	catch (Exception e) {
            e.printStackTrace();
	}
        
        try(	// write copy to file
                FileWriter fw = new FileWriter(file_name);
		BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(sb.toString());
            bw.close();
            java.lang.System.out.println("Copied file after deleting the car with #" + carId);
	}
	catch (Exception e) {
            e.printStackTrace();
	}
    }

    @Override
    public void updateCar(String oldCar, UUID oldCarId, String newCarData) {
        deleteCar(oldCar, oldCarId);
        String file_name = "data\\Car.csv";
        
        try{ // Add car to Array list
            AbstractCarAPI c = carFactory.getObject(newCarData.toString());
            cars.add(c);
            Car c1 = (Car)c;
            java.lang.System.out.println("Car #" + c1.getCarId() + " added to ArrayList");
        }
        catch (Exception e) {
            e.printStackTrace();
	}
        
        try(	// Add car to file
                FileWriter fw = new FileWriter(file_name, true);
		BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(newCarData.toString() + "\n");
            bw.close();
            java.lang.System.out.println("Car updated in file");
	}
	catch (Exception e) {
            e.printStackTrace();
	}
        
    }
    
    public static void demo() throws IOException{
        
        AbstractCarRentalSystemAPI backend_demo = AbstractCarRentalSystemAPI.getObject();
        
        Scanner scanLine = new Scanner(System.in);
       
        int userSelection = 0;
        
        while(userSelection != 9){
            System.out.println("Please select:\n"
                + "1. Add Lessee\t 2. Show Lessees\n"
                + "3. Add Renter\t 4. Show Renters\n"
                + "5. Add Car\t 6. Show Cars\n "
                + "7. Add Booking\t 8. Show Bookings\n"
                + "9. Exit");
            userSelection = scanLine.nextInt();
        
            switch(userSelection){
            
                case 1: 
                    System.out.println("Enter String for lessee(name,licenseNo,dob,phoneno,email,pwd)");
                    String lesseeData = scanLine.next();
                    backend_demo.addLessee(lesseeData);
                    break;
                
                case 2: 
                    backend_demo.showAllLessees();
                    break;
                
                case 3: 
                    System.out.println("Enter String for renter(name,licenseNo,dob,phoneno,email,pwd)");
                    String renterData = scanLine.next();
                    backend_demo.addRenter(renterData);
                    break;
            
                case 4:
                    backend_demo.showAllRenters();
                    break;
            
                case 5:
                    System.out.println("Enter String for car(renterId,name,company,noOfSeats,insuranceCompany,insuranceNumber,rentPerHour)");
                    String carData = scanLine.next();
                    backend_demo.addCar(carData);
                    break;
            
                case 6:
                    backend_demo.showAllCars();
                    break;
                    
                case 7:
                    System.out.println("Enter String for Booking(lesseeId,carId,date,startTime,endTime)");
                    String BookingData = scanLine.next();
                    backend_demo.addBooking(BookingData);
                    break;
                    
                case 8:
                    backend_demo.showAllBookings();
                    break;
                
            }
        }
    }

    @Override
    public void deleteBooking(String booking, UUID bookingId) {
        bookings = getAllBookings();
        String file_name = "data\\Booking.csv";
        System.out.println("a");
        try{ // Delete car from Array list
            boolean isRemoved = this.bookings.removeIf(b -> b.getBookingId().toString().equals(bookingId.toString()));
            System.out.println(bookingId);
            bookings.forEach(System.out::println);
            System.out.println("b");

            java.lang.System.out.println("Booking #" + bookingId + " deleted from ArrayList: " + isRemoved);
        }
        catch (Exception e) {
                    System.out.println("e");

            e.printStackTrace();
	}
        
        String row;
        StringBuilder sb = new StringBuilder();
        try(	// make a copy of file and delete booking
        FileReader fr = new FileReader(file_name);
        BufferedReader bw = new BufferedReader(fr);)
        {
            while ((row = bw.readLine()) != null) {
                if(row.equals(booking))
                    continue;
                sb.append(row).append("\n");
            }
	}
	catch (Exception e) {
            e.printStackTrace();
	}
        System.out.println(booking);
        System.out.println(sb.toString());
        try(	// write copy to file
                FileWriter fw = new FileWriter(file_name);
		BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(sb.toString());
            bw.close();
            java.lang.System.out.println("Copied file after deleting the booking with #" + bookingId);
	}
	catch (Exception e) {
            e.printStackTrace();
	}
    }
    
        public void updateBooking(String oldBooking, UUID oldBookingID, String newBooking) {
        deleteBooking(oldBooking, oldBookingID);
        String file_name = "data\\Booking.csv";
        
        try{ // Add car to Array list
            AbstractBookingAPI b = bookingFactory.getObject(newBooking.toString(), getBookingFee(newBooking));
            bookings.add(b);
            Booking b1 = (Booking) b;
            java.lang.System.out.println("Booking #" + b1.getBookingId()+ " added to ArrayList");
        }
        catch (Exception e) {
            e.printStackTrace();
	}
        
        try(	// Add car to file
                FileWriter fw = new FileWriter(file_name, true);
		BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(newBooking.toString() + "\n");
            bw.close();
            java.lang.System.out.println("Booking updated in file");
	}
	catch (Exception e) {
            e.printStackTrace();
	}
    }

    @Override
    public AbstractCarAPI getCar(UUID carId) {
        return getAllCars().stream()
                .filter(car -> car.getCarId().equals(carId))
                .collect(Collectors.toList()).get(0);
    }

    @Override
    public void deleteLessee(UUID lesseeId) {
        this.lessees = getAllLessees();
        Lessee person = (Lessee) lessees.stream()
                .filter(p -> p.getPersonId().equals(lesseeId))
                .collect(Collectors.toList())
                .get(0);
        
        StringBuilder sb = new StringBuilder();
        sb.append(person.getPersonId()).append(",");
        sb.append(person.getLesseeId()).append(",");
        sb.append(person.getName()).append(",");
        sb.append(person.getLicenseNumber()).append(",");
        sb.append(person.getDateOfBirth().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")))
                .append(",");
        sb.append(person.getPhoneno()).append(",");
        sb.append(person.getEmailId()).append(",");
        sb.append(person.getPassword());
        System.out.println("Person: " + sb.toString());
        String file_name = "data\\Lessee.csv";
        
        try{ // Delete Lessee from Array list
            boolean isRemoved = this.lessees.removeIf(lessee -> lessee.getPersonId().toString().equals(lesseeId.toString()));
            
            java.lang.System.out.println("Lessee #" + lesseeId + " deleted from ArrayList: " + isRemoved);
        }
        catch (Exception e) {
            e.printStackTrace();
	}
        
        String row;
        StringBuilder sb_new = new StringBuilder();
        try(	// make a copy of file and delete car
        FileReader fr = new FileReader(file_name);
        BufferedReader bw = new BufferedReader(fr);)
        {
            while ((row = bw.readLine()) != null) {
                if(row.equals(sb.toString()))
                    continue;
                sb_new.append(row).append("\n");
            }
	}
	catch (Exception e) {
            e.printStackTrace();
	}
        
        try(	// write copy to file
                FileWriter fw = new FileWriter(file_name);
		BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(sb_new.toString());
            bw.close();
            java.lang.System.out.println("Copied file after deleting the lessee with #" + lesseeId);
	}
	catch (Exception e) {
            e.printStackTrace();
	}
    }  

    @Override
    public void deleteRenter(UUID renterId) {
        this.renters = getAllRenters();
        Renter person = (Renter) renters.stream()
                .filter(p -> p.getPersonId().equals(renterId))
                .collect(Collectors.toList())
                .get(0);
        
        StringBuilder sb = new StringBuilder();
        sb.append(person.getPersonId()).append(",");
        sb.append(person.getRenterId()).append(",");
        sb.append(person.getName()).append(",");
        sb.append(person.getLicenseNumber()).append(",");
        sb.append(person.getDateOfBirth().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")))
                .append(",");
        sb.append(person.getPhoneno()).append(",");
        sb.append(person.getEmailId()).append(",");
        sb.append(person.getPassword());
        System.out.println("Person: " + sb.toString());
        String file_name = "data\\Renter.csv";
        
        try{ // Delete Lessee from Array list
            boolean isRemoved = this.renters.removeIf(renter -> renter.getPersonId().toString().equals(renterId.toString()));
            
            java.lang.System.out.println("Renter #" + renterId + " deleted from ArrayList: " + isRemoved);
        }
        catch (Exception e) {
            e.printStackTrace();
	}
        
        String row;
        StringBuilder sb_new = new StringBuilder();
        try(	// make a copy of file and delete car
        FileReader fr = new FileReader(file_name);
        BufferedReader bw = new BufferedReader(fr);)
        {
            while ((row = bw.readLine()) != null) {
                if(row.equals(sb.toString()))
                    continue;
                sb_new.append(row).append("\n");
            }
	}
	catch (Exception e) {
            e.printStackTrace();
	}
        
        try(	// write copy to file
                FileWriter fw = new FileWriter(file_name);
		BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(sb_new.toString());
            bw.close();
            java.lang.System.out.println("Copied file after deleting the renter with #" + renterId);
	}
	catch (Exception e) {
            e.printStackTrace();
	}    
    }

    
    
}
