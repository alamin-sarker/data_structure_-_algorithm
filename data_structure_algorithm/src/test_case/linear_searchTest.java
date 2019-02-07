/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test_case;

import data_structure_algorithm.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alamin
 */
public class linear_searchTest {
    
    public linear_searchTest() {
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
     * Test of search method, of class linear_search.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int[] Item = {1, 34, 6, 78, 23, 98, 61, 30, 6, 17};
        int n = Item.length;
        int x = 30;
        linear_search instance = new linear_search();
        int expResult = 7;
        int result = instance.search(Item, n, x);
        assertEquals(expResult, result);
        
    }
    
    
    @Test
    public void testSearch1() {
        System.out.println("search");
        int[] Item = {1, 34, 6, 78, 23, 98, 61, 30, 6, 17};
        int n = Item.length;
        int x = 50;
        linear_search instance = new linear_search();
        int expResult = -1;
        int result = instance.search(Item, n, x);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of main method, of class linear_search.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        linear_search.main(args);
        
    }
}
