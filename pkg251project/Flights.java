/*
 * <h1>Flights class</h1>.
 * This class has the attirbutes needed for flights and to save available flights.
 * <p>
 */
package pkg251project;

/**
 *
* @author msmil
 */

public class Flights {
    private String depDestination;

    private String arrivDestination;

    private String date;

    private int noOfSeat;

    private double price;

    private String depTime;

    private String arrivTime;

    private double duration;

    private String state;

    private String flightClass;

    private String flightID;
    private int vat;

    /**
     *
     */
    public Flights() {

    }

    /**
     *
     * @param depDestination departure destination of the flight
     * @param arrivDestination arrival destination of the flight 
     * @param date date of the flight 
     * @param noOfSeat no of seats in the flight 
     * @param price price of the ticket 
     * @param depTime departure time of flight 
     * @param arrivTime arrival time of flight 
     * @param duration duration of the flight 
     * @param state wether th flight is available or unavailable 
     * @param flightClass the class of the flight 
     * @param flightID flight ID
     */
    public Flights(String depDestination, String arrivDestination, String date, int noOfSeat, double price, String depTime, String arrivTime, double duration, String state, String flightClass,String flightID) {

        this.depDestination = depDestination;

        this.arrivDestination = arrivDestination;

        this.date = date;

        this.noOfSeat = noOfSeat;

        this.price = price;

        this.depTime = depTime;

        this.arrivTime = arrivTime;

        this.duration = duration;

        this.state = state;

        this.flightClass = flightClass;

        this.flightID = flightID;

    }

    /**
     *
     * @return the flight ID
     */
    public String getFlightID() {

        return flightID;

    }

    /**
     *
     * @param flightID flight ID
     */
    public void setFlightID(String flightID) {

        this.flightID = flightID;

    }

    /**
     *
     * @return the departure destination of the flight
     */
    public String getDepDestination() {

        return depDestination;

    }

    /**
     *
     * @return the arrival destination of the flight
     */
    public String getArrivDestination() {

        return arrivDestination;

    }

    /**
     *
     * @return the date of the flight
     */
    public String getDate() {

        return date;

    }

    /**
     *
     * @return the number of seat available on the flight
     */
    public int getNoOfSeat() {

        return noOfSeat;

    }

    /**
     *
     * @return price of the ticket
     */
    public double getPrice() {

        return price;

    }

    /**
     *
     * @return the departure time of the flight
     */
    public String getDepTime() {

        return depTime;

    }

    /**
     *
     * @return the arrival time of the flight
     */
    public String getArrivTime() {

        return arrivTime;

    }

    /**
     *
     * @return the duration of the flight
     */
    public double getDuration() {

        return duration;

    }

    /**
     *
     * @return the state of the flight
     */
    public String isState() {

        return state;

    }

    /**
     *
     * @return the class of the flight
     */
    public String getFlightClass() {

        return flightClass;

    }

    /**
     *
     * @param depDestination departure destination 
     */
    public void setDepDestination(String depDestination) {

        this.depDestination = depDestination;

    }

    /**
     *
     * @param arrivDestination arrival destination 
     */
    public void setArrivDestination(String arrivDestination) {

        this.arrivDestination = arrivDestination;

    }

    /**
     *
     * @param date date of flight
     */
    public void setDate(String date) {

        this.date=date;

    }

    /**
     *
     * @param noOfSeat number of seats available 
     */
    public void setNoOfSeat(int noOfSeat) {

        this.noOfSeat = noOfSeat;

    }

    /**
     *
     * @param price price of the ticket 
     */
    public void setPrice(double price) {

        this.price = price;

    }

    /**
     *
     * @param depTime the departure time
     */
    public void setDepTime(String depTime) {

        this.depTime = depTime;

    }

    /**
     *
     * @param arrivTime the arrival time 
     */
    public void setArrivTime(String arrivTime) {

        this.arrivTime = arrivTime;

    }

    /**
     *
     * @param duration duration of flight 
     */
    public void setDuration(double duration) {

        this.duration = duration;

    }

    /**
     *
     * @param state state of flight
     */
    public void setState(String state) {

        this.state = state;

    }

    /**
     *
     * @param flightClass Class of flight 
     */
    public void setFlightClass(String flightClass) {

        this.flightClass = flightClass;

    }

    /**
     *
     * @return description of the class
     */
    @Override

    public String toString() {

        return " \n   From: "+depDestination+"           To: "+arrivDestination+"\n   Date: "+date+"\n   Available seats: "+noOfSeat+"\n   Price: "+price+"\n   Departure time: "+depTime+"               Arrival Time: "+arrivTime+"\n   Duration: "+duration+" \n   Available class: "+flightClass;

    }

   

    

    

    

    

    

    

    

}