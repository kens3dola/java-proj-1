package com.hotel.reserve.model;

import com.hotel.reserve.model.Customer;

public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("first", "second", "j@domain.com");
        System.out.println(customer);

        Customer customer2 = new Customer("first", "second", "j");
        System.out.println(customer2);
    }
}
