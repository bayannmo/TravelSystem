/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macbookpro
 */
public class MainMenuTest {
    
    public MainMenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of AddHotels method, of class MainMenu.
     */    
    @Test 
    public void testAddHotels() throws FileNotFoundException{
            File inputFile = new File("input.txt");
            Scanner input = new Scanner(inputFile);
            ArrayList<Hotels> h = new ArrayList<Hotels>();
            MainMenu instance = null;
            instance.AddHotels(input, h);
            assertTrue(h.size()!=0);
            
    }
    
        /**
     * Test of AddPlaces method, of class MainMenu.
     */    
    @Test 
    public void testAddPlaces() throws FileNotFoundException{
            File inputFile = new File("input.txt");
            Scanner input = new Scanner(inputFile);
            ArrayList<Places> p = new ArrayList<Places>();
            MainMenu instance = null;
            instance.AddPlaces(input, p);
            Places place = p.get(0);
            assertNotNull(place);
            
    }
    
    


    
}
