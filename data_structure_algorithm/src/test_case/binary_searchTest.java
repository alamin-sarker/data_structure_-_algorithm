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
public class binary_searchTest {

    public binary_searchTest() {
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
     * Test of search method, of class binary_search.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int[] Item = {12, 45, 7, 89, 24, 0, 6, 8, 4};
        int n = Item.length;
        int x = 12;
        binary_search instance = new binary_search();
        int expResult = 0;
        int result = instance.search(Item, n, x);
        assertEquals(expResult, result);

    }

    /**
     * Test of main method, of class binary_search.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        binary_search.main(args);

    }
}
