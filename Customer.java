/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugaspraktikum8;



import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private final List<Order> orderList = new ArrayList<Order>();



    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
    return name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

}