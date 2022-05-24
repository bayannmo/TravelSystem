/*
 * <h1>Guidance class</h1>.
 * This class has the attirbutes needed for the guidance information of each city.
 * <p>
 */
package pkg251project;

/**
 *
 * @author msmil
 */
public class GuidanceInfo {

    private String cityGuide;

    /**
     *
     */
    public GuidanceInfo() {

    }

    /**
     *
     * @param cityGuide Provides the city guide of selected city 
     */
    public GuidanceInfo(String cityGuide) {

        this.cityGuide = cityGuide;

    }

    /**
     *
     * @return the city guide
     */
    public String getCityGuide() {

        return cityGuide;

    }

    /**
     *
     * @param cityGuide for each city 
     */
    public void setCityGuide(String cityGuide) {

        this.cityGuide = cityGuide;

    }

    /**
     *
     * @return description of the class
     */
    @Override

    public String toString() {

        return "Guidance{" + "cityGuide=" + cityGuide + '}';

    }

   

    

}
    
    
    
    

