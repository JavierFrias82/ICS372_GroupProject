module org.demo.hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;


    opens org.demo.hellofx to javafx.fxml;
    exports org.demo.hellofx;
}