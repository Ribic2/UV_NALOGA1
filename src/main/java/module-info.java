module com.example.uv_naloga1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uv_naloga1 to javafx.fxml;
    exports com.example.uv_naloga1;
}