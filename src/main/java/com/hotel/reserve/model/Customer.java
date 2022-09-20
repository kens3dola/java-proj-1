package com.hotel.reserve.model;

import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public static final String REGEX = "[A-z0-9]+@[A-z0-9]+\\.[A-z0-9]+";

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (Pattern.matches(REGEX, email))
            this.email = email;
        else throw new IllegalArgumentException("Invalid email: " + email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
