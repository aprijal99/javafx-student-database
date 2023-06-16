package student.database.container;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import org.springframework.stereotype.Component;
import student.database.component.login.LoginImage;

@Component
public class LoginContainer extends GridPane {
    private final LoginImage loginImage;

    public LoginContainer(LoginImage loginImage) {
        this.loginImage = loginImage;

        this.layoutChildrenNodes();
    }

    private void layoutChildrenNodes() {
        this.setBackground(new Background(new BackgroundFill(Color.web("#121212"), null, null)));
        this.setPrefSize(900, 700);

        HBox hBox2 = new HBox();
        hBox2.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));

        this.add(loginImage, 0, 0);
        this.add(hBox2, 1, 0);

        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(100);
        this.getRowConstraints().add(rc);

        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(50);
        this.getColumnConstraints().addAll(cc, cc);
    }
}
