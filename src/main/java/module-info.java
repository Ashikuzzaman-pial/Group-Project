open module com.example.group_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


//    opens com.example.group_project to javafx.fxml;
    exports com.example.group_project;
    exports com.example.group_project.President.Controller;
    exports com.example.group_project.FactoryRepresentative;
    exports com.example.group_project.GeneralMember.Controller;
    exports com.example.group_project.WelfareOfficer.Controller;
    exports com.example.group_project.FactoryRepresentative.Controller;
    exports com.example.group_project.WelfareOfficer.Model;
    exports com.example.group_project.FactoryRepresentative.Model;
//    opens com.example.group_project.President.Controller to javafx.fxml;
}