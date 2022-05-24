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
import pkg251project.Booking;
/**
 *
 * @author msmil
 */
public class BookingTest {
    
    public BookingTest() {
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
     * Test of calculatePrice method, of class Booking.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        Booking instance = new Booking();
        double price = 300.0;
        boolean fursan = true;
        double expResult =255.0;
        double result = instance.calculatePrice(price,fursan);
        assertTrue(expResult==result);

    }

    /**
     * Test of calculateVat method, of class Booking.
     */
    @Test
    public void testCalculateVat() {
        System.out.println("calculateVat");
        Booking instance = new Booking();
        double vat = 0.15;
        double price = 50.0;
        double expResult = vat*price;
        double result =instance.calculateVat(price);
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of discount method, of class Booking.
     */
    @Test
    public void testDiscount() {
        System.out.println("discount");
        boolean fursan = true;
        double price = 50.0;
        Booking instance = new Booking();
        double expResult = 15.0;
        double result = instance.discount(fursan,price);
        assertEquals(expResult, result,0.0);

    }

}
