/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251project;

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
public class BookTest {
    
    public BookTest() {
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
     * Test of checkInfo method, of class Book.
     * To check if the method will check the information correctly as expected or not
     */
    @Test
    public void testCheckInfo() {
        System.out.println("checkInfo");
        String FirstName = "Bayan";
        String LastName = "mohammed";
        String ID = "1234567890";
        String Phone = "0592069600";
        String card = "1234567890";
        String CVV = "333";
        Book instance = new Book();
        boolean expResult = true;
        boolean result = instance.checkInfo(FirstName, LastName, ID, Phone, card, CVV);
        assertEquals(expResult, result);

    }


    
}
