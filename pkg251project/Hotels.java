/*
 * <h1>Hotels class</h1>.
 * This class has all the needed information for the hotels.
 * <p>
 */
package pkg251project;

/**
 *
* @author msmil
 */
public class Hotels extends GuidanceInfo{
    private String city;

    private String name;

    private String location;

    private String rating;

    private String price;

    /**
     *
     */
    public Hotels() {


    }

    //full-arg constructor

    Hotels(String city,String name, String location, String rating, String price) {

        this.city = city;

        this.name = name;

        this.location = location;

        this.rating = rating;

        this.price = price;

      

    }

 

    // Getters

    /**
     *
     * @return the rating of the hotel
     */

    public String getrating() {

        return rating;

    }

    /**
     *
     * @return the price of the hotel for each night
     */
    public String getprice() {

        return price;

    }

    /**
     *
     * @return the name of the hotel
     */
    public String getname() {

        return name;

    }

    /**
     *
     * @return the location of the hotel
     */
    public String getlocation() {

        return location;

    }

    /**
     *
     * @param name hotel name 
     */
    public void setname(String name) {

        this.name = name;

    }

  

    /**
     *
     * @param location hotel's location
     */
    public void setLocation(String location) {

        this.location = location;

    }

    /**
     *
     * @param price price for night 
     */
    public void setPrice(String price) {

        this.price = price;

    }

    /**
     *
     * @return the city of the hotel 
     */
    public String getCity() {

        return city;

    }

    /**
     *
     * @param city  of the hotel 
     */
    public void setCity(String city) {

        this.city = city;

    }



    /**
     *
     * @param rating rating of the hotel 
     */
    public void setRating(String rating) {

        this.rating = rating;

    }

 


  @Override

    public String toString() {

        return "\n   Name: "+name+" \n   Location: "+location+"\n   Price per night: "+price+"\n   Rating: "+rating+"\n   ";

      

    }

   

    

 

 

 

}

    