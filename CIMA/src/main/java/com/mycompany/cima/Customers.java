/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cima;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Customers {
    private String name,id,email,sdt,address,Gt;
    private String DoB,DoS; 

    public Customers(String name, String id, String email, String sdt, String address, String Gt, String DoB, String DoS) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.sdt = sdt;
        this.address = address;
        this.Gt = Gt;
        this.DoB = DoB;
        this.DoS = DoS;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public String getDoS() {
        return DoS;
    }

    public void setDoS(String DoS) {
        this.DoS = DoS;
    }

    public String getGt() {
        return Gt;
    }
    public void setGt(String Gt) {
        this.Gt = Gt;
    }
    
}
