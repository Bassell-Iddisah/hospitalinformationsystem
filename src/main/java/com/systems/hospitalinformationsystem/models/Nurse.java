package com.systems.hospitalinformationsystem.models;

public class Nurse extends Employee {
    private String Department;
    private String Rotation;
    private int Salary;

    public Nurse(int EmployeeID, String FirstName, String LastName, String Address, String Phone, String Rotation, int Salary) {
        super(EmployeeID, FirstName, LastName, Address, Phone);
        Rotation = Rotation;
        Salary = Salary;
    }
}
