/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugaspraktikum8;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private double shippingWeight;
    private String description;
    private List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();

    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        this.orderDetailList.add(orderDetail);
    }

    public void getPriceForQuantity() {
        System.out.println("Getting price for quantity...");
    }

    public void getTax() {
        System.out.println("Getting Tax...");
    }

    public void inStock() {
        System.out.println("In Stock!");
    }
}