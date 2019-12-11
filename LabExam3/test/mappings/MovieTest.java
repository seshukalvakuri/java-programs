/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class MovieTest {
    
    public MovieTest() {
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
     * Test of getMovieRevenue method, of class Movie.
     */
    @Test
    public void testGetMovieRevenue() {
        System.out.println("getMovieRevenue");
        Movie instance = null;
        String expResult = "";
        String result = instance.getMovieRevenue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieReleaseYear method, of class Movie.
     */
    @Test
    public void testGetMovieReleaseYear() {
        System.out.println("getMovieReleaseYear");
        Movie instance = null;
        String expResult = "";
        String result = instance.getMovieReleaseYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirector method, of class Movie.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        Movie instance = null;
        Person expResult = null;
        Person result = instance.getDirector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
