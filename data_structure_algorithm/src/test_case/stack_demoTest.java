/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test_case;

import data_structure_algorithm.*;
import java.util.Stack;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data_structure_algorithm.stack_demo;

import static org.junit.Assert.*;

/**
 *
 * @author Alamin
 */
public class stack_demoTest {

    public stack_demoTest() {
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
     * Test of showpush method, of class stack_demo.
     */
    @Test
    public void testShowpush() {
        System.out.println("showpush");
        Stack st = new Stack();
        int a = 42;
        st.push(new Integer(a));
        stack_demo.showpush(st, a);

    }

    /**
     * Test of showpop method, of class stack_demo.
     */
    @Test
    public void testShowpop() {
        System.out.println("showpop");
        Stack st = new Stack();
        st.push(new Integer(42));
        stack_demo.showpop(st);

    }

    /**
     * Test of main method, of class stack_demo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        stack_demo.main(args);

    }
}
