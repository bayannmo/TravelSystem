/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251project;

import java.io.IOException;
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
public class SignUpTest {
    
    public SignUpTest() {
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
     * Test of countlines method, of class SignUp. to check if the method read the line in a userInfo.txt right or wrong.
     * The method shoulde faild if the lines more or less than 6 and pass if the lines equal 6
     */
    @Test
    public void testCountLines() {
        System.out.println("countLines");
        SignUp instance = new SignUp();
        int expResult=6;
        int result = instance.countLines();
        assertTrue(result==expResult);
    }

    /**
     * Test of checkSignUp method, of class SignUp.
     * To check if the method will check the information correctly as expected or not
     */
    @Test
    public void testCheckSignUp() {
        System.out.println("checkSignUp");
        String username = "reham";
        String email = "roro1@gmail.com";
        String password = "12345";
        String phone1 = "";
        SignUp instance = new SignUp();
        boolean result = instance.checkSignUp(username, email, password, phone1);
        assertFalse(result);
    }



    /**
     * Test of readFile method, of class SignUp.
     * To check if the file inside the readFile method it has been read or not
     */
    @Test
    public void testReadFile() throws IOException {
        System.out.println("readFile");
        SignUp instance = new SignUp();
        int result = instance.readFile();
        //Number of Character inside the file
        assertTrue(result != -1);
    }



 
}
