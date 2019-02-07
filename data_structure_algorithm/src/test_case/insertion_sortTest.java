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
public class insertion_sortTest {

    public insertion_sortTest() {
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
     * Test of sort method, of class insertion_sort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] A = {8, 5, 1, 6, 2, 3};
        int n = A.length;
        insertion_sort instance = new insertion_sort();
        int[] expResult = {1, 2, 3, 5, 6, 8};
        int[] result = instance.sort(A, n);
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of main method, of class insertion_sort.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        insertion_sort.main(args);

    }
}
