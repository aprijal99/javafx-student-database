package student.database.configuration;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import student.database.container.Login;

@Component
public class StageListener implements ApplicationListener<StageReadyEvent> {
    private final Login login;

    public StageListener(Login login) {
        this.login = login;
    }

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Scene scene = new Scene(login);

        Stage stage = event.getStage();
        stage.setScene(scene);
        stage.show();
    }
}
