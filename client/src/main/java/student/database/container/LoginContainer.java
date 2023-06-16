package student.database.container;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import org.springframework.stereotype.Component;
import student.database.component.login.LoginForm;
import student.database.component.login.LoginImage;

@Component
public class LoginContainer extends HBox {
    private final LoginImage loginImage;
    private final LoginForm loginForm;

    public LoginContainer(LoginImage loginImage, LoginForm loginForm) {
        this.loginImage = loginImage;
        this.loginForm = loginForm;

        this.layoutChildrenNodes();
        this.setLoginContainerStyles();
    }

    private void layoutChildrenNodes() {
        this.getChildren().addAll(loginImage, loginForm);
        this.setAlignment(Pos.CENTER);
    }

    private void setLoginContainerStyles() {
        this.setStyle("-fx-background-color: #121212");
        this.setPrefSize(1200, 700);
    }
}
