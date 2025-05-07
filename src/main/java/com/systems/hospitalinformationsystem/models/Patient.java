package com.systems.hospitalinformationsystem.models;

public class Patient {
    private int PatientID;
    private String Firstname;
    private String Lastname;
    private String Address;
    private String Phone;

    public Patient(int PatientID, String Firstname, String Lastname, String Address, String Phone) {
        PatientID = PatientID;
        Firstname = Firstname;
        Lastname = Lastname;
        Address = Address;
        Phone = Phone;
    }
}
