package com.systems.hospitalinformationsystem;

import com.systems.hospitalinformationsystem.DAO.PatientDAO;
import com.systems.hospitalinformationsystem.exceptions.InvalidInputException;
import com.systems.hospitalinformationsystem.models.Patient;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PatientDAO dao = new PatientDAO();

        // Insert a new patient
        Patient newPatient = new Patient(1, "Ali", "Khan", "123 Street", "0241234567");
        try {
            dao.insertPatient(newPatient);
        } catch (InvalidInputException | SQLException e) {
            System.err.println("Error inserting patient: " + e.getMessage());
        }

        // Retrieve all patients
        try {
            List<Patient> patients = dao.getAllPatients();
            for (Patient p : patients) {
                System.out.println("ID: " + p.getPatientID() + ", Name: " + p.getFirstname() + " " + p.getLastname());
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving patients: " + e.getMessage());
        }

        // Update patient details
        dao.updatePatientDetails(1, "Aliu", "Khan", "456 Avenue", "0249876543");

        // Delete the patient
        dao.deletePatient(1);
    }
}
