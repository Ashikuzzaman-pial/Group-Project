open module com.example.group_project {
    requires javafx.controls;
    requires javafx.fxml;


//    opens com.example.group_project to javafx.fxml;
    exports com.example.group_project;
    exports com.example.group_project.President.Controller;
    exports com.example.group_project.FactoryRepresentative;
//    opens com.example.group_project.President.Controller to javafx.fxml;
}