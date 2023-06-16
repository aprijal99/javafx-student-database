package student.database.container;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import org.springframework.stereotype.Component;
import student.database.component.login.LoginImage;

@Component
public class LoginContainer extends HBox {
    private final LoginImage loginImage;

    public LoginContainer(LoginImage loginImage) {
        this.loginImage = loginImage;

        this.layoutChildrenNodes();
        this.setLoginContainerStyles();
    }

    private void layoutChildrenNodes() {
        this.getChildren().add(loginImage);
        this.setAlignment(Pos.CENTER);
    }

    private void setLoginContainerStyles() {
        this.setStyle("-fx-background-color: #121212");
        this.setPrefSize(900, 700);
    }
}
