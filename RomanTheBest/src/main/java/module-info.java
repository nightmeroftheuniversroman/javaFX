module com.example.romanthebest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.romanthebest to javafx.fxml;
    exports com.example.romanthebest;

    exports _11_07;
    opens _11_07;
}