/*
 * <h1>Weather class</h1>.
 * This class has the attirbutes needed of the weather of each city.
 * <p>
 */
package pkg251project;

/**
 *
 * @author msmil
 */
public class Weather extends GuidanceInfo{

   String winter;
   String summer;
   String spring;
   String autumn;

    /**
     *
     */
    public Weather() {

    }

    /**
     *
     * @param city Selected city for this weather 
     * @param winter Weather in winter 
     * @param summer Weather in summer 
     * @param spring Weather in spring 
     * @param autumn Weather in autumn 
     */
    public Weather(String city, String winter, String summer, String spring, String autumn) {

        super(city);
        this.winter = winter;

        this.summer = summer;

        this.spring = spring;

        this.autumn = autumn;

    }

 
    @Override

    public String toString() {

       return  "\n   Spring: "+spring+"\n   Winter: "+winter+"\n   Summer: "+summer+"\n   Autumn: "+autumn;

    }

   

}

 