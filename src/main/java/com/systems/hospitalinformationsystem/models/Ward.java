package com.systems.hospitalinformationsystem.models;

public class Ward {
    private int WardID;
    private int WardNumber;
    private int NumBeds;
    private int SupervisorID;
    private int DepartmentCode;

    public Ward(int WardID, int WardNumber, int NumBeds, int SupervisorID, int DepartmentCode) {
        WardID = WardID;
        WardNumber = WardNumber;
        NumBeds = NumBeds;
        SupervisorID = SupervisorID;
        DepartmentCode = DepartmentCode;
    }
}
