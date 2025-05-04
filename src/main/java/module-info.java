module com.systems.hospitalinformationsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.systems.hospitalinformationsystem to javafx.fxml;
    exports com.systems.hospitalinformationsystem;
}