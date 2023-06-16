package student.database.component.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import org.springframework.stereotype.Component;

@Component
public class LoginImage extends VBox {
    public LoginImage() {
        Image loginImage = new Image("images/login-image.png", 300, 300, true, true);
        ImageView loginImageView = new ImageView(loginImage);

        Text loginImageTitle = new Text("Manage Student Data");
        loginImageTitle.setFill(Color.WHITE);
        loginImageTitle.setFont(Font.font("Arial", FontWeight.BLACK, 20));

        Text loginImageSubTitle = new Text("All the data about high school students, study report, and their activities in one application");
        loginImageSubTitle.setFill(Color.WHITE);
        loginImageSubTitle.setFont(Font.font("Arial", FontWeight.NORMAL, 14));

        TextFlow loginImageSubTitleTextFlow = new TextFlow(loginImageSubTitle);
        loginImageSubTitleTextFlow.setMaxWidth(300);
        loginImageSubTitleTextFlow.setLineSpacing(5);
        loginImageSubTitleTextFlow.setTextAlignment(TextAlignment.CENTER);

        VBox titleContainer = new VBox(loginImageTitle, loginImageSubTitleTextFlow);
        VBox.setMargin(titleContainer, new Insets(25, 0, 0, 0));
        titleContainer.setAlignment(Pos.CENTER);
        titleContainer.setSpacing(15);

        this.getChildren().addAll(loginImageView, titleContainer);

        this.setLoginImageStyles();
    }

    private void setLoginImageStyles() {
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(0, 100, 0, 0));
    }
}
