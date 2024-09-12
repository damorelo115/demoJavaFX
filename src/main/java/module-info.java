module lauren.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens lauren.demojavafx to javafx.fxml;
    exports lauren.demojavafx;
}