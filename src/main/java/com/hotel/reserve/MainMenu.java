package com.hotel.reserve;

import com.hotel.reserve.api.AdminResource;
import com.hotel.reserve.api.HotelResource;
import com.hotel.reserve.service.IRoom;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class MainMenu {
    private static final Scanner sc = new Scanner(System.in);
    private static final String menu = """
            1. Find and reserve a room
            2. See my reservations
            3. Create an account
            4. Admin
            5. Exit
            """;
    private static final String adminMenu = """
            1. See all Customers
            2. See all Rooms
            3. See all Reservations
            4. Add a Room
            5. Back to Main Menu
            """;

    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println(menu);
            Date checkin, checkout;
            option = sc.nextInt();
            switch (option) {
                case 1:
                    do{
                        System.out.println("Enter checkin date mm/dd/yyyy");
                        checkin = Utils.getDate(sc.nextLine());
                    }while (checkin == null);
                    System.out.println("Enter checkout date mm/dd/yyyy");
                    do{
                        System.out.println("Enter checkin date mm/dd/yyyy");
                        checkout = Utils.getDate(sc.nextLine());
                    }while (checkout == null);
                    Collection<IRoom> rooms = HotelResource.instance.findARoom(checkin, checkout);
                    break;
                case 2:
                    HotelResource.instance.getCustomersReservations();
                    break;
                case 3:
                    HotelResource.instance.createACustomer();
                    break;
                case 4:
                    adminMenu();
                    break;
            }
        } while (option != 5);
    }

    private static void adminMenu(){
        int option = 0;
        do {
            System.out.println(adminMenu);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    AdminResource.instance.getAllCustomers();
                    break;
                case 2:
                    AdminResource.instance.getAllRooms();
                    break;
                case 3:
                    AdminResource.instance.displayAllReservations();
                    break;
                case 4:
                    AdminResource.instance.addRoom();
                    break;
                case 5:
                    break;

            }
        } while (option != 5);
    }
}
