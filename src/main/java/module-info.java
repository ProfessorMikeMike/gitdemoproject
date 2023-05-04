module edu.pgcc.int2200 {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.pgcc.int2200 to javafx.fxml;
    exports edu.pgcc.int2200;
}
