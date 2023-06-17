package student.database.component.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import org.springframework.stereotype.Component;
import student.database.component.form.CustomTextField;

@Component
public class LoginForm extends VBox {
    public LoginForm(CustomTextField customTextField) {
        Image logo = new Image("images/student-database-logo-150.png", 50, 50, true, true);
        ImageView logoView = new ImageView(logo);

        Text loginFormTitle = new Text("Login to The Dashboard");
        loginFormTitle.setFill(Color.WHITE);
        loginFormTitle.setFont(Font.font("Arial", FontWeight.BLACK, 24));

        VBox titleContainer = new VBox(loginFormTitle);
        VBox.setMargin(titleContainer, new Insets(25, 0, 50, 0));
        titleContainer.setAlignment(Pos.CENTER);

        customTextField.setPromptText("Username or Email");

        PasswordField password = new PasswordField();
        password.setFocusTraversable(false);
        password.setPromptText("Password");
        password.setStyle("-fx-background-color: #121212; -fx-text-fill: white;");
        password.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
        password.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(1))));
        password.setPadding(new Insets(15, 10, 15, 10));
        password.focusedProperty().addListener((observableValue, aBoolean, t1) -> {
            if (t1) {
                password.setBorder(new Border(new BorderStroke(Color.web("#006bcb"), BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(1))));;
            } else {
                password.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(1))));;
            }
        });

        Button loginButton = new Button("Login");
        loginButton.setMaxWidth(Double.MAX_VALUE);
        loginButton.setCursor(Cursor.HAND);
        loginButton.setFocusTraversable(false);

        VBox formContainer = new VBox(customTextField, password, loginButton);
        formContainer.setSpacing(15);
        formContainer.setFillWidth(true);

        this.getChildren().addAll(logoView, titleContainer, formContainer);

        this.setLoginFormStyle();
    }

    private void setLoginFormStyle() {
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(0, 0, 0, 100));
    }
}
