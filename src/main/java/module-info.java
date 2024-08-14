module org.example.take {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.take to javafx.fxml;
    exports org.example.take;
}