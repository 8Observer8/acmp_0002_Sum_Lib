/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.sum;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class SumTest {
    
    public SumTest() {
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

    @Test
    public void testSum_from_1_to_5() {
        System.out.println("from_1_to_5");
        int n = 5;
        int expResult = 15;
        int result = Sum.sum(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum_from_1_to_3() {
        System.out.println("from_1_to_3");
        int n = 3;
        int expResult = 6;
        int result = Sum.sum(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum_from_1_to_1() {
        System.out.println("from_1_to_1");
        int n = 1;
        int expResult = 1;
        int result = Sum.sum(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum_from_1_to_zero() {
        System.out.println("from_1_to_zero");
        int n = 0;
        int expResult = 1;
        int result = Sum.sum(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum_from_1_to_minus_1() {
        System.out.println("from_1_to_minus_1");
        int n = -1;
        int expResult = 0;
        int result = Sum.sum(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum_from_1_to_minus_2() {
        System.out.println("from_1_to_minus_2");
        int n = -2;
        int expResult = -2;
        int result = Sum.sum(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum_from_1_to_minus_3() {
        System.out.println("from_1_to_minus_3");
        int n = -3;
        int expResult = -5;
        int result = Sum.sum(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum_from_1_to_minus_4() {
        System.out.println("from_1_to_minus_4");
        int n = -4;
        int expResult = -9;
        int result = Sum.sum(n);
        assertEquals(expResult, result);
    }
}