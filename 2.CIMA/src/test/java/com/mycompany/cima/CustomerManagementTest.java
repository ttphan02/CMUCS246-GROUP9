/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cima;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class CustomerManagementTest {
    
    public CustomerManagementTest() {
    }

    @org.junit.jupiter.api.Test
    public void testGetCustomerList() {
    }

    @org.junit.jupiter.api.Test
    public void testValidateAndCheckDate() {
        String date = "02/10/2004";
        boolean result = true;
        assertEquals(result, date);
        
        String date1 = "02/13/2004";
        boolean result1 = false;
        assertEquals(result1, date1);
        
        String date2 = "02/13/200";
        boolean result2 = false;
        assertEquals(result2, date2);
        
    }

    @org.junit.jupiter.api.Test
    public void testIsValidEmail() {
        String email = "phemotchut@gmail.com";
        boolean check = true;
        assertEquals(email, check);
        
        String email2 = "phemotchut@gmail";
        boolean check2 = false;
        assertEquals(email2, check2);
    }

    @org.junit.jupiter.api.Test
    public void testIsValidVietnamesePhoneNumber() {
        String pn = "0858421429";
        boolean check = true;
        assertEquals(pn, check);
        
        String pn2 = "02ifnu2y32";
        boolean check2 = true;
        assertEquals(pn2, check2);
        
        String pn3 = "085842142";
        boolean check3 = true;
        assertEquals(pn3, check3);

    }

    @org.junit.jupiter.api.Test
    public void testAddCustomer() {
        
    }

    @org.junit.jupiter.api.Test
    public void testMain() {
    }

    @org.junit.jupiter.api.Test
    public void testUpdateCustomer() {
    }
    
}
