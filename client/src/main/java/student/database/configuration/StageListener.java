package student.database.configuration;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StageListener implements ApplicationListener<StageReadyEvent> {
    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Button okButton = new Button("OK");
        Button cancelButton = new Button("Cancel");

        HBox hBox = new HBox(10);
        hBox.setPrefSize(200, 100);
        hBox.getChildren().addAll(okButton, cancelButton);
        hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        Scene scene = new Scene(hBox);
        Stage stage = event.getStage();
        stage.setScene(scene);
        stage.setTitle("Student Database");
        stage.show();
    }
}
