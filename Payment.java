/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugaspraktikum8;



public abstract class Payment {
    private float amount;
    private final Order order;

    public Payment() {
        order = new Order();
    }
}