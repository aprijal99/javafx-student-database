package student.database.container;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import org.springframework.stereotype.Component;

@Component
public class Login extends HBox {
    public Login() {
        Button okButton = new Button("OK");
        Button cancelButton = new Button("Cancel");

        this.setPrefSize(200, 100);
        this.getChildren().addAll(okButton, cancelButton);
        this.setAlignment(Pos.CENTER);
        this.setStyle(
                "-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;"
        );
    }
}
