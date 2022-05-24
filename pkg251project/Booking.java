/*
 * <h1>Booking class</h1>.
 * This class has the main attirbutes we need to book the flight.
 * <p>
 */
package pkg251project;

/**
 *
 * @author msmil
 */
public class Booking {
    
    private Flights Flight;
    private Traveler traveler;
    private double totalPrice;
    private double Vat=0.15;
    private boolean fursan;
    
    /**
     *
     */
    public Booking() {
        
    }
    
    /**
     *
     * @param flight is an object of flights class to use in booking to get flight information
     * @param traveler is an object of traveler class to save the booked fights in users reservations
     * @param totalPrice we use it to calculate the total pice of the ticket of the booked flight  
     * @param fursan boolean to check wether the user has a discount or not 
     */
    public Booking( Flights flight,Traveler traveler, double totalPrice, boolean fursan ) {
        
        this.Flight = flight;
        this.traveler = traveler;
        this.totalPrice = totalPrice;
        this.fursan=fursan;
    }
    


    /**
     *
     * @return object of flights
     */
    public  Flights getFlight() {
        return Flight;
    }

    /**
     *
     * @return object of Traveler class
     */
    public Traveler getTraveler() {
        return traveler;
    }

    /**
     *
     * @return total price of the flight without vat and discount
     */
    public double price() {
        return totalPrice;
    }



    /**
     *
     * @param Flight object of Flights
     */
    public void setFlight(Flights Flight) {
        this.Flight = Flight;
    }

    /**
     *
     * @param traveler object of Traveler
     */
    public void setTraveler(Traveler traveler) {
        this.traveler = traveler;
    }

    /**
     *
     * @param totalPrice total price of the ticket
     */
    public void setTotalPrica(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    /**
     *
     * @param totalPrice price of flight
     * @param fursan boolean variable indicate to the discount
     * @return total price with vat and discount
     */
    public double calculatePrice(double totalPrice,boolean fursan) {
        //to calculate the price
        double amount = 0;
        if (fursan==true)
        amount =totalPrice+calculateVat(totalPrice);
        amount -= discount(fursan,totalPrice);
        return amount;
        
    }

    //return the vat 

    /**
     * @param totalPrice price of flight
     * @return the value of the vat according to the price 
     */
    public double calculateVat(double totalPrice ) {
        //to calculate the price 
        double Cvat = totalPrice*Vat;;
        return Cvat;

    }
    
    //return the discount value 

    /**
     *
     * @param fursan user's discount check
     * @param totalPrice price of flight
     * @return discount value 
     */
    public double discount(boolean fursan,double totalPrice) {
        //to calculate the price 
        double discontVal=0;
        if(fursan==true){
           discontVal =totalPrice*0.3;
           return discontVal;
        }else{
            return 0.0;
        }
         
    }

    /**
     *
     * @return description of the calss
     */
    @Override
    public String toString() {
      
   return " \n   From:"+Flight.getDepDestination()+"            To:"+Flight.getArrivDestination()+" \n   Date:"+Flight.getDate()+" \n   Number of seats:"+Flight.getNoOfSeat()+"\n   Price: "+Flight.getPrice()+"      \n   VAT:"+calculateVat(Vat)+"\n   Discount amount:"+discount(fursan,Flight.getPrice())+" \n   Total price:"+calculatePrice(Flight.getPrice(), fursan)+"\n   Departure time: "+Flight.getDepTime()+"          Arrival Time: "+Flight.getArrivTime()+"\n   Duration:"+Flight.getDuration()+" \n   Class: "+Flight.getFlightClass();
  
    }
    
    
    
    
    
    
    
    
}
