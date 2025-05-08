package com.systems.hospitalinformationsystem.DAO;

import com.systems.hospitalinformationsystem.exceptions.InvalidInputException;
import com.systems.hospitalinformationsystem.models.Patient;
import com.systems.hospitalinformationsystem.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {
    // Add new patients to the database
    public void insertPatient(Patient patient) throws InvalidInputException, SQLException {
        if (patient.getFirstname() == null || patient.getFirstname().isEmpty()) {
            throw new InvalidInputException("Cannot accept empty field");
        }

        String sql = "INSERT INTO patient VALUES(?, ?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, patient.getPatientID());
            statement.setString(2, patient.getFirstname());
            statement.setString(3, patient.getLastname());
            statement.setString(4, patient.getAddress());
            statement.setString(5, patient.getPhone());

            statement.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("The patient ID already exists.");
        } catch (SQLException e) {
            System.err.println("Failed inserting patient details");
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Get all patients in an Arraylist
    public List<Patient> getAllPatients() throws SQLException {
        List<Patient> patients = new ArrayList<>();
        String sql = "SELECT * FROM Patient";

        try (Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
        ) { while (resultSet.next()) {
            Patient patient = new Patient(
                    resultSet.getInt("PatientID"),
                    resultSet.getString("FirstName"),
                    resultSet.getString("LastName"),
                    resultSet.getString("Address"),
                    resultSet.getString("Phone")
            );

            patients.add(patient);
        }
        } catch (SQLException e) {
            System.err.println("There was a problem getting patient details: \n" + e.getMessage());
        }
        return patients;
    }

    // Update patient information in the database
    public void updatePatientDetails(int PatientID, String firstname, String lastname, String address, String phone) {
        String sql = "UPDATE patient SET FirstName = ?, LastName = ?, Address = ?, Phone = ?, WHERE patientid = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)
    ) {
            statement.setString(1, firstname);
            statement.setString(2, lastname);
            statement.setString(3, address);
            statement.setString(4, phone);
            statement.setInt(5, PatientID);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Patient details successfully updated");
            } else {
                System.out.println("No patient with ID found");
            }
    } catch(SQLException e) {
            System.err.println("Failed to update patient: \n" + e.getMessage());
        }
    }

    // Delete a patient from the database
    public void deletePatient(int PatientID) {
        String sql = "DELETE FROM patient WHERE PatientID = ?";

        try (Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setInt(1, PatientID);
            statement.executeUpdate();
            System.out.println("Successfully deleted patient details");
        } catch (SQLException e) {
            System.out.println("There was a problem deleting the patient record: \n" + e.getMessage());
        }
    }
}
