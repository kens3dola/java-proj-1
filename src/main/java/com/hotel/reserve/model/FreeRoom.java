package com.hotel.reserve.model;

public class FreeRoom extends Room{
    public FreeRoom(){
        this.price = 0d;
    }

    @Override
    public String toString() {
        return "FreeRoom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", enumeration=" + enumeration +
                '}';
    }
}
