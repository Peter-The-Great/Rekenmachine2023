module org.hhs.rekenmachine {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens org.hhs.rekenmachine to javafx.fxml;
    exports org.hhs.rekenmachine;
}