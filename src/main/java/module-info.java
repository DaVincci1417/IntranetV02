module com.example.tarea_intranetv2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tarea_intranetv2 to javafx.fxml;
    exports com.example.tarea_intranetv2;
}