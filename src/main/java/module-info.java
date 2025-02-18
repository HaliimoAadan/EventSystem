module dk.haliimo.eventsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.haliimo.eventsystem to javafx.fxml;
    exports dk.haliimo.eventsystem;
}