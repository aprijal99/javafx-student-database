package student.database.component.form;

import javafx.scene.control.PasswordField;
import org.springframework.stereotype.Component;

@Component
public class CustomPasswordField extends PasswordField {
    public CustomPasswordField() {
        this.setFocusTraversable(false);
        this.getStyleClass().addAll("input", "input-border");
    }
}
