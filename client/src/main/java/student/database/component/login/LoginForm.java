package student.database.component.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import student.database.component.form.CustomPasswordField;
import student.database.component.form.CustomTextField;

import java.io.IOException;

@Component
public class LoginForm extends VBox {
    public LoginForm(CustomTextField loginTextField, CustomPasswordField passwordField) throws IOException {
        Image logo = new Image("images/student-database-logo-150.png", 50, 50, true, true);
        ImageView logoView = new ImageView(logo);

        Text loginFormTitle = new Text("Welcome");
        loginFormTitle.setFill(Color.WHITE);
        loginFormTitle.setFont(Font.font("Arial", FontWeight.BLACK, 24));

        Text loginFormSubTitle = new Text("Login to go to the dashboard");
        loginFormSubTitle.setFill(Color.WHITE);
        loginFormSubTitle.setFont(Font.font("Arial", FontWeight.NORMAL, 16));

        VBox titleContainer = new VBox(loginFormTitle, loginFormSubTitle);
        VBox.setMargin(titleContainer, new Insets(25, 0, 50, 0));
        titleContainer.setSpacing(10);
        titleContainer.setAlignment(Pos.CENTER);

        loginTextField.setPromptText("Username or Email");
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Login");
        loginButton.setMaxWidth(Double.MAX_VALUE);
        loginButton.setCursor(Cursor.HAND);
        loginButton.setFocusTraversable(false);
        loginButton.getStyleClass().add("button");
        loginButton.setOnMouseClicked(e -> loginButton.requestFocus());

        VBox formContainer = new VBox(loginTextField, passwordField, loginButton);
        formContainer.setSpacing(15);
        formContainer.setFillWidth(true);
        formContainer.setPrefWidth(300);
        formContainer.setMinWidth(300);
        formContainer.getStylesheets().add(new ClassPathResource("styles/form.css").getURL().toString());

        Hyperlink askForgotPassword = new Hyperlink("Forgot password?");
        askForgotPassword.setTextFill(Color.web("rgb(0, 107, 203)"));
        askForgotPassword.setFocusTraversable(false);
        askForgotPassword.setVisited(true);
        askForgotPassword.setOnMouseClicked(e -> askForgotPassword.requestFocus());
        askForgotPassword.setBorder(Border.EMPTY);

        Hyperlink askSignUp = new Hyperlink("Don't have an account? Sign up");
        askSignUp.setTextFill(Color.web("rgb(0, 107, 203)"));
        askSignUp.setFocusTraversable(false);
        askSignUp.setVisited(true);
        askSignUp.setOnMouseClicked(e -> askForgotPassword.requestFocus());
        askSignUp.setBorder(Border.EMPTY);

        VBox askContainer = new VBox(askForgotPassword, askSignUp);
        VBox.setMargin(askContainer, new Insets(5, 0, 0, 0));
        askContainer.setSpacing(50);
        askContainer.setAlignment(Pos.CENTER);

        this.getChildren().addAll(logoView, titleContainer, formContainer, askContainer);

        this.setLoginFormStyle();
    }

    private void setLoginFormStyle() {
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(25, 50, 25, 50));
//        this.setStyle("-fx-background-color: yellow;");
    }
}
