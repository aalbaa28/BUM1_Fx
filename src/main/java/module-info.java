module eus.ehu.bum1_fx {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens eus.ehu.bum1_fx to javafx.fxml;
    exports eus.ehu.bum1_fx;
}