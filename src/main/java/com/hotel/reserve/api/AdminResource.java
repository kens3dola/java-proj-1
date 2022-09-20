package com.hotel.reserve.api;

import com.hotel.reserve.model.Customer;
import com.hotel.reserve.service.IRoom;

import java.util.Collection;
import java.util.List;

public class AdminResource {
    public static final AdminResource instance = new AdminResource();
    private AdminResource(){}
    public Customer getCustomer(String email){

    }
    public void addRoom(List<IRoom> rooms){

    }
    public Collection<IRoom> getAllRooms(){

    }
    public Collection<Customer> getAllCustomers(){

    }
    public void displayAllReservations(){

    }
}
