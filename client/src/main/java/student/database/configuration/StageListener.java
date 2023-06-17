package student.database.configuration;

import javafx.scene.Scene;
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
        Scene scene = new Scene(loginContainer);

        Stage stage = event.getStage();
        stage.setScene(scene);
        stage.setMinWidth(450);
        stage.setMinHeight(450);
        stage.show();
    }
}
