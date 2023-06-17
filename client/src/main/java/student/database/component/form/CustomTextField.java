package student.database.component.form;

import javafx.scene.control.TextField;
import org.springframework.stereotype.Component;

@Component
public class CustomTextField extends TextField {
    public CustomTextField() {
        this.setFocusTraversable(false);
        this.getStyleClass().addAll("input", "input-border");
    }
}
