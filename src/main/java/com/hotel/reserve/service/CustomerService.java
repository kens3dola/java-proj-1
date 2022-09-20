package com.hotel.reserve.service;

import com.hotel.reserve.model.Customer;

import java.util.Collection;

public class CustomerService {

    public static final CustomerService instance = new CustomerService();

    private CustomerService(){
    }

    public void addCustomer(String email, String firstName, String lastName){

    }
    public Customer getCustomer(String customerEmail){

    }

    public Collection<Customer> getAllCustomers(){

    }
}
