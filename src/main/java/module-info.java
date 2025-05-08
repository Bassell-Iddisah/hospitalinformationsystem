module com.systems.hospitalinformationsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.systems.hospitalinformationsystem to javafx.fxml;
    exports com.systems.hospitalinformationsystem;
}