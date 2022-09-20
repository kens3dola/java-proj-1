package com.hotel.reserve.api;

import com.hotel.reserve.model.Customer;
import com.hotel.reserve.model.Reservation;
import com.hotel.reserve.service.IRoom;

import java.util.Collection;
import java.util.Date;

public class HotelResource {

    public static final HotelResource instance = new HotelResource();
    private HotelResource(){}
    public Customer getCustomer(String email){

    }
    public void createACustomer(String  email,  String firstName, String lastName){

    }
    public IRoom getRoom(String roomNumber){

    }
    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date CheckOutDate){

    }
    public Collection<Reservation> getCustomersReservations(String customerEmail){

    }
    public Collection<IRoom> findARoom(Date checkIn, Date checkOut){

    }
}
