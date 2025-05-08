package com.systems.hospitalinformationsystem.models;

public class Hospitalization {
    private int PatientID;
    private int DepartmentCode;
    private int WardNumber;
    private int BedNumber;
    private int PrimaryDoctorID;
    private String Diagnosis;
    private String AdmissionDate;

    public Hospitalization(int PatientID, int Department, int WardNumber, int BedNumber, int PrimaryDoctorID, String Diagnosis, String AdmissionDate) {
        PatientID = PatientID;
        Department = Department;
        WardNumber = WardNumber;
        BedNumber = BedNumber;
        PrimaryDoctorID = PrimaryDoctorID;
        Diagnosis = Diagnosis;
        AdmissionDate = AdmissionDate;
    }
}
