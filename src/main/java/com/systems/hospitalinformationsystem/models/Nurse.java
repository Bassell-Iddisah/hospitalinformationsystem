package com.systems.hospitalinformationsystem.models;

public class Nurse extends Employee {
    private String Department;
    private String Rotation;
    private String DepartmentCode;
    private int Salary;

    public Nurse(int EmployeeID, String FirstName, String LastName, String Address, String Phone, String Rotation,String DepartmentCode, int Salary) {
        super(EmployeeID, FirstName, LastName, Address, Phone);
        Rotation = Rotation;
        DepartmentCode = DepartmentCode;
        Salary = Salary;
    }
}
