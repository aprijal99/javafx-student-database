package student.database.configuration;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import student.database.container.LoginContainer;

@Component
public class StageListener implements ApplicationListener<StageReadyEvent> {
    private final LoginContainer loginContainer;

    public StageListener(LoginContainer loginContainer) {
        this.loginContainer = loginContainer;
    }

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        HBox hBox = new HBox(loginContainer);
        hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-background-color: #121212;");

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setContent(hBox);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setStyle("-fx-background-color: transparent;");

        VBox root = new VBox(scrollPane);
        VBox.setVgrow(scrollPane, Priority.ALWAYS);
        root.setFillWidth(true);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #121212;");

        Scene scene = new Scene(root);

        Stage stage = event.getStage();
        stage.setScene(scene);
        stage.setMinWidth(450);
        stage.setMinHeight(450);
        stage.setWidth(1000);
        stage.setHeight(700);
        stage.show();
    }
}
