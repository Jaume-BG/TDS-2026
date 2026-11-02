module um.tds {
    requires javafx.controls;
    requires javafx.fxml;

    opens um.tds to javafx.fxml;
    exports um.tds;
}
