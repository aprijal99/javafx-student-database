package student.database.component.login;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import org.springframework.stereotype.Component;

@Component
public class LoginImage extends VBox {
    public LoginImage() {
        Button button = new Button("OK");
        this.getChildren().add(button);

        this.setLoginImageStyles();
    }

    private void setLoginImageStyles() {
        this.setAlignment(Pos.CENTER);
    }
}
