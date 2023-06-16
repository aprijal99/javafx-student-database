package student.database.component.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import org.springframework.stereotype.Component;

@Component
public class LoginForm extends VBox {
    public LoginForm() {
        Image logo = new Image("images/student-database-logo-150.png", 50, 50, true, true);
        ImageView logoView = new ImageView(logo);

        Text loginFormTitle = new Text("Login to The Dashboard");
        loginFormTitle.setFill(Color.WHITE);
        loginFormTitle.setFont(Font.font("Arial", FontWeight.BLACK, 24));

        VBox titleContainer = new VBox(loginFormTitle);
        VBox.setMargin(titleContainer, new Insets(25, 0, 25, 0));
        titleContainer.setAlignment(Pos.CENTER);

        this.getChildren().addAll(logoView, titleContainer);

        this.setLoginFormStyle();
    }

    private void setLoginFormStyle() {
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(0, 0, 0, 100));
    }
}
