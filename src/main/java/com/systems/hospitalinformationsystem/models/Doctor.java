package com.systems.hospitalinformationsystem.models;

public class Doctor extends Employee{
    private String Specialization;

    public Doctor(int EmployeeID, String FirstName, String LastName, String Address, String Phone, String Specialization) {
        super(EmployeeID, FirstName, LastName, Address, Phone);
        Specialization = Specialization;
    }
}
