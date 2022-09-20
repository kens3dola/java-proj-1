package com.hotel.reserve.service;

import com.hotel.reserve.model.Customer;
import com.hotel.reserve.model.Reservation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ReservationService {

    public static final ReservationService instance = new ReservationService();
    private  ReservationService(){}

    List<Reservation> reservationList = new ArrayList<>();

    public void addRoom(IRoom room) {

    }

    public IRoom getARoom(String roomId) {

    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {

    }

    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {

    }

    public Collection<Reservation> getCustomersReservation(Customer customer) {

    }

    public void printAllReservation() {

    }

}
