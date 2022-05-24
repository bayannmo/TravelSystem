/*
 * <h1>Places class</h1>.
 * This class has all the attirbutes needed for the places in the guidance of each city.
 * <p>
 */
package pkg251project;

/**
 *
 * @author msmil
 */
public class Places extends GuidanceInfo{

    private String name;

    private String category;

    private String timeOpen;

    private String timeClosed;

    private String location;

    private String rating;

    /**
     *
     */
    public Places() {

    }

    /**
     *
     * @param city city selected 
     * @param name name of the place 
     * @param category place category : mall , park etc..
     * @param timeOpen Time the place opens 
     * @param timeClosed Time the place closes 
     * @param location Location of the places 
     * @param rating Rating of the place 
     */
    public Places(String city,String name, String category, String timeOpen, String timeClosed, String location, String rating) {

        super(city);

        this.name = name;

        this.category = category;

        this.timeOpen = timeOpen;

        this.timeClosed = timeClosed;

        this.location = location;

        this.rating = rating;

    }

    /**
     *
     * @return the name of the place
     */
    public String getName() {

        return name;

    }

    /**
     *
     * @param name of the place
     */
    public void setName(String name) {

        this.name = name;

    }

    /**
     *
     * @return the type of the place
     */
    public String getCategory() {

        return category;

    }

    /**
     *
     * @param category place category 
     */
    public void setCategory(String category) {

        this.category = category;

    }

    /**
     *
     * @return the time the place is open
     */
    public String getTimeOpen() {

        return timeOpen;

    }

    /**
     *
     * @param timeOpen Time open 
     */
    public void setTimeOpen(String timeOpen) {

        this.timeOpen = timeOpen;

    }

    /**
     *
     * @return the time the place is closed
     */
    public String getTimeClosed() {

        return timeClosed;

    }

    /**
     *
     * @param timeClosed Time closed 
     */
    public void setTimeClosed(String timeClosed) {

        this.timeClosed = timeClosed;

    }

    /**
     *
     * @return the location of the place
     */
    public String getLocation() {

        return location;

    }

    /**
     *
     * @param location Place location 
     */
    public void setLocation(String location) {

        this.location = location;

    }

    /**
     *
     * @return the rating of the place
     */
    public String getRating() {

        return rating;

    }

    /**
     *
     * @param rating Place rating 
     */
    public void setRating(String rating) {

        this.rating = rating;

    }

 

 @Override

    public String toString() {

      

        return "\n  Name: "+name+" \n  Catagory: "+category+"\n  Opening time: "+timeOpen+"\n  Closing time: "+timeClosed+"\n  Location: "+location+"\n  Rating: "+rating+" \n";

       

        

    }

   

    

    

}

