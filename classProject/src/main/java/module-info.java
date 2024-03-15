module org.example.classproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.classproject to javafx.fxml;
    exports org.example.classproject;
}