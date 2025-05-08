package com.systems.hospitalinformationsystem.models;

public class Department {
    private String Code;
    private String Name;
    private int Building;
    private int Ward;
    private int DirectorID;

    public Department (String Code, String Name, int Building, int Ward, int DirectorID) {
        Code = Code;
        Name = Name;
        Building = Building;
        Ward = Ward;
        DirectorID = DirectorID;
    }
}
