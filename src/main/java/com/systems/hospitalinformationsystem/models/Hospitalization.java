package com.systems.hospitalinformationsystem.models;

public class Hospitalization {
    private int HospitalizationID;
    private int PatientID;
    private int DoctorID;
    private int DepartmentCode;
    private int WardNumber;
    private int BedNumber;
    private String Diagnosis;
    private String AdmissionDate;

    public Hospitalization(int HospitalizationID, int PatientID, int DepartmentCode, int WardNumber, int BedNumber, int DoctorID, String Diagnosis, String AdmissionDate) {
        HospitalizationID = HospitalizationID;
        PatientID = PatientID;
        DepartmentCode = DepartmentCode;
        WardNumber = WardNumber;
        BedNumber = BedNumber;
        DoctorID = DoctorID;
        Diagnosis = Diagnosis;
        AdmissionDate = AdmissionDate;
    }
}
