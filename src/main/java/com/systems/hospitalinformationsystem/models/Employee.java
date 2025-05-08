package com.systems.hospitalinformationsystem.models;

public class Employee {
    private int EmpoyeeID;
    private String FirstName;
    private String LastName;
    private String Address;
    private String Phone;

    public Employee(int EmployeeID, String FirstName, String LastName, String Address, String Phone) {
        EmployeeID = EmployeeID;
        FirstName = FirstName;
        LastName = LastName;
        Address = Address;
        Phone = Phone;
    }

    // Getters
    public int getEmployeeID() { return EmpoyeeID; }
    public String getFirstName() { return FirstName; }
    public String getLastName() { return LastName; }
    public String getAddress() { return Address; }
    public String getPhone() { return Phone; }
}
