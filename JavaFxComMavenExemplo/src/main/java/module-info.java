module com.mycompany.javafxcommavenexemplo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafxcommavenexemplo to javafx.fxml;
    exports com.mycompany.javafxcommavenexemplo;
}
