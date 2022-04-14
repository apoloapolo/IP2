module br.ufrpe.testejavafx.testejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens br.ufrpe.testejavafx.testejavafx to javafx.fxml;
    exports br.ufrpe.testejavafx.testejavafx;
}