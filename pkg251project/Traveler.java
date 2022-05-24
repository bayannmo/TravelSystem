/*
 * <h1>Traveler class</h1>.
 * This class has the attirbutes needed for the user, and save user information .
 * <p>
 */
package pkg251project;

import java.util.ArrayList;

/**
 *
 * @author msmil
 */
public class Traveler {
     
    private String name;
    
    private char gender;

    private String email;
    
    private String password;
    
    private String bookingId;
    
    private String phone;
      
    /**
     *
     */
    public Traveler() {

    }

    
    
    ArrayList<Booking> bookings = new ArrayList<Booking>();

    /**
     *
     * @param name name of traveler 
     * @param gender gender of traveler 
     * @param email email of traveler
     * @param password password of traveler 
     * @param phone phone of traveler 
     * @param book The bookings of the traveler 
     */
    public Traveler(String name, char gender, String email, String password, String phone, ArrayList <Booking> book ) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.phone= phone;
        this.bookings=book;
        
    }
     
     
    
    //traveler for log in

    /**
     *
     * @param name Traveler name 
     * @param email Traveler email
     * @param password Traveler password 
     */
    public Traveler(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

    }

    /**
     *
     * @param phone Traveler phone 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return the phone number of the user
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @return the username of the user
     */
    public String getName() {

        return name;

    }


    /**
     *
     * @param name name 
     */
    public void setName(String name) {

        this.name = name;

    }

    /**
     *
     * @return the gender of the user
     */
    public char getGender() {

        return gender;

    }

    /**
     *
     * @param gender gender
     */
    public void setGender(char gender) {

        this.gender = gender;

    }

    /**
     *
     * @return the email of the user
     */
    public String getEmail() {

        return email;

    }

    /**
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param email email 
     */
    public void setEmail(String email) {

        this.email = email;

    }

    /**
     *
     * @param bookings bookings of traveler
     */
    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    /**
     *
     * @return the list of the confirmed reservation
     */
    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    /**
     *
     * @return description of the class
     */
    @Override
    public String toString() {
        return "Traveler{" + "name=" + name + ", travelerId=" + ", gender=" + gender + ", email=" + email + ", password=" + password + ", bookingId=" + bookingId + ", phone=" + phone + '}';
    }



}


    

