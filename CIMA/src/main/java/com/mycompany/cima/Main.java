/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.customers_manager; 

/**
 *
 * @author nduc6
 */

  import java.util.ArrayList;
import java.util.List;

class ManagerCustomers {
    private String name;
    private int age;
    private int id;

    public ManagerCustomers(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ManagerCustomers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

class CustomerManager {
    private List<ManagerCustomers> customerList;

    public CustomerManager() {
        this.customerList = new ArrayList<>();
    }

    public void addCustomer(ManagerCustomers customer) {
        customerList.add(customer);
    }

    public void removeCustomer(int id) {
        customerList.removeIf(customer -> customer.getId() == id);
    }

    public List<ManagerCustomers> getCustomerList() {
        return customerList;
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();

        // Them khach hang 
        ManagerCustomers customer1 = new ManagerCustomers("Alice", 30, 1);
        ManagerCustomers customer2 = new ManagerCustomers("Bob", 25, 2);
        manager.addCustomer(customer1);
        manager.addCustomer(customer2);

        // hien thi danh sach khach hang truoc khi xoa 
        System.out.println("hien thi danh sach khach hang truoc khi xoa :");
        for (ManagerCustomers customer : manager.getCustomerList()) {
            System.out.println(customer.toString());
        }

        // Xóa khách hàng
        manager.removeCustomer(2);

        // hien thi danh sach khach hang sau khi xoa 
        System.out.println("\nhien thi danh sach khach hang sau khi xoa :");
        for (ManagerCustomers customer : manager.getCustomerList()) {
            System.out.println(customer.toString());
        }
    }
}