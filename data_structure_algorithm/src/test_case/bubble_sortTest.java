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
public class bubble_sortTest {

    public bubble_sortTest() {
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
     * Test of sort method, of class bubble_sort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] Item = {6, 41, 29, 12};
        int n = Item.length;
        bubble_sort instance = new bubble_sort();
        int[] expResult = {6, 12, 29, 41};
        int[] result = instance.sort(Item, n);

        assertArrayEquals(expResult, result);

    }

    @Test
    public void testSort1() {
        System.out.println("sort");
        int[] Item = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = Item.length;
        bubble_sort instance = new bubble_sort();
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = instance.sort(Item, n);

        assertArrayEquals(expResult, result);

    }

    /**
     * Test of main method, of class bubble_sort.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        bubble_sort.main(args);

    }
}
