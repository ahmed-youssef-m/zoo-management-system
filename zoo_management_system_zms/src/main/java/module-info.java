module zoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires kernel;
    requires layout;
    requires slf4j.log4j12;
    requires io;
    
    opens zoo to javafx.fxml;
    exports zoo;
}
