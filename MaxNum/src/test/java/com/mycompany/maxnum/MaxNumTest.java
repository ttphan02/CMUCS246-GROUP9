/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.maxnum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class MaxNumTest {

    @Test
    public void testWithNomalArr() {
        MaxNum m = new MaxNum();
        int A[] ={4,5,3,6,3,2};
        int result = 6;
        assertEquals(m.fiMaxNum(A), result);
    }
    @Test
    public void testWithNegativeArr() {
        MaxNum m = new MaxNum();
        int A[] ={-4,-5,-3,-6,-3,-2};
        int result = -2;
        assertEquals(m.fiMaxNum(A), result);
    }
    
}
