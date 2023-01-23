module com.example.coursjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coursjava to javafx.fxml;
    exports com.example.coursjava;
}