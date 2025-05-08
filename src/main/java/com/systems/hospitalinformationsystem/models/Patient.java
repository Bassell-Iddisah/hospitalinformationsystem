package com.systems.hospitalinformationsystem.models;

public class Patient {
    private int PatientID;
    private String Firstname;
    private String Lastname;
    private String Address;
    private String Phone;

    public Patient(int PatientID, String Firstname, String Lastname, String Address, String Phone) {
        this.PatientID = PatientID;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Address = Address;
        this.Phone = Phone;
    }

    // Setters

    public void setPatientID(int patientID) {
        PatientID = patientID;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    // Getters

    public int getPatientID() {
        return PatientID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }
}
