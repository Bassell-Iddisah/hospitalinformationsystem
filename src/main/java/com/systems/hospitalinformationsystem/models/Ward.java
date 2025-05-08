package com.systems.hospitalinformationsystem.models;

public class Ward {
    private int WardNumber;
    private int NumBeds;
    private int SupervisorID;
    private int DepartmentCode;

    public Ward(int WardNumber, int NumBeds, int SupervisorID, int DepartmentCode) {
        WardNumber = WardNumber;
        NumBeds = NumBeds;
        SupervisorID = SupervisorID;
        DepartmentCode = DepartmentCode;
    }
}
