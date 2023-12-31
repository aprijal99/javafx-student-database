package student.database.container;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import org.springframework.stereotype.Component;
import student.database.component.login.LoginForm;
import student.database.component.login.LoginImage;

@Component
public class LoginContainer extends TilePane {
    private final LoginImage loginImage;
    private final LoginForm loginForm;

    public LoginContainer(LoginImage loginImage, LoginForm loginForm) {
        this.loginImage = loginImage;
        this.loginForm = loginForm;

        this.layoutNodes();
        this.setStyling();
    }

    private void layoutNodes() {
        this.getChildren().addAll(loginForm, loginImage);
    }

    private void setStyling() {
        this.setHgap(50);
        this.setAlignment(Pos.CENTER);
        this.setMaxWidth(Region.USE_PREF_SIZE);
        this.setMaxHeight(Region.USE_PREF_SIZE);
        this.setPrefColumns(2);
    }
}
