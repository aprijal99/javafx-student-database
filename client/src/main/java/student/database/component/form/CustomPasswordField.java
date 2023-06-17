package student.database.component.form;

import javafx.geometry.Insets;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.springframework.stereotype.Component;

@Component
public class CustomPasswordField extends PasswordField {
    public CustomPasswordField() {
        this.setFocusTraversable(false);
        this.setCustomPasswordFieldStyles();
        this.setListener();
    }

    private void setCustomPasswordFieldStyles() {
        this.setStyle("-fx-background-color: #121212; -fx-text-fill: white;");
        this.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
        this.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(1))));
        this.setPadding(new Insets(15, 10, 15, 10));
    }

    private void setListener() {
        this.focusedProperty().addListener((observable, oldStatus, newStatus) -> {
            if (newStatus) {
                this.setBorder(new Border(new BorderStroke(Color.web("#006bcb"), BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(1))));
            } else {
                this.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(1))));
            }
        });
    }
}
