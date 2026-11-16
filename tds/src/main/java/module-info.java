module um.tds {
    requires javafx.controls;
    requires javafx.fxml;

    opens um.tds.fxml to javafx.fxml;
    exports um.tds.aplicacion;
}
