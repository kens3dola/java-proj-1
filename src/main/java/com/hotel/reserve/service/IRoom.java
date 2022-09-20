package com.hotel.reserve.service;

import com.hotel.reserve.model.RoomType;

public interface IRoom {

    String getRoomNumber();
    Double getRoomPrice();
    RoomType getRoomType();
    boolean isFree();
}
