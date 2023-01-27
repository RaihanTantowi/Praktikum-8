/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugaspraktikum8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        
        Customer imam = new Customer();
        imam.setName("Raihan Tantowi");
        imam.setAddress("Perum Telaga Murni Blok. C25 No. 5");
        System.out.println("Pesanan : " + imam.getName() );
        System.out.println("Alamat Pesanan : " + imam.getAddress());

        System.out.println("=====================================================");

        Order gofood = new Order();
        imam.addOrder(gofood);
        gofood.calcSubTotal();
        gofood.calcTax();
        gofood.calcTotal();
        gofood.calcTotalWeight();
        gofood.setDate(LocalDate.now());
        gofood.setStatus("Kurir mengambil Pesanan");
        System.out.println("Tanggal Pesanan : " + gofood.getDate());
        System.out.println("Status pesanan : " + gofood.getStatus());

        System.out.println("=====================================================");

        OrderDetail detailOrderGoFood = new OrderDetail(gofood);
        detailOrderGoFood.calcSubTotal();
        detailOrderGoFood.calcWeight();
        detailOrderGoFood.calcTax();
        detailOrderGoFood.setQuantity(5);
        detailOrderGoFood.setTaxStatus("Pajak 2%");
        gofood.addOrderDetail(detailOrderGoFood);
        System.out.println("Jumlah Pesanan: " + detailOrderGoFood.getQuantity());
        System.out.println("Status Pajak: " + detailOrderGoFood.getTaxStatus());

        System.out.println("=====================================================");

        Item item = new Item();
        item.getPriceForQuantity();
        item.getTax();
        item.inStock();
        item.setShippingWeight(10.0);
        item.setDescription("Barang Elektronik");
        item.addOrderDetail(detailOrderGoFood);
        System.out.println("Total berat pengiriman sebesar: " + item.getShippingWeight() + "Kg.");
        System.out.println("Deskripsi barang: " + item.getDescription());

        Cash cash = new Cash();
        cash.setCashTendered((float) 12000.0);
        gofood.addCashList(cash);
        System.out.println("Pembayaran ongkos kirim : Rp" + (int) cash.getCashTendered());

        System.out.println("=====================================================");

        Check check = new Check();
        check.setName("Raihan Tantowi");
        check.setBankID("292832932932");
        check.authorized();
        gofood.addCheckList(check);
        System.out.println("Pembayaran atas nama " + check.getName() + " dengan IDBank " + check.getBankID());

        System.out.println("=====================================================");

        Credit credit = new Credit();
        credit.authorized();
        credit.setNumber("4567891230123658");
        credit.setType("Debit");
        credit.setExpDate(LocalDate.now());
        gofood.addCreditList(credit);
        System.out.println("Nomor kartu credit " + credit.getNumber() + " dengan tipe " + credit.getType() + " akan berakhir pada " + credit.getExpDate());

        System.out.println("Terima kasih telah berbelanja ditoko kami.");
    }
}